package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Nation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface INationDao {

    Nation search(@Param("name") String name);

    Nation update(@Param("id") int id, @Param("name") String name);

    Nation insert(@Param("id") int id, @Param("name") String name);

    Nation delete(@Param("name") String name);


}
