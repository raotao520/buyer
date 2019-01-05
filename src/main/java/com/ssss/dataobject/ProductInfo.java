package com.ssss.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * @author ：sss
 * @Date ：Created in 21:19 2018/12/1
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**名字*/
    private String productName;

    /**单价*/
    private BigDecimal productPrice;

    /**库存*/
    private Integer productStock;

    /**描述*/
    private String productDescription;

    /**图片*/
    private String productIcon;

    /**商品状态*/
    private Integer categoryStatus;

    /**编号*/
    private Integer categoryType;

    public ProductInfo() {
    }

    public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer categoryStatus, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.categoryStatus = categoryStatus;
        this.categoryType = categoryType;
    }
}
