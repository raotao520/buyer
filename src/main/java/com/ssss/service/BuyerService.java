package com.ssss.service;

import com.ssss.dto.OrderDTO;

/**
 * 买家
 * @author ：sss
 * @Date ：Created in 23:32 2018/12/16
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancalOrder(String openid, String orderId);
}
