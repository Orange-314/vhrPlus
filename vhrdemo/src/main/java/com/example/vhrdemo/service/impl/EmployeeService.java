package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IEmployeeDao;
import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeDao iEmployeeDao;

    @Override
    public List<Employee> findall() {
        return iEmployeeDao.findall();
    }

    @Override
    public List<Employee> findDetail() {
        return iEmployeeDao.findDetail();
    }

    @Override
    public int insert(String name, String gender, Date birthday,String idCard,String wedlock,int nationId,String nativePlace,int politicId,String email,String phone,String address,int departmentId,int jobLevelId,int posId,String engageForm,String tiptopDegree,String specialty,String school,Date beginDate,double contractTerm,Date conversionTime,Date beginContract,Date endContract) {
        return iEmployeeDao.insert(name,gender,birthday,idCard,wedlock,nationId,nativePlace,politicId,email,phone,address,departmentId,jobLevelId,posId,engageForm,tiptopDegree,specialty,school,beginDate,contractTerm,conversionTime,beginContract,endContract);
    }

    @Override
    public Employee insert2(Date birthday) {
        return iEmployeeDao.insert2(birthday);
    }

}
