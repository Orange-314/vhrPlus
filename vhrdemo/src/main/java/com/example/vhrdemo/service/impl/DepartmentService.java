package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IDepartmentDao;
import com.example.vhrdemo.entity.Department;
import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private IDepartmentDao iDepartmentDao;

    @Override
    public List<Department> findall() {
        return iDepartmentDao.findall();
    }
}
