package com.ssss.service.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ssss.dataobject.ProductInfo;
import com.ssss.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfos = productService.findUpAll();
        Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void findAll() {
        Pageable request = PageRequest.of(0,2);

        Page<ProductInfo> productInfos = productService.findAll(request);

        System.out.println(productInfos.getTotalElements());

        Assert.assertNotEquals(0,productInfos.getTotalElements());


    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo("123457","皮皮虾",new BigDecimal(3.2),100,"好菜","http://xxx.jpg", ProductStatusEnum.DOWN.getCode(),2);
        productService.save(productInfo);
    }
}