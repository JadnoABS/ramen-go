package com.jadnobarbosa.ramengo.exception;

import lombok.Data;

@Data
public class ApiError {
    private String error;

    public ApiError(String error) {
        this.error = error;
    }
}
