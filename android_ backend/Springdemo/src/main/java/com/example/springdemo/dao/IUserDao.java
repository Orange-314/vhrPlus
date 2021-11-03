package com.example.springdemo.dao;

import com.example.springdemo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User user(@Param("account") String account,@Param("password") String password);
}
