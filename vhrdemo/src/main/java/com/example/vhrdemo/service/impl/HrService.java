package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IHrDao;
import com.example.vhrdemo.entity.Hr;
import com.example.vhrdemo.service.IHrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrService implements IHrService {
    @Autowired
    private IHrDao iHrDao;

    @Override
    public Hr login(String username, String password) {
        return iHrDao.login(username, password);
    }

    @Override
    public Hr login2(String username, String password) {
        return iHrDao.login2(username, password);
    }

    @Override
    public Hr login3(String username) {
        return iHrDao.login3(username);
    }

    @Override
    public Hr update(String username, String password) {
        return iHrDao.update(username, password);
    }

    @Override
    public Hr insert(int id,String username, String password) {
        return iHrDao.insert(id, username, password);
    }

    @Override
    public Hr regist(String username, String password) {
        return iHrDao.regist(username,password);
    }

    @Override
    public Hr delete(String username, String password) {
        return iHrDao.delete(username, password);
    }


}
