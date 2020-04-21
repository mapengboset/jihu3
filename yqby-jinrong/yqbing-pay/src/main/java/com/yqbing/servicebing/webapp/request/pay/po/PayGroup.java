package com.yqbing.servicebing.webapp.request.pay.po;

import java.io.Serializable;

public class PayGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final int TYPE_INNER = 1;
	public static final int TYPE_OUTER = 2;
	
	public static final int STATUS_ENABLED = 1;
	public static final int STATUS_DISABLED = 0;

	/**
	 * 支付组id
	 */
	protected Integer payGroupId;
	/**
	 * 支付组名称
	 */
	protected String payGroupName;
	/**
	 * 支付组类型：1-内部支付组  2-外部支付组
	 */
	protected Integer payGroupType; 
	/**
	 * 状态：1-正常 0-停用
	 */
	protected Integer payGroupStatus;

	public Integer getPayGroupId() {
		return payGroupId;
	}

	public void setPayGroupId(Integer payGroupId) {
		this.payGroupId = payGroupId;
	}

	public String getPayGroupName() {
		return payGroupName;
	}

	public void setPayGroupName(String payGroupName) {
		this.payGroupName = payGroupName;
	}

	public Integer getPayGroupType() {
		return payGroupType;
	}

	public void setPayGroupType(Integer payGroupType) {
		this.payGroupType = payGroupType;
	}

	public Integer getPayGroupStatus() {
		return payGroupStatus;
	}

	public void setPayGroupStatus(Integer payGroupStatus) {
		this.payGroupStatus = payGroupStatus;
	}

	@Override
	public String toString() {
		return "PayGroup [payGroupId=" + payGroupId + ", payGroupName=" + payGroupName + ", payGroupType=" + payGroupType + ", payGroupStatus=" + payGroupStatus + "]";
	}
	
	
}
