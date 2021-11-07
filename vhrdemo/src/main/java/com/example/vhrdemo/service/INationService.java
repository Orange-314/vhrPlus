package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.entity.Nation;

import java.util.List;

public interface INationService {
    List<Nation> findall();

    Nation search(String name);

    Nation update(int id, String name);

    Nation insert(int id, String name);

    Nation delete(String name);

}