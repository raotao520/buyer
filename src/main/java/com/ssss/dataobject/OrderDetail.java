package com.ssss.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * 订单详情表
 * @author ：sss
 * @Date ：Created in 16:14 2018/12/5
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    /** 订单*/
    @Id
    private String detailId;

    /** 订单ID*/
    private String orderId;

    /** 产品ID*/
    private String productId;

    /** 商品名*/
    private String productName;

    /** 商品价格*/
    private BigDecimal productPrice;

    /** 商品数量*/
    private Integer productQuantity;

    /** 商品图片*/
    private String productIcon;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    public OrderDetail() {
    }

    public OrderDetail(String detailId, String orderId, String productId, String productName, BigDecimal productPrice, Integer productQuantity, String productIcon, Date createTime, Date updateTime) {
        this.detailId = detailId;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productIcon = productIcon;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
