package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMsgcontentDao {
    Msgcontent search(@Param("id") int id);

    List<Msgcontent> findall();

    int insert(@Param("id") int id,@Param("title") String title,@Param("message") String message) ;

    int updateid(@Param("id") int id, @Param("title") String title);

    int delete(@Param("id") int id);
}

