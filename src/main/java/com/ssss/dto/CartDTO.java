package com.ssss.dto;

import lombok.Data;

/**
 * @author ：sss
 * @Date ：Created in 22:37 2018/12/6
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     * */
    private String productId;

    /**
     * 商品数量
     * */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
