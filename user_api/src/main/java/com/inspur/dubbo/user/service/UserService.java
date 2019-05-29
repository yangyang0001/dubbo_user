package com.inspur.dubbo.user.service;

import com.inspur.dubbo.user.dto.UserLoginRequest;
import com.inspur.dubbo.user.dto.UserLoginResponse;

/**
 * YANG
 */
public interface UserService {

    /**
     * 登录
     * @param request
     * @return
     */
    public UserLoginResponse login(UserLoginRequest request);
}
