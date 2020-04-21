package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class ZanaliPaySettle {
    private Long id;

    private Integer userId;

    private String storeName;

    private Integer storeId;

    private String outTradeNo;

    private String outRequestNo;

    private String settleTradeNo;

    private String tradeNo;

    private String transIn;

    private String amount;

    private String des;

    private Integer status;

    private String reason;

    private Date updateTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo == null ? null : outRequestNo.trim();
    }

    public String getSettleTradeNo() {
        return settleTradeNo;
    }

    public void setSettleTradeNo(String settleTradeNo) {
        this.settleTradeNo = settleTradeNo == null ? null : settleTradeNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getTransIn() {
        return transIn;
    }

    public void setTransIn(String transIn) {
        this.transIn = transIn == null ? null : transIn.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getDesc() {
        return des;
    }

    public void setDesc(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}