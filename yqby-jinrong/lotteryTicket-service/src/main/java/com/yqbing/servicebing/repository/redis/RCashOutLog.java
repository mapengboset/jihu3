package com.yqbing.servicebing.repository.redis;

public interface RCashOutLog {
	public Long increment();
	public Long increment(long time);
}
