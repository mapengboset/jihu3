package com.yqbing.servicebing.webapp.response;

public class StagesRes {

	private Integer id;
	private String prinAndFee;//每期费用
	private String fenqi;//机呼手续费
	private String alifenqi;//花呗手续费
	private String zonghe;//总费用
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrinAndFee() {
		return prinAndFee;
	}
	public void setPrinAndFee(String prinAndFee) {
		this.prinAndFee = prinAndFee;
	}
	public String getFenqi() {
		return fenqi;
	}
	public void setFenqi(String fenqi) {
		this.fenqi = fenqi;
	}
	public String getZonghe() {
		return zonghe;
	}
	public void setZonghe(String zonghe) {
		this.zonghe = zonghe;
	}
	public String getAlifenqi() {
		return alifenqi;
	}
	public void setAlifenqi(String alifenqi) {
		this.alifenqi = alifenqi;
	}
	
}
