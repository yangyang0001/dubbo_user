package com.inspur.dubbo.user.service.impl;

import com.inspur.dubbo.user.dto.UserLoginRequest;
import com.inspur.dubbo.user.dto.UserLoginResponse;
import com.inspur.dubbo.user.service.UserService;
import com.inspur.dubbo.validator.UserValidator;
import org.springframework.stereotype.Service;

/**
 * User: YANG
 * Date: 2019/5/28-16:16
 * Description: No Description
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        System.out.println("login ------------->:" + request);
        //参数校验
        UserLoginResponse response = new UserLoginResponse();
        if (!UserValidator.checkUserLoginRequest(request)) {
            response.setCode("000000");
            response.setMemo("请求参数校验失败");
            return response;
        }
        if ("root".equals(request.getName()) && "root".equals(request.getPassword())) {
            response.setCode("000001");
            return response;
        }
        response.setCode("100002");
        response.setMemo("登录失败,帐号或密码错误");
        return response;
    }
}
