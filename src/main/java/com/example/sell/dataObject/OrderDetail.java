package com.example.sell.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data
@DynamicUpdate
public class OrderDetail {
    /*详情编号*/
    @Id
//    为什么设置自增会在插入主键报错应该怎么改
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String detailId;
    /*订单id*/
    private String orderId;
    /*商品id*/
    private String productId;
    /*商品名称*/
    private String productName;
    /*产品价格*/
    private BigDecimal productPrice;
    /*商品数量*/
    private int productQuantity;
    /*商品图片*/
    private String productIcon;
    /*创建时间*/
    private Date createTime;
    /*修改时间*/
    private Date updateTime;
}
