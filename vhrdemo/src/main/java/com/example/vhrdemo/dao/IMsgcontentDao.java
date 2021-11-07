package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMsgcontentDao {
    Msgcontent search(@Param("id") int id);

    Msgcontent insert(@Param("id") int id,@Param("title") String title,@Param("message") String message) ;

}

