package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class Customer{
    private Integer customerId;

    private String customer;

    private Byte customerType;

    private Integer payGroupId;

    private String securityKey;

    private String signType;

    private Date validTime;

    private Short customerStatus;

    private Date applyTime;

    private Date createTime;

    private Date updateTime;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Byte getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Byte customerType) {
        this.customerType = customerType;
    }

    public Integer getPayGroupId() {
        return payGroupId;
    }

    public void setPayGroupId(Integer payGroupId) {
        this.payGroupId = payGroupId;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey == null ? null : securityKey.trim();
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Short getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Short customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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