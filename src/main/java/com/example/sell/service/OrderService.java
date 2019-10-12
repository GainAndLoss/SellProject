package com.example.sell.service;

import com.example.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /*创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /*查询订单列表*/
    OrderDTO findOne(String orderId);

    /*取消订单*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /*完结订单*/
    OrderDTO cancel(OrderDTO orderDTO);

    /*支付订单*/
    OrderDTO paid(OrderDTO orderDTO);

}
