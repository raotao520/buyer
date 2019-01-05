package com.ssss.repository;

import com.ssss.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){

        ProductInfo productInfo = new ProductInfo("123456","皮蛋瘦肉粥",new BigDecimal(3.2),100,"haohe","http://xxx.jpg",0,2);

        ProductInfo result = repository.save(productInfo);

        Assert.assertNotNull(result);


    }

    @Test
    public void findByProductId() {
    }

    @Test
    public void findByCategoryStatus() {
        List<ProductInfo> productInfos = repository.findByCategoryStatus(0);
        Assert.assertNotEquals(0,productInfos.size());
    }
}