package com.yqbing.servicebing.webapp.response.local;

import java.io.Serializable;
import java.util.List;

public class LocalModel implements Serializable{

	private static final long serialVersionUID = 7668729530579585749L;
	public String name;
	public Long Pid;
	public Integer style;
	public Integer isMore;
	public Integer isMark;
	public String moduleType;
	public List<LocalListRes> list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getPid() {
		return Pid;
	}
	public void setPid(Long pid) {
		Pid = pid;
	}
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	public Integer getIsMore() {
		return isMore;
	}
	public void setIsMore(Integer isMore) {
		this.isMore = isMore;
	}
	public Integer getIsMark() {
		return isMark;
	}
	public void setIsMark(Integer isMark) {
		this.isMark = isMark;
	}
	public List<LocalListRes> getList() {
		return list;
	}
	public void setList(List<LocalListRes> list) {
		this.list = list;
	}
	public String getModuleType() {
		return moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}
	
	
}
