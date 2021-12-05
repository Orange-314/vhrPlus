package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Appraise;

import java.sql.Date;

public interface IAppraiseService {
    Appraise search(int eid);

    int update(int eid,Date appDate, String appResult, String appContent, String remark);

    int insert(int eid,Date appDate, String appResult, String appContent, String remark);

    int delete(int eid);
}
