package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HotCityBean {
    private Long id;

    private String hotcityname;

    private Integer sort;

    private Byte citytype;

    private Byte status;

    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotcityname() {
        return hotcityname;
    }

    public void setHotcityname(String hotcityname) {
        this.hotcityname = hotcityname == null ? null : hotcityname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getCitytype() {
        return citytype;
    }

    public void setCitytype(Byte citytype) {
        this.citytype = citytype;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}