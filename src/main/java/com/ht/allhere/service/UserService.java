package com.ht.allhere.service;

import com.ht.allhere.pojo.entity.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);
    public List<User> listAllUser();
    public int activeUser(int id);
    public int disableUser(int id);
}
