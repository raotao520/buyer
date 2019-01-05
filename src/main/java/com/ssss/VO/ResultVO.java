package com.ssss.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author ：sss
 * @Date ：Created in 12:10 2018/12/4
 */
@Data
public class ResultVO<T> {

    /** 错误码*/
    private Integer code;

    /** 提示信息*/
    private  String msg;

    /** 返回的具体内容*/
    private T data;
}
