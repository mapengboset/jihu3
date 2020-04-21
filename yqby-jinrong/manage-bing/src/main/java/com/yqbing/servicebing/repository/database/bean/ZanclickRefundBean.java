package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class ZanclickRefundBean {
    private Integer id;

    private String outTradeNo;

    private String tradeNo;

    private String aliTradeNo;

    private String buyerLogonId;

    private String fundChange;

    private String refundFee;

    private String refundCurrency;

    private String gmtRefundPay;

    private String storeName;

    private String buyerUserId;

    private String presentRefundBuyerAmount;

    private String presentRefundDiscountAmount;

    private String presentRefundMdiscountAmount;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getAliTradeNo() {
        return aliTradeNo;
    }

    public void setAliTradeNo(String aliTradeNo) {
        this.aliTradeNo = aliTradeNo == null ? null : aliTradeNo.trim();
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
    }

    public String getFundChange() {
        return fundChange;
    }

    public void setFundChange(String fundChange) {
        this.fundChange = fundChange == null ? null : fundChange.trim();
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee == null ? null : refundFee.trim();
    }

    public String getRefundCurrency() {
        return refundCurrency;
    }

    public void setRefundCurrency(String refundCurrency) {
        this.refundCurrency = refundCurrency == null ? null : refundCurrency.trim();
    }

    public String getGmtRefundPay() {
        return gmtRefundPay;
    }

    public void setGmtRefundPay(String gmtRefundPay) {
        this.gmtRefundPay = gmtRefundPay == null ? null : gmtRefundPay.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId == null ? null : buyerUserId.trim();
    }

    public String getPresentRefundBuyerAmount() {
        return presentRefundBuyerAmount;
    }

    public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
        this.presentRefundBuyerAmount = presentRefundBuyerAmount == null ? null : presentRefundBuyerAmount.trim();
    }

    public String getPresentRefundDiscountAmount() {
        return presentRefundDiscountAmount;
    }

    public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
        this.presentRefundDiscountAmount = presentRefundDiscountAmount == null ? null : presentRefundDiscountAmount.trim();
    }

    public String getPresentRefundMdiscountAmount() {
        return presentRefundMdiscountAmount;
    }

    public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
        this.presentRefundMdiscountAmount = presentRefundMdiscountAmount == null ? null : presentRefundMdiscountAmount.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}