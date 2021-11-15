package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IAppraiseDao;
import com.example.vhrdemo.entity.Appraise;
import com.example.vhrdemo.service.IAppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class AppraiseService implements IAppraiseService {
    @Autowired
    private IAppraiseDao iAppraiseDao;

    @Override
    public Appraise search(int eid) {
        return iAppraiseDao.search(eid);
    }

    @Override
    public int update(int eid,Date appDate, String appResult, String appContent, String remark) {
        return iAppraiseDao.update(eid, appDate, appResult, appContent, remark);
    }

    @Override
    public int insert(int eid,Date appDate, String appResult, String appContent, String remark) {
        return iAppraiseDao.insert(eid, appDate, appResult, appContent, remark);
    }

    @Override
    public int delete(int eid) {
        return iAppraiseDao.delete(eid);
    }
}
