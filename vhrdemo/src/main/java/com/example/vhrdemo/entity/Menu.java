package com.example.vhrdemo.entity;

public class Menu {
    private int id;
    private String url;
    private String path;
    private String component;
    private String name;
    private String iconCls;
    private byte keepAlive;
    private byte requireAuth;
    private int parentId;
    private byte enabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public byte getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(byte keepAlive) {
        this.keepAlive = keepAlive;
    }

    public byte getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(byte requireAuth) {
        this.requireAuth = requireAuth;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }
}
