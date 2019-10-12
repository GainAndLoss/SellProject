package com.example.sell.dataObject;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;

    private Timestamp createTime;

    private Timestamp updateTime;

    public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productIcon, Integer categoryType,Integer productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productIcon = productIcon;
        this.categoryType = categoryType;
        this.productStatus = productStatus;
    }

    public ProductInfo() {
    }
}
