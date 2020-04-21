package com.yqbing.servicebing.webapp.request.trade.dto;

import java.io.Serializable;

/**
 * Title:Goods.java
 * Description:商品信息
 * @author alexaz
 * 2019年7月16日
 */
public class Goods implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 商品名称
	 */
	protected String subject;
	/**
	 * 描述内容
	 */
	protected String content;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Goods [subject=" + subject + ", content=" + content + "]";
	}
	
	
}
