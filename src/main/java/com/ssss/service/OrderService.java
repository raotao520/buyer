package com.ssss.service;

import com.ssss.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author ：sss
 * @Date ：Created in 21:30 2018/12/6
 */

public interface OrderService {

    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单*/
    OrderDTO findOne(String orderId);

    /** 查询查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** 取消订单*/
    OrderDTO cancal(OrderDTO orderDTO);

    /** 完结订单*/
    OrderDTO finish(OrderDTO orderDTO);

    /** 支付订单*/
    OrderDTO paid(OrderDTO orderDTO);

}
