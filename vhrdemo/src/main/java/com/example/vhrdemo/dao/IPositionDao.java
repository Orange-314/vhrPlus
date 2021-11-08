package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface IPositionDao {
    Position search(@Param("id") int id);
}
