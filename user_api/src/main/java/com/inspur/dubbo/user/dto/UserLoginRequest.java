package com.inspur.dubbo.user.dto;

import java.io.Serializable;

/**
 */
public class UserLoginRequest implements Serializable{

    private static final long serialVersionUID = -2566985713832148771L;
    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
