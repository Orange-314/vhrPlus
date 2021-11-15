package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Employee;

import java.sql.Date;
import java.util.List;
public interface IEmployeeService {

    List<Employee> findall();

    Employee insert(String name, String gender, Date birthday,String idCard,String wedlock,int nationId,String nativePlace,int politicId,String email,String phone,String address,int departmentId,int jobLevelId,int posId,String engageForm,String tiptopDegree,String specialty,String school,Date beginDate,double contractTerm,Date conversionTime,Date beginContract,Date endContract);

    Employee insert2(Date birthday);

}
