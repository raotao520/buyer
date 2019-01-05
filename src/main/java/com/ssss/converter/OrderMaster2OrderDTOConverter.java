package com.ssss.converter;

import com.ssss.dataobject.OrderMaster;
import com.ssss.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：sss
 * @Date ：Created in 20:50 2018/12/12
 * 把OrderMaster转为OrderDTO对象工具
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO converter(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> converter(List<OrderMaster> orderMasterList) {
       return orderMasterList.stream().map(e -> converter(e)).collect(Collectors.toList());
    }
}
