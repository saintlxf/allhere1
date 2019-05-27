package com.ht.allhere.pojo.vo;

import com.ht.allhere.pojo.entity.User;

public class UserVO{
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

    public UserVO(){

    }
    public UserVO(User user){
        this.id = user.getId();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.phone = user.getPhone();
        this.email = user.getEmail();
        this.status = user.getStatus();

    }
}
