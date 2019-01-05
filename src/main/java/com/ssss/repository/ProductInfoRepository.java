package com.ssss.repository;

import com.ssss.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 21:32 2018/12/1
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据id查商品
     * @param productId
     * @return
     */
    ProductInfo findByProductId(String productId);

    /**
     * 根据状态查商品
     * @param categoryStatus
     * @return
     */
    List<ProductInfo> findByCategoryStatus(Integer categoryStatus);
}
