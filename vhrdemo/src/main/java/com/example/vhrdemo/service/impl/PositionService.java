package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IPositionDao;
import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionDao iPositionDao ;

    @Override
    public Position search(int id) {
        return iPositionDao.search(id);
    }

    @Override
    public int insert(int id,String name) {
        return iPositionDao.insert(id,name);
    }
}
