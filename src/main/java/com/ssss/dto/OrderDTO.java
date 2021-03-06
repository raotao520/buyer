package com.ssss.dto;

import com.ssss.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 21:36 2018/12/6
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** 订单ID*/
    private String orderId;

    /** 买家名字*/
    private String buyerName;

    /** 买家电话*/
    private String buyerPhone;

    /** 买家地址*/
    private String buyerAddress;

    /** 买家微信openid*/
    private String buyerOpenid;

    /** 订单总金额*/
    private BigDecimal orderAmount;

    /** 订单状态*/
    private Integer orderStatus;

    /** 支付状态*/
    private Integer payStatus;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
