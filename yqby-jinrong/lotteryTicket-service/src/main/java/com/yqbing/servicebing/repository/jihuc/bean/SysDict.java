package com.yqbing.servicebing.repository.jihuc.bean;

import java.util.Date;

public class SysDict {
    private Long id;

    private Integer seq;

    private String fldkey;

    private String parentKey;

    private String baseValue;

    private String extraValue;

    private String name;

    private String description;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getFldkey() {
        return fldkey;
    }

    public void setFldkey(String fldkey) {
        this.fldkey = fldkey == null ? null : fldkey.trim();
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey == null ? null : parentKey.trim();
    }

    public String getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(String baseValue) {
        this.baseValue = baseValue == null ? null : baseValue.trim();
    }

    public String getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(String extraValue) {
        this.extraValue = extraValue == null ? null : extraValue.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}