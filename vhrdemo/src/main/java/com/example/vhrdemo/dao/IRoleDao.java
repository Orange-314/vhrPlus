package com.example.vhrdemo.dao;


import com.example.vhrdemo.entity.Hr;
import com.example.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleDao {
    Role search(@Param("id") int id);

    Role insert(@Param("id") int id,@Param("name") String name,@Param("nameZh") String nameZh);

    Role update(String name, String nameZh);

    Role delete(int id);

    Role update2(String name, String nameZh);
}
