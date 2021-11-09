package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.ISalaryDao;
import com.example.vhrdemo.entity.Salary;
import com.example.vhrdemo.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryService implements ISalaryService {
    @Autowired(required = false)
    private ISalaryDao iSalaryDao;

    @Override
    public List<Salary> findall() {
        return iSalaryDao.findall();
    }

    @Override
    public Salary search(String name) {
        return iSalaryDao.search(name);
    }

    @Override
    public Salary insert(int id,String name) {
        return iSalaryDao.insert(id, name);
    }

    @Override
    public Salary delete(String name) {
        return iSalaryDao.delete(name);
    }
}
