package com.example.vhrdemo.entity;

public class Department {
    private int id;
    private String name;
    private int parentId;
    private String depPath;
    private byte enabled;
    private byte isParent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getDepPath() {
        return depPath;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    public byte getIsParent() {
        return isParent;
    }

    public void setIsParent(byte isParent) {
        this.isParent = isParent;
    }
}
