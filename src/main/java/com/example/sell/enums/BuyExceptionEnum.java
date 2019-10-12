package com.example.sell.enums;

import lombok.Getter;

@Getter
public enum BuyExceptionEnum {
    PRODUCT_NOT_EXIST(10, "商品不存在");
    private int code;
    private String msg;

    BuyExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    };
}
