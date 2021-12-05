package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.entity.Position;

import java.util.List;

public interface IPoliticsstatusService {

    Politicsstatus search(int id);

    List<Politicsstatus> findall();

    int insert(int id, String name);

    int update(int id, String name);

    int update1(int id, String name);

    int delete(int id);
}
