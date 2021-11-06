package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IJoblevelDao;
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
    public Joblevel search() {
        return iJoblevelDao.search();
    }

    @Override
    public Joblevel search2(String name, String titleLevel) { return iJoblevelDao.search2(name, titleLevel);
    }

    @Override
    public Joblevel update(String name, String titleLevel) {
        return iJoblevelDao.update(name, titleLevel);
    }

    @Override
    public Joblevel update2(String name, String titleLevel) {
        return iJoblevelDao.update2(name, titleLevel);
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
