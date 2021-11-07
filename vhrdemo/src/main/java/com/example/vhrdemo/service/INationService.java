package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Login;
import com.example.vhrdemo.entity.Resp;
import org.springframework.web.multipart.MultipartFile;
import com.example.vhrdemo.entity.Nation;

public interface INationService {
    Nation search(String name);

    Nation update(int id, String name);

    Nation insert(int id, String name);

    Nation delete(String name);

}