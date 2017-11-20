package com.test.response;

import java.io.Serializable;

public class RestResponse{
    Long code;
    String message;
    public RestResponse(){}

    public RestResponse(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
