package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Politicsstatus;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPoliticsstatusDao {
    Politicsstatus search(@Param("id") int id);

    Politicsstatus insert(@Param("id") int id,@Param("name") String name,@Param("nameZh") String nameZh);

    Politicsstatus update(String name, String nameZh);

    Politicsstatus delete(int id);

    Politicsstatus update2(String name, String nameZh);

}
