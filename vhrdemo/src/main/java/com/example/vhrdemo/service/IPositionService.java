package com.example.vhrdemo.service;


import com.example.vhrdemo.entity.Position;

public interface IPositionService {

    Position search(int id);

    int insert(int id,String name);

    int update(int id,String name);

    int delete(int id);

}
