package com.example.vhrdemo.entity;

import java.sql.Date;

public class Employeeremove {
    private int id;
    private int eid;
    private int afterDepId;
    private int afterJobId;
    private Date removeDate;
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

    public int getAfterDepId() {
        return afterDepId;
    }

    public void setAfterDepId(int afterDepId) {
        this.afterDepId = afterDepId;
    }

    public int getAfterJobId() {
        return afterJobId;
    }

    public void setAfterJobId(int afterJobId) {
        this.afterJobId = afterJobId;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
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
