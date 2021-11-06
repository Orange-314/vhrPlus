package com.example.vhrdemo.service.impl;


import com.example.vhrdemo.dao.IRoleDao;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleDao iRoleDao ;

    @Override
    public Role search(int id) {
        return iRoleDao.search(id);
    }

    @Override
    public Role insert(int id,String name,String nameZh) {
        return iRoleDao.insert(id,name,nameZh);
    }

    @Override
    public Role update(String name,String nameZh) {
        return iRoleDao.update(name,nameZh);
    }

    @Override
    public Role update2(String name,String nameZh) {
        return iRoleDao.update2(name,nameZh);
    }

    @Override
    public Role delete(int id) {
        return iRoleDao.delete(id);
    }
}
