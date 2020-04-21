package com.yqbing.servicebing.repository.database.bean;

public class TWxRefundQueryBean {
    private Long id;

    private String appId;

    private String mchId;

    private String nonceStr;

    private String sign;

    private String transactionId;

    private String outTradeNo;

    private String outRefundNo;

    private String refundId;

    private String returnCode;

    private String returnMsg;

    private String resultCode;

    private String errCode;

    private String errCodeDes;

    private Integer totalRefundCount;

    private Integer cashFee;

    private Integer refundCount;

    private String outRefundNoN;

    private String refundIdN;

    private String refundFeeN;

    private String refundStatusN;

    private String refundRecvAccoutN;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr == null ? null : nonceStr.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo == null ? null : outRefundNo.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    public Integer getTotalRefundCount() {
        return totalRefundCount;
    }

    public void setTotalRefundCount(Integer totalRefundCount) {
        this.totalRefundCount = totalRefundCount;
    }

    public Integer getCashFee() {
        return cashFee;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
    }

    public String getOutRefundNoN() {
        return outRefundNoN;
    }

    public void setOutRefundNoN(String outRefundNoN) {
        this.outRefundNoN = outRefundNoN == null ? null : outRefundNoN.trim();
    }

    public String getRefundIdN() {
        return refundIdN;
    }

    public void setRefundIdN(String refundIdN) {
        this.refundIdN = refundIdN == null ? null : refundIdN.trim();
    }

    public String getRefundFeeN() {
        return refundFeeN;
    }

    public void setRefundFeeN(String refundFeeN) {
        this.refundFeeN = refundFeeN == null ? null : refundFeeN.trim();
    }

    public String getRefundStatusN() {
        return refundStatusN;
    }

    public void setRefundStatusN(String refundStatusN) {
        this.refundStatusN = refundStatusN == null ? null : refundStatusN.trim();
    }

    public String getRefundRecvAccoutN() {
        return refundRecvAccoutN;
    }

    public void setRefundRecvAccoutN(String refundRecvAccoutN) {
        this.refundRecvAccoutN = refundRecvAccoutN == null ? null : refundRecvAccoutN.trim();
    }
}