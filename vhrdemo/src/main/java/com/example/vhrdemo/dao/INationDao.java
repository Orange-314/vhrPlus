package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Nation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INationDao {

    Nation search(@Param("name") String name);

    int update(@Param("id") int id, @Param("name") String name);

    int insert(@Param("id") int id, @Param("name") String name);

    int delete(@Param("name") String name);

    List<Nation> findall();
}
