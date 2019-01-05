package com.ssss.repository;

import com.ssss.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findByCategoryId(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void savaTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",5);
        System.out.println(productCategory.toString());
       ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
/*        Assert.assertNotEquals(null,result);*/
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(4,5,6);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}