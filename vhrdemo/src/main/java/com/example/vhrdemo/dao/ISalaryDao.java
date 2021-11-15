package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Salary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ISalaryDao {
    List<Salary> findall();

    Salary search(@Param("name") String name);

    int insert1(@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary);

    int insert(@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary,@Param("pensionBase")int pensionBase,@Param("pensionPer")float pensionPer,@Param("medicalBase")int medicalBase,@Param("medicalPer")float medicalPer,@Param("accumulationFundBase")int accumulationFundBase,@Param("accumulationFundPer")float accumulationFundPer,@Param("name") String name);

    int update(@Param("id") int id,@Param("basicSalary") int basicSalary,@Param("bonus") int bonus,@Param("lunchSalary") int lunchSalary,@Param("trafficSalary")int trafficSalary,@Param("allSalary")int allSalary,@Param("pensionBase")int pensionBase,@Param("pensionPer")float pensionPer,@Param("medicalBase")int medicalBase,@Param("medicalPer")float medicalPer,@Param("accumulationFundBase")int accumulationFundBase,@Param("accumulationFundPer")float accumulationFundPer,@Param("name") String name);

    int delete(@Param("name") String name);

}
