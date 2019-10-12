package com.example.sell.exception;

import com.example.sell.enums.BuyExceptionEnum;

public class SellException extends RuntimeException {

    private int code;

    public SellException(BuyExceptionEnum buyExceptionEnum) {
        super(buyExceptionEnum.getMsg());
        this.code = code;
    }
}
