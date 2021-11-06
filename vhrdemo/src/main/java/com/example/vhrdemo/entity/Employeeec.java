package com.example.vhrdemo.entity;

import java.sql.Date;

public class Employeeec {
    private int id;
    private int eid;
    private Date ecDate;
    private String ecReason;
    private int ecPoint;
    private int ecType;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Date getEcDate() {
        return ecDate;
    }

    public void setEcDate(Date ecDate) {
        this.ecDate = ecDate;
    }

    public String getEcReason() {
        return ecReason;
    }

    public void setEcReason(String ecReason) {
        this.ecReason = ecReason;
    }

    public int getEcPoint() {
        return ecPoint;
    }

    public void setEcPoint(int ecPoint) {
        this.ecPoint = ecPoint;
    }

    public int getEcType() {
        return ecType;
    }

    public void setEcType(int ecType) {
        this.ecType = ecType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
