package com.example.vhrdemo.service;


import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.entity.Salary;

import java.util.List;

public interface IRoleService {

    Role search(int id);

    List<Role> findall();

    int insert(int id,String name,String nameZh);

    int update(String name, String nameZh);

    int update2(String name, String nameZh);

    int delete(int id);
}
