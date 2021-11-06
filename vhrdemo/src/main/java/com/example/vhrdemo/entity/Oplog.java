package com.example.vhrdemo.entity;

import java.sql.Date;

public class Oplog {
    private int id;
    private Date addDate;
    private String operate;
    private int hrid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public int getHrid() {
        return hrid;
    }

    public void setHrid(int hrid) {
        this.hrid = hrid;
    }
}
