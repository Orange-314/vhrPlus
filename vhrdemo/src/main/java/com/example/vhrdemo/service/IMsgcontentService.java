package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Msgcontent;

public interface IMsgcontentService {
    Msgcontent search(int id);

    int insert(int id,String title,String message);

    int updateid(int id, String title);

    int updatetitle(int id, String title);

    int delete(int id);
}
