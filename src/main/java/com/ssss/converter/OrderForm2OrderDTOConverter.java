package com.ssss.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ssss.dataobject.OrderDetail;
import com.ssss.dto.OrderDTO;
import com.ssss.enums.ResultEnum;
import com.ssss.exception.BuyerException;
import com.ssss.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 21:46 2018/12/16
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();


        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        }catch (Exception e) {
            log.error("【对象转换】错误， String={}", orderForm.getItems());
            throw new BuyerException(ResultEnum.PRAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}
