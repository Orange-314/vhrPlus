package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Joblevel;

import java.util.List;

public interface IJoblevelService {
    Joblevel search();

    Joblevel search2(String name, String titleLevel);

    Joblevel update(String name, String titleLevel);

    Joblevel update2(String name, String titleLevel);

    Joblevel insert(int id,String name, String titleLevel);

    Joblevel delete(String name, String titleLevel);


    List<Joblevel> login3(int id);
}
