package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Appraise;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;

public interface IAppraiseDao {
    Appraise search(@Param("eid") int eid);

    int update(@Param("eid") int eid, @Param("appDate") Date appDate, @Param("appResult") String appResult,
               @Param("appContent") String appContent, @Param("remark") String remark);

    int insert(@Param("eid") int eid, @Param("appDate") Date appDate, @Param("appResult") String appResult,
               @Param("appContent") String appContent, @Param("remark") String remark);

    int delete(@Param("eid") int eid);
}
