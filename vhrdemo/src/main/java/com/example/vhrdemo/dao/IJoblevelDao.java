package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Hr;
import com.example.vhrdemo.entity.Joblevel;
import org.apache.ibatis.annotations.Param;

public interface IJoblevelDao {
    Joblevel search();

    Joblevel search2(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel login3(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel update(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel update2(@Param("name") String name, @Param("titleLevel") String titleLevel);

    Joblevel insert(@Param("id") int id, @Param("name") String name, @Param("titleLevel") String password);

    Joblevel delete(@Param("name") String name, @Param("titleLevel") String titleLevel);
}
