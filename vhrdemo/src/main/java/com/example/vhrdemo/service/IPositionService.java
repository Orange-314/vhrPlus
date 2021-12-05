package com.example.vhrdemo.service;


import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.entity.Role;

import java.util.List;

public interface IPositionService {

    Position search(int id);

    List<Position> findall();

    int insert(int id,String name);

    int update(int id,String name);

    int update1(int id,String name);

    int delete(int id);

}
