package com.example.sell.dataObject;


import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@DynamicUpdate
@Data
public class OrderMaster {
    /*订单id*/
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /*支付状态*/
    private  Integer payStatus = PayStatusEnum.WAIT.getCode();
    /*创建时间*/
    @UpdateTimestamp
    private Date createTime;
    /*修改时间*/
    @UpdateTimestamp
    private Date updateTime;


}
