package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Politicsstatus;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPoliticsstatusDao {
    Politicsstatus search(@Param("id") int id);

    int insert(@Param("id") int id,@Param("name") String name);

    int update(@Param("id") int id,@Param("name") String name);

    int delete(@Param("id") int id);

}
