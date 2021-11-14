package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.entity.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPoliticsstatusDao {
    Politicsstatus search(@Param("id") int id);

    List<Politicsstatus> findall();

    int insert(@Param("id") int id,@Param("name") String name);

    int update(@Param("id") int id,@Param("name") String name);

    int delete(@Param("id") int id);

}
