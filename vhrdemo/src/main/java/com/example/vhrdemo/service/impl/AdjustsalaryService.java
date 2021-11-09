package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IAdjustsalaryDao;
import com.example.vhrdemo.entity.Adjustsalary;
import com.example.vhrdemo.service.IAdjustsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class AdjustsalaryService implements IAdjustsalaryService {

    @Autowired
    private IAdjustsalaryDao iAdjustsalaryDao;

    @Override
    public Adjustsalary search(int eid) {
        return iAdjustsalaryDao.search(eid);
    }

    @Override
    public int update(int eid, Date asDate, int beforeSalary, int afterSalary, String reason, String remark) {
        return iAdjustsalaryDao.update(eid, asDate, beforeSalary, afterSalary, reason, remark);
    }

    @Override
    public int insert(int eid, Date asDate, int beforeSalary, int afterSalary, String reason, String remark) {
        return iAdjustsalaryDao.insert(eid, asDate, beforeSalary, afterSalary, reason, remark);
    }

    @Override
    public int delete(int eid) {
        return iAdjustsalaryDao.delete(eid);
    }
}
