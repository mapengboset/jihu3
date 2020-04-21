package com.yqbing.servicebing.webapp.response;
import java.util.List;

public class ChargPass {
	
	
	private String endTime;
	private List<ChargCode> activeCode;
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public List<ChargCode> getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(List<ChargCode> activeCode) {
		this.activeCode = activeCode;
	}
	
	public static void main(String[] args) {
		
		
	}
}
