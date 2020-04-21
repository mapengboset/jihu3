package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class ZanclickFqBean {
    private Integer id;

    private String fq;

    private String fq6;

    private String fq12;

    private String fq24;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFq() {
        return fq;
    }

    public void setFq(String fq) {
        this.fq = fq == null ? null : fq.trim();
    }

    public String getFq6() {
        return fq6;
    }

    public void setFq6(String fq6) {
        this.fq6 = fq6 == null ? null : fq6.trim();
    }

    public String getFq12() {
        return fq12;
    }

    public void setFq12(String fq12) {
        this.fq12 = fq12 == null ? null : fq12.trim();
    }

    public String getFq24() {
        return fq24;
    }

    public void setFq24(String fq24) {
        this.fq24 = fq24 == null ? null : fq24.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}