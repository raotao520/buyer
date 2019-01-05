package com.ssss.enums;

import lombok.Getter;

/**
 * @author ：sss
 * @Date ：Created in 16:09 2018/12/5
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
