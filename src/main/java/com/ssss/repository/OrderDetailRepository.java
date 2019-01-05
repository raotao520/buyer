package com.ssss.repository;

import com.ssss.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：sss
 * @Date ：Created in 16:41 2018/12/5
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

    OrderDetail findByDetailId(String detailId);
}
