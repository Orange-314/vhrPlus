package com.example.springdemo.service;

import com.example.springdemo.entity.User;

public interface IUserService {
    User user(String account, String password);
}
