package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IEmployeeDao;
import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeDao iEmployeeDao;

    @Override
    public List<Employee> findall() {
        return iEmployeeDao.findall();
    }
}
