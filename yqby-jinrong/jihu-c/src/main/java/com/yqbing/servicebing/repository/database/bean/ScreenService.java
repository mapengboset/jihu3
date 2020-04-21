package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class ScreenService {
    private Integer id;

    private Long userId;

    private String insureName;

    private String insurePhone;

    private String insureCare;

    private String phoneModel;

    private String phoneBrand;

    private String phoneImei;

    private Double money;

    private Integer type;

    private Integer month;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getInsureName() {
        return insureName;
    }

    public void setInsureName(String insureName) {
        this.insureName = insureName == null ? null : insureName.trim();
    }

    public String getInsurePhone() {
        return insurePhone;
    }

    public void setInsurePhone(String insurePhone) {
        this.insurePhone = insurePhone == null ? null : insurePhone.trim();
    }

    public String getInsureCare() {
        return insureCare;
    }

    public void setInsureCare(String insureCare) {
        this.insureCare = insureCare == null ? null : insureCare.trim();
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel == null ? null : phoneModel.trim();
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand == null ? null : phoneBrand.trim();
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei == null ? null : phoneImei.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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