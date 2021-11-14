package com.example.vhrdemo.service.impl;


import com.example.vhrdemo.dao.IRoleDao;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.entity.Salary;
import com.example.vhrdemo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleDao iRoleDao ;

    @Override
    public Role search(int id) {
        return iRoleDao.search(id);
    }

    @Override
    public List<Role> findall() {
        return iRoleDao.findall();
    }

    @Override
    public int insert(int id,String name,String nameZh) {
        return iRoleDao.insert(id,name,nameZh);
    }

    @Override
    public int update(String name,String nameZh) {
        return iRoleDao.update(name,nameZh);
    }

    @Override
    public int update2(String name,String nameZh) {
        return iRoleDao.update2(name,nameZh);
    }

    @Override
    public int delete(int id) {
        return iRoleDao.delete(id);
    }
}
