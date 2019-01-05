package com.ssss.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author ：sss
 * @Date ：Created in 11:28 2018/12/4
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
