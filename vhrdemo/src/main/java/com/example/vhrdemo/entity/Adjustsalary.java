package com.example.vhrdemo.entity;

import java.sql.Date;

public class Adjustsalary {
    private int id;
    private int eid;
    private Date asDate;
    private int beforeSalary;
    private int afterSalary;
    private String reason;
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

    public Date getAsDate() {
        return asDate;
    }

    public void setAsDate(Date asDate) {
        this.asDate = asDate;
    }

    public int getBeforeSalary() {
        return beforeSalary;
    }

    public void setBeforeSalary(int beforeSalary) {
        this.beforeSalary = beforeSalary;
    }

    public int getAfterSalary() {
        return afterSalary;
    }

    public void setAfterSalary(int afterSalary) {
        this.afterSalary = afterSalary;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
