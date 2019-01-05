package com.ssss.repository;

import com.ssss.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 18:56 2018/11/30
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据给出的编号表查询出对应的编号商品表
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 根据Id查类目
     * @param categoryId
     * @return
     */
    ProductCategory findByCategoryId(Integer categoryId);
}
