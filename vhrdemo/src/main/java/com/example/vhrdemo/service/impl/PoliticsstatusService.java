package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IPoliticsstatusDao;
import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.service.IPoliticsstatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticsstatusService implements IPoliticsstatusService {
    private final IPoliticsstatusDao iPoliticsstatusDao;

    public PoliticsstatusService(IPoliticsstatusDao iPoliticsstatusDao) {
        this.iPoliticsstatusDao = iPoliticsstatusDao;
    }

    @Override
    public Politicsstatus search(int id) {
        return iPoliticsstatusDao.search(id);
    }

    @Override
    public List<Politicsstatus> findall() {
        return iPoliticsstatusDao.findall();
    }

    @Override
    public int insert(int id, String name) {
        return iPoliticsstatusDao.insert(id, name);
    }

    @Override
    public int update(int id, String name) {
        return iPoliticsstatusDao.update(id, name);
    }

    @Override
    public int delete(int id) {
        return iPoliticsstatusDao.delete(id);
    }

}
