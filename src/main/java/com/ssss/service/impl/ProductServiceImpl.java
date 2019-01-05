package com.ssss.service.impl;

import com.ssss.dataobject.ProductInfo;
import com.ssss.dto.CartDTO;
import com.ssss.enums.ProductStatusEnum;
import com.ssss.enums.ResultEnum;
import com.ssss.exception.BuyerException;
import com.ssss.repository.ProductInfoRepository;
import com.ssss.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 11:25 2018/12/4
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    /**
     * 查询一个商品详情
     * @param productId
     * @return
     */
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findByProductId(productId);
    }

    /**
     * 查询所有在架商品
     *
     * @return
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByCategoryStatus(ProductStatusEnum.UP.getCode());
    }

    /**
     * 分页查询商品详情
     * @param pageable
     * @return
     */
    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    /**
     * 保存修改商品
     * @param productInfo
     * @return
     */
    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = repository.findByProductId(cartDTO.getProductId());
            if (productInfo == null) {
                throw new BuyerException(ResultEnum.PRODUCT_NOT_EXIT);
            }
            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }

    /**
     *
     * @param cartDTOList
     */
    @Override
    @Transactional(rollbackFor=Exception.class)
    public void decreaseStock(List<CartDTO> cartDTOList) {

        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = repository.findByProductId(cartDTO.getProductId());
            if (productInfo == null) {
                throw new BuyerException(ResultEnum.PRODUCT_NOT_EXIT);
            }
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if (result < 0) {
                throw new BuyerException(ResultEnum.PRODUCT_STOCK_ERROR);
            }else {
                productInfo.setProductStock(result);
                repository.save(productInfo);
            }
        }
    }
}
