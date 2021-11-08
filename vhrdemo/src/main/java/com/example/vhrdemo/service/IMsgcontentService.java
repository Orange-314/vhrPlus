package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Msgcontent;

public interface IMsgcontentService {
    Msgcontent search(int id);

    Msgcontent insert(int id,String title,String message);

    Msgcontent updateid(int id, String title);

    Msgcontent updatetitle(int id, String title);

    Msgcontent delete(int id);
}
