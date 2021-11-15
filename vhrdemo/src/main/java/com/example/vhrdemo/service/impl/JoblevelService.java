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
    public List<Joblevel> findall() {
        return iJoblevelDao.findall();
    }

    @Override
    public Joblevel searchDetail(String name, String titleLevel) {
        return iJoblevelDao.searchDetail(name, titleLevel);
    }

    @Override
    public int updateName(String name, String titleLevel) {
        return iJoblevelDao.updateName(name, titleLevel);
    }

    @Override
    public int updateTitlelevel(String name, String titleLevel) {
        return iJoblevelDao.updateTitlelevel(name, titleLevel);
    }

    @Override
    public int insert(int id,String name, String titleLevel) {
        return iJoblevelDao.insert(id, name, titleLevel);
    }

    @Override
    public int delete(String name) {
        return iJoblevelDao.delete(name);
    }

}
