package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Salary;

import java.util.List;

public interface ISalaryService {
    List<Salary> findall();

    Salary search(String name);

    Salary select(int id);

    int insert1(int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary);

    int insert(int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name);

    int update(int id,int basicSalary,int bonus,int lunchSalary,int trafficSalary,int allSalary,int pensionBase,float pensionPer,int medicalBase,float medicalPer,int accumulationFundBase,float accumulationFundPer,String name);

    int delete(int id);
}
