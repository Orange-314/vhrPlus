package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Nation;
import com.example.vhrdemo.entity.Politicsstatus;

public interface IPoliticsstatusService {

    Politicsstatus search(int id);

    Politicsstatus insert(int id, String name);

    Politicsstatus update(int id, String name);

    Politicsstatus delete(int id);
}
