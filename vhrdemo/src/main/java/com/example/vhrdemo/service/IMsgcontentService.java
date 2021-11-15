package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.entity.Role;

import java.util.List;

public interface IMsgcontentService {
    Msgcontent search(int id);

    List<Msgcontent> findall();

    int insert(int id,String title,String message);

    int updateid(int id, String title);

    int updatetitle(int id, String title);

    int delete(int id);
}
