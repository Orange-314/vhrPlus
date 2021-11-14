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
    public Salary insert1(int id,int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary) {
        return iSalaryDao.insert1(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary);
    }

    @Override
    public Salary insert(int id,int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name) {
        return iSalaryDao.insert(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name);
    }

    @Override
    public Salary update(int id,int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name) {
        return iSalaryDao.update(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name);
    }

    @Override
    public Salary delete(String name) {
        return iSalaryDao.delete(name);
    }
}
