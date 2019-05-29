package com.inspur.dubbo.user.dto;

import java.io.Serializable;

/**
 */
public class Response implements Serializable{

    private static final long serialVersionUID = 5849422057408019488L;
    private String code;

    private String memo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
