package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Department;
import com.example.vhrdemo.service.IDepartmentService;
import com.example.vhrdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService iDepartmentService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Department> findall(){
        return iDepartmentService.findall();
    }
}
