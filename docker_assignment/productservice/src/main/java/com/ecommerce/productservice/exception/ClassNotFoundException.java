package com.ecommerce.productservice.exception;

import lombok.Data;

@Data
public class ClassNotFoundException extends RuntimeException {
    private String errorCode;
    private int status;

    public ClassNotFoundException(String message, String errorCode, int status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}