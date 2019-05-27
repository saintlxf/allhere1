package com.ht.allhere.controller;

import com.ht.allhere.common.Result;
import com.ht.allhere.common.ResultCode;
import com.ht.allhere.pojo.entity.User;
import com.ht.allhere.pojo.vo.UserVO;
import com.ht.allhere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCtrl {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public Result addUser(@RequestBody UserVO userVO){
        User user = new User(userVO);
        userService.addUser(user);

        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping("/register")
    public Result registerUser(@RequestBody UserVO userVO){
        User user = new User(userVO);
        user.setStatus(0);
        if(userService.addUser(user)==1) {
            return new Result(ResultCode.SUCCESS);
        }
        return new Result(ResultCode.USER_ADD_WRONG_ERROR);
    }
    @RequestMapping("/listAllUser")
    public List<UserVO> listAllUser(){
        List<UserVO> ret = new LinkedList<>();
        List<User> allUser = userService.listAllUser();
        for (User user :
                allUser) {
            ret.add(new UserVO(user));
        }
        return ret;
    }
    @RequestMapping("/activeUser")
    public Result activeUser(@RequestBody UserVO userVO){
        System.out.println(userVO.getId());
        if(userService.activeUser(userVO.getId())==1){
            return new Result(ResultCode.SUCCESS);
        }
        return new Result(ResultCode.USER_ADD_WRONG_ERROR);
    }
    @RequestMapping("/disableUser")
    public Result disableUser(@RequestBody UserVO userVO){
        System.out.println(userVO.getId());
        if(userService.disableUser(userVO.getId())==1){
            return new Result(ResultCode.SUCCESS);
        }
        return new Result(ResultCode.USER_ADD_WRONG_ERROR);
    }
}
