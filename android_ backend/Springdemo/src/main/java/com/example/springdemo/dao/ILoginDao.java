package com.example.springdemo.dao;

import com.example.springdemo.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {
    Login login(@Param("account") String account, @Param("password")String);
}
