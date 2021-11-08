package com.example.vhrdemo.service;


import com.example.vhrdemo.entity.Role;

public interface IRoleService {

    Role search(int id);

    Role insert(int id,String name,String nameZh);

    Role update(String name, String nameZh);

    Role update2(String name, String nameZh);

    Role delete(int id);
}
