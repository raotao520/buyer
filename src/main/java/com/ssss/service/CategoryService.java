package com.ssss.service;

import com.ssss.dataobject.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 * 类目
 * @author ：sss
 * @Date ：Created in 19:47 2018/12/1
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
