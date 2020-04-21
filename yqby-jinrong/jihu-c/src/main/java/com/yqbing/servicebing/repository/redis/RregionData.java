package com.yqbing.servicebing.repository.redis;

import java.util.List;

import com.yqbing.servicebing.webapp.response.ProvinceRes;

public interface RregionData {

	
	public void setProvinceRes(String pro,List<ProvinceRes> ps);
	public Object  getProvinceRes(String pro);
	public void removeProvinceRes();
	
}
