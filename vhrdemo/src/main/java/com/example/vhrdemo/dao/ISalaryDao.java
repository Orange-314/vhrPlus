package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Salary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISalaryDao {
    List<Salary> findall();

    Salary search(@Param("name") String name);

    Salary insert1(@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary);

    Salary insert(@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary,@Param("pensionBase")int pensionBase,@Param("pensionPer")float pensionPer,@Param("medicalBase")int medicalBase,@Param("medicalPer")float medicalPer,@Param("accumulationFundBase")int accumulationFundBase,@Param("accumulationFundPer")float accumulationFundPer,@Param("name") String name);

    Salary update(@Param("id") int id,@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary,@Param("pensionBase")int pensionBase,@Param("pensionPer")float pensionPer,@Param("medicalBase")int medicalBase,@Param("medicalPer")float medicalPer,@Param("accumulationFundBase")int accumulationFundBase,@Param("accumulationFundPer")float accumulationFundPer,@Param("name") String name);

    Salary delete(@Param("name") String name);

}
