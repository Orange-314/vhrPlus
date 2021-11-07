package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Joblevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IJoblevelDao {
    Joblevel search();

    Joblevel searchDetail(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel updateName(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel updateTitlelevel(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel insert(@Param("id") int id, @Param("name") String name, @Param("titleLevel") String password);

    Joblevel delete(@Param("name") String name, @Param("titleLevel") String titleLevel);
    List<Joblevel> findall();
}
