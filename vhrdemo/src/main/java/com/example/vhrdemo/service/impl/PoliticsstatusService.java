package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IPoliticsstatusDao;
import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.service.IPoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
