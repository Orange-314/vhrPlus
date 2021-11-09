package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Salary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISalaryDao {
    List<Salary> findall();

    Salary search(@Param("name") String name);

    Salary insert(@Param("id") int id, @Param("name") String name);

    Salary delete(@Param("name") String name);

}
