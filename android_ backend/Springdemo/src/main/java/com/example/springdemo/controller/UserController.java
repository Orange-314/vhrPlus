package com.example.springdemo.controller;

import com.example.springdemo.entity.User;
import com.example.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {//定义路径
    @Autowired
        private IUserService iUserService;
    @RequestMapping(value = "/user", method = RequestMethod.POST)
        private User user(@RequestParam String account, @RequestParam String password){
            return iUserService.user(account,password);
        }


}
