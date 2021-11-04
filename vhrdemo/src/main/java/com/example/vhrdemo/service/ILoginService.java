package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Login;
import com.example.vhrdemo.entity.Resp;
import org.springframework.web.multipart.MultipartFile;


public interface ILoginService {
    Login login(String username, String password);
    Resp<String> upload(MultipartFile file);
}
