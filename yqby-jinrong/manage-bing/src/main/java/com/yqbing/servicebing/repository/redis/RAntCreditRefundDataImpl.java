package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository("rAntCreditRefundData")
public class RAntCreditRefundDataImpl implements RAntCreditRefundData{
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_refund{0}");
	private static final MessageFormat KEYAPP_FORMAT = new MessageFormat("Object:jinrong_refund_manage{0}");
	
	@Override
	public List<Object> getlist(String outtraid) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {outtraid});
		List<Object> range = redisTemplate.opsForList().range(key, 0, -1);
		return range;
	}

	@Override
	public void setlist(String outtraid, Object rawJSON) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {outtraid});
		redisTemplate.opsForList().leftPushAll(key, rawJSON);
	}
}
