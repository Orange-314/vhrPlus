package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Nation;

import java.util.List;

public interface INationService {
    List<Nation> findall();

    Nation search(String name);

    int update(int id, String name);

    int insert(int id, String name);

    int delete(String name);

}