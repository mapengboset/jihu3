package com.yqbing.servicebing.repository.redis;

public interface RCharBoxData {

	
	/**
	 * 递增客户标识
	 * 
	 * @return 客户标识
	 */
	public Long increment();
	public Long increment(long time);
	
}
