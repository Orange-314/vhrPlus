package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IJoblevelDao;
import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.service.IJoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class JoblevelService implements IJoblevelService {
    @Autowired(required = false)
    private IJoblevelDao iJoblevelDao;

    @Override
    public List<Joblevel> findall() {
        return iJoblevelDao.findall();
    }

    @Override
    public Joblevel searchDetail(String name, String titleLevel) {
        return iJoblevelDao.searchDetail(name, titleLevel);
    }

    @Override
    public Joblevel updateName(String name, String titleLevel) {
        return iJoblevelDao.updateName(name, titleLevel);
    }

    @Override
    public Joblevel updateTitlelevel(String name, String titleLevel) {
        return iJoblevelDao.updateTitlelevel(name, titleLevel);
    }

    @Override
    public Joblevel insert(int id,String name, String titleLevel) {
        return iJoblevelDao.insert(id, name, titleLevel);
    }

    @Override
    public Joblevel delete(String name, String titleLevel) {
        return iJoblevelDao.delete(name, titleLevel);
    }

    @Override
    public List<Joblevel> login3(int id) {
        return null;
    }
}
