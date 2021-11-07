package com.example.vhrdemo.dao;


import com.example.vhrdemo.entity.Hr;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHrDao {
    Hr login(@Param("username") String username, @Param("password") String password);

    Hr login2(@Param("username") String username, @Param("password") String password);


    Hr update(@Param("username") String username, @Param("password") String password);

    Hr insert(@Param("id") int id, @Param("username") String username, @Param("password") String password);

    Hr regist(@Param("username") String username, @Param("password") String password);

    Hr delete(@Param("username") String username, @Param("password") String password);

    Hr login3(@Param("username") String username);

    List<Hr> findall();
}
