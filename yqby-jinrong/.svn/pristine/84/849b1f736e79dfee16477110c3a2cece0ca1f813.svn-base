package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.webapp.response.AntResponse;


@Repository("rAntCredit")
public class RAntCreditImpl implements RAntCredit{

	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_ant{0}");
	private static final MessageFormat KEYAPP_FORMAT = new MessageFormat("Object:jinrong_ant_app{0}");
	
	@Override
	public List<Object> getlist(Integer storeId) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {storeId});
		List<Object> range = redisTemplate.opsForList().range(key, 0, -1);
		return range;
	}

	@Override
	public void setlist(Integer storeId, Object rawJSON) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {storeId});
		redisTemplate.opsForList().leftPushAll(key, rawJSON);
	}
	
	
	
	
}
