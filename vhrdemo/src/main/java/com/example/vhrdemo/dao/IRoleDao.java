package com.example.vhrdemo.dao;


import com.example.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleDao {
    Role search(@Param("id") int id);

    int insert(@Param("id") int id,@Param("name") String name,@Param("nameZh") String nameZh);

    int update(String name, String nameZh);

    int delete(int id);

    int update2(String name, String nameZh);

    List<Role> findall();
}
