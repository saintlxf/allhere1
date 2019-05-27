package com.ht.allhere.dao;

import com.ht.allhere.pojo.entity.User;

import java.util.List;

public interface UserDao {
    public User findUserByName(String username);
    public int addUser(User user);
    public List<User> getAllUsers();
    public int updateUser(User user);
}
