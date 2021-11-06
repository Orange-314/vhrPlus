package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Hr;


public interface IHrService {
    Hr login(String username, String password);

    Hr login2(String username, String password);

    Hr login3(int id);

    Hr update(String username, String password);

    Hr insert(int id,String username, String password);

    Hr regist(String username,String password);

    Hr delete(String username, String password);



}
