package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Joblevel;

import java.util.List;

public interface IJoblevelService {
    Joblevel search();

    Joblevel searchDetail(String name, String titleLevel);

    Joblevel updateName(String name, String titleLevel);

    Joblevel updateTitlelevel(String name, String titleLevel);

    Joblevel insert(int id,String name, String titleLevel);

    Joblevel delete(String name, String titleLevel);


    List<Joblevel> login3(int id);
}
