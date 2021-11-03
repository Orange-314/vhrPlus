package com.example.springdemo.service.impl;

import com.example.springdemo.dao.IUserDao;
import com.example.springdemo.entity.User;
import com.example.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public User user(String account, String password) {
        return iUserDao.user(account,password);
    }
}
