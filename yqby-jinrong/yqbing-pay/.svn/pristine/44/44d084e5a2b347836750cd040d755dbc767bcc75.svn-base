package com.yqbing.servicebing.repository.database.bean;

import java.io.Serializable;
import java.util.Date;

public class Notify implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 692000897144930809L;
	public static final int STATUS_FINISHED = 1;			//已完成
	public static final int STATUS_NOT_FINISHED = 0;		//未完成
	public static final int STATUS_FAILED = 9;				//失败
    private Long id;

    private Integer customerId;

    private String orderId;

    private String tradeId;

    private Integer notifyNum;

    private Integer notifyStatus;

    private Date notifyTime;

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

    public Integer getNotifyNum() {
        return notifyNum;
    }

    public void setNotifyNum(Integer notifyNum) {
        this.notifyNum = notifyNum;
    }

    public Integer getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(Integer notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}