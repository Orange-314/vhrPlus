package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Joblevel;

import java.util.List;

public interface IJoblevelService {
    List<Joblevel> findall();

    Joblevel searchDetail(String name, String titleLevel);

    int updateName(String name, String titleLevel);

    int updateTitlelevel(String name, String titleLevel);

    int insert(int id,String name, String titleLevel);

    int delete(String name);


}
