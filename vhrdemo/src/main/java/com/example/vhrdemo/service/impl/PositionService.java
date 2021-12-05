package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IPositionDao;
import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Resource
@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionDao iPositionDao ;

    @Override
    public List<Position> findall() {
        return iPositionDao.findall();
    }

    @Override
    public Position search(int id) {
        return iPositionDao.search(id);
    }

    @Override
    public int insert(int id,String name) {
        return iPositionDao.insert(id,name);
    }

    @Override
    public int update(int id,String name) {
        return iPositionDao.update(id,name);
    }

    @Override
    public int update1(int id,String name) {
        return iPositionDao.update1(id,name);
    }

    @Override
    public int delete(int id) {
        return iPositionDao.delete(id);
    }
}
