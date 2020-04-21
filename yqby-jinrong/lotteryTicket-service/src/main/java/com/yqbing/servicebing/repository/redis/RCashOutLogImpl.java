package com.yqbing.servicebing.repository.redis;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository("rCashOutLog")
public class RCashOutLogImpl implements RCashOutLog{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;

	/** 键值格式 */
	private static final String KEY = "Id:CashOutLog";
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyMMddhhmmss");
	/**
	 * 递增客户标识
	 * 
	 * @return 客户标识
	 */
	public Long increment() {
		return redisTemplate.opsForValue().increment(KEY, 1l);
	}
	public Long increment(long time) {
		long date = Long.parseLong(DATE_FORMAT.format(new Date(time)));
		long index = this.redisTemplate.opsForValue().increment("Id:CashOutLog", 1L).longValue();

		return Long.valueOf(date * 1000000000000L + index % 1000000000000L);
	}
	
	
}
