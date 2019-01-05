package com.ssss.service.impl;

import com.ssss.dto.OrderDTO;
import com.ssss.enums.ResultEnum;
import com.ssss.exception.BuyerException;
import com.ssss.service.BuyerService;
import com.ssss.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：sss
 * @Date ：Created in 23:34 2018/12/16
 */
@Slf4j
@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancalOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        if (orderDTO == null) {
            log.error("【取消订单】查不到该订单, orderId={}",orderId);
            throw new BuyerException(ResultEnum.ORDER_NO_EXIST);
        }
        return orderService.cancal(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        //判断是否是自己的订单
        if (orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("【查询订单】订单openid不一致， openid={}, orderDTO={}",openid,orderDTO);
            throw new BuyerException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
