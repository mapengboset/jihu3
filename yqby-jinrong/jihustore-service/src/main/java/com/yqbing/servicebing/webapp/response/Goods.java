package com.yqbing.servicebing.webapp.response;

import java.io.Serializable;

public class Goods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5437347158878545764L;
	private Integer id;
	private String name;
	private String  icon ;
	private Integer  number ;
	private Double  ratio ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	
}
