package com.example.vhrdemo.service;


import com.example.vhrdemo.entity.Role;

public interface IRoleService {

    Role search(int id);

    int insert(int id,String name,String nameZh);

    int update(String name, String nameZh);

    int update2(String name, String nameZh);

    int delete(int id);
}
