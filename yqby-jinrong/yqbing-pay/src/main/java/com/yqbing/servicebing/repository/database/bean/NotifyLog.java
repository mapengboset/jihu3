package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class NotifyLog {
    private Long id;

    private Integer customerId;

    private String orderId;

    private String tradeId;

    private Short notifyStatus;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }

    public Short getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(Short notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}