package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Politicsstatus;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPoliticsstatusDao {
    Politicsstatus search(@Param("id") int id);

    Politicsstatus insert(@Param("id") int id,@Param("name") String name);

    Politicsstatus update(@Param("id") int id,@Param("name") String name);

    Politicsstatus delete(@Param("id") int id);

}
