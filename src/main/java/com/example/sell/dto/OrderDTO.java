package com.example.sell.dto;

import com.example.sell.dataObject.OrderDetail;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String orderId;
    /*买家名字*/
    private String buyerName;
    /*买家联系方式*/
    private String buyerPhone;
    /*买家地址*/
    private String buyerAddress;
    /*买家openId*/
    private String buyerOpenid;
    /*订单总金额*/
    private BigDecimal orderAmount;
    /*订单状态*/
    private Integer orderStatus ;
    /*支付状态*/
    private  Integer payStatus ;
    /*创建时间*/
    @UpdateTimestamp
    private Date createTime;
    /*修改时间*/
    @UpdateTimestamp
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
