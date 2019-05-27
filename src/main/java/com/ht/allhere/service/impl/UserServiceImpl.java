package com.ht.allhere.service.impl;

import com.ht.allhere.dao.UserDao;
import com.ht.allhere.pojo.entity.User;
import com.ht.allhere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> listAllUser() {
        return userDao.getAllUsers();
    }

    @Override
    public int activeUser(int id) {
        User user = new User();
        user.setId(id);
        user.setStatus(1);
        return userDao.updateUser(user);
    }

    @Override
    public int disableUser(int id) {
        User user = new User();
        user.setId(id);
        user.setStatus(0);
        return userDao.updateUser(user);
    }

}
