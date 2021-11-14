package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IPositionDao {
    Position search(@Param("id") int id);

    List<Position> findall();

    int insert(@Param("id") int id,@Param("name") String name);

    int update(@Param("id") int id,@Param("name") String name);

    int delete(@Param("id") int id);
}
