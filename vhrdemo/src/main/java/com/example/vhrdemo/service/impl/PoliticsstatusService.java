package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IPoliticsstatusDao;
import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.service.IPoliticsstatusService;
import org.springframework.stereotype.Service;

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
    public Politicsstatus insert(int id, String name) {
        return iPoliticsstatusDao.insert(id, name);
    }

    @Override
    public Politicsstatus update(int id, String name) {
        return iPoliticsstatusDao.update(id, name);
    }

    @Override
    public Politicsstatus delete(int id) {
        return iPoliticsstatusDao.delete(id);
    }

}
