package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Joblevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IJoblevelDao {
    Joblevel search();

    Joblevel searchDetail(@Param("name") String name, @Param("titleLevel") String titleLevel);

    int updateName(@Param("name") String name, @Param("titleLevel") String titleLevel);

    int updateTitlelevel(@Param("name") String name, @Param("titleLevel") String titleLevel);

    int insert(@Param("id") int id, @Param("name") String name, @Param("titleLevel") String password);

    int delete(@Param("name") String name);
    List<Joblevel> findall();
}
