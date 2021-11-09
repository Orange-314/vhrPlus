package com.example.vhrdemo.service;

import com.example.vhrdemo.entity.Adjustsalary;

import java.sql.Date;

public interface IAdjustsalaryService {
    Adjustsalary search(int eid);

    int update(int eid, Date asDate, int beforeSalary, int afterSalary, String reason, String remark);

    int insert(int eid, Date asDate, int beforeSalary, int afterSalary, String reason, String remark);

    int delete(int eid);
}
