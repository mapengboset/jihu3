package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class FeiFanActivate {
    private Integer id;

    private Long userid;

    private String imei;

    private String apppack;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getApppack() {
        return apppack;
    }

    public void setApppack(String apppack) {
        this.apppack = apppack == null ? null : apppack.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}