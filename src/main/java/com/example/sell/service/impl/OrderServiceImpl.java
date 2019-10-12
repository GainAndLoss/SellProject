package com.example.sell.service.impl;

import com.example.sell.dataObject.OrderDetail;
import com.example.sell.dataObject.ProductInfo;
import com.example.sell.dto.OrderDTO;
import com.example.sell.enums.BuyExceptionEnum;
import com.example.sell.exception.SellException;
import com.example.sell.repository.OrderDetailRepostory;
import com.example.sell.service.OrderService;
import com.example.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductInfoService productInfoService;
    private OrderDetailRepostory orderDetailRepostory;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);
        //1.查询商品（数量，价格）
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productInfoService.findById(orderDetail.getProductId());
            if (productInfo == null) {
                throw new SellException(BuyExceptionEnum.PRODUCT_NOT_EXIST);
            };
            // 2.计算总价
            orderAmount =orderDetail.getProductPrice().multiply(new BigDecimal(orderDetail.getProductQuantity())).add(orderAmount);

            //订单详情入库
            orderDetail.setDetailId("");//此处使用序列
            orderDetail.setOrderId("");//此处使用序列
            orderDetailRepostory.save(orderDetail);
        }

        //3.写入订单数据库
        //4.扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
