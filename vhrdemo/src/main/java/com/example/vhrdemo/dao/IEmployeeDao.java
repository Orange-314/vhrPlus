package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeDao {
    List<Employee> findall();
}
