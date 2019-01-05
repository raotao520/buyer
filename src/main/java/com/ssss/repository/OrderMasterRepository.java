package com.ssss.repository;

import com.ssss.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：sss
 * @Date ：Created in 16:36 2018/12/5
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    /**
     * 根据用户openid分页查询订单
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

    OrderMaster findByOrderId(String OrderId);
}
