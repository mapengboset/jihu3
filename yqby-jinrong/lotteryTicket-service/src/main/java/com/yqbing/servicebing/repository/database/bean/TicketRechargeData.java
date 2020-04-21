package com.yqbing.servicebing.repository.database.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TicketRechargeData {
    private Integer id;

    private Long userId;

    private String userName;

    private Long storeId;

    private String storeName;

    private String rechargePic;

    private String userRole;

    private Date submitTime;

    private Date confirmTime;

    private String confirmOpName;

    private Date rechargeTime;

    private String rechargeOpName;

    private String status;

    private String registerPhone;

    private BigDecimal rechargeAmount;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getRechargePic() {
        return rechargePic;
    }

    public void setRechargePic(String rechargePic) {
        this.rechargePic = rechargePic == null ? null : rechargePic.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmOpName() {
        return confirmOpName;
    }

    public void setConfirmOpName(String confirmOpName) {
        this.confirmOpName = confirmOpName == null ? null : confirmOpName.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getRechargeOpName() {
        return rechargeOpName;
    }

    public void setRechargeOpName(String rechargeOpName) {
        this.rechargeOpName = rechargeOpName == null ? null : rechargeOpName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone == null ? null : registerPhone.trim();
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }
}