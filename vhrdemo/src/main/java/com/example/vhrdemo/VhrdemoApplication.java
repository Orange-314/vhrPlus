package com.example.vhrdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vhrdemo.dao")
public class VhrdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrdemoApplication.class, args);
    }

}
