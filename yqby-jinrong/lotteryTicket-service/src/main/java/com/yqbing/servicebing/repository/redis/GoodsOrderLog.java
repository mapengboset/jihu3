package com.yqbing.servicebing.repository.redis;

public interface GoodsOrderLog {

	
	public String increment(long time);
	
	public void setQrCode(String outNo,String qrcode);
	
	public String getQrCode(String outNo);
	
}
