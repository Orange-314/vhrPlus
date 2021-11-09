package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.entity.Salary;

import java.util.List;

public interface ISalaryService {
    List<Salary> findall();

    Salary search(String name);

    Salary insert(int id,String name);

    Salary delete(String name);
}
