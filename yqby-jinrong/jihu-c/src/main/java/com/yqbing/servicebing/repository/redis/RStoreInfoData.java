package com.yqbing.servicebing.repository.redis;



public interface RStoreInfoData {

	public void setStoreInfo(String invite,StoreInfoBean info);
	public StoreInfoBean getStoreInfo(String invite);
	public Integer increment();
}
