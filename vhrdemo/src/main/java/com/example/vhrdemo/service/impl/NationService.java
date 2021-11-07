package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.INationDao;
import com.example.vhrdemo.entity.Nation;
import com.example.vhrdemo.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationService implements INationService {
    @Autowired
    private INationDao iNationDao;


    @Override
    public Nation search(String name) {
        return iNationDao.search(name);
    }

    @Override
    public Nation update(int id, String name) {
        return iNationDao.update(id, name);
    }

    @Override
    public Nation insert(int id, String name) {
        return iNationDao.insert(id, name);
    }

    @Override
    public Nation delete(String name) {
        return iNationDao.delete(name);
    }

}
