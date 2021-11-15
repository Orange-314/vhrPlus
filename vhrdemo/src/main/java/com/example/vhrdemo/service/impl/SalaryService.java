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
    public int insert1(int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary) {
        return iSalaryDao.insert1(basicSalary,bonus,lunchSalary,trafficSalary,allSalary);
    }

    @Override
    public int insert(int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name) {
        return iSalaryDao.insert(basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name);
    }

    @Override
    public int update(int id,int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name) {
        return iSalaryDao.update(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name);
    }

    @Override
    public int delete(String name) {
        return iSalaryDao.delete(name);
    }
}
