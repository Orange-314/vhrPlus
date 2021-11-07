package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Msgcontent;

public interface IMsgcontentService {
    Msgcontent search(int id);

    Msgcontent insert(int id,String title,String message);

    Msgcontent update(String name, String nameZh);

    Msgcontent update2(String name, String nameZh);

    Msgcontent delete(int id);
}
