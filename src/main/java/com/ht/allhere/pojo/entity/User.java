package com.ht.allhere.pojo.entity;

import com.ht.allhere.pojo.vo.UserVO;

public class User {
    private int id;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private int status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(){

    }
    public User(UserVO userVO){
        this.userName = userVO.getUserName();
        this.password = userVO.getPassword();
        this.phone = userVO.getPhone();
        this.email = userVO.getEmail();
    }
}
