package com.inspur.dubbo.validator;

import com.inspur.dubbo.user.dto.UserLoginRequest;
import org.springframework.util.StringUtils;

/**
 */
public class UserValidator {

    public static boolean checkUserLoginRequest(UserLoginRequest request){
        if(StringUtils.isEmpty(request.getName())||StringUtils.isEmpty(request.getPassword())){
            return false;
        }
        return true;
    }
}
