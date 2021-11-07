package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Employee> findall(){
        return iEmployeeService.findall();
    }
}
