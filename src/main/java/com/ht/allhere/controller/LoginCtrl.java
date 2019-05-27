package com.ht.allhere.controller;

import com.ht.allhere.common.Result;
import com.ht.allhere.common.ResultCode;
import com.ht.allhere.pojo.vo.UserVO;
import com.ht.allhere.utils.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginCtrl {

    @RequestMapping("/userLogin")
    public Result login(@RequestBody UserVO user) {
        if (StringUtil.isNullOrBlank(user.getUserName()) || StringUtil.isNullOrBlank(user.getPassword())) {
            return new Result(ResultCode.USER_PWD_EMPTY_ERROR);
        }
        // 获取主体
        Subject subject = SecurityUtils.getSubject();
        System.out.println(user.getUserName());
        try {
            subject.login(new UsernamePasswordToken(user.getUserName(), user.getPassword()));
        }catch (AuthenticationException e){
            return new Result(ResultCode.USER_PWD_WRONG_ERROR);
        }
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/userLogout", method = RequestMethod.GET)
    public Result logout(){
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return new Result(ResultCode.SUCCESS);
    }
}
