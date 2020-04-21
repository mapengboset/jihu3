package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository("rAccountCodeLog")
public class RAccountCodeLogImpl implements RAccountCodeLog{
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	private static final MessageFormat KEY_FORMAT_CODE = new MessageFormat("Object:account_code{0}");
	@Override
	public void setCode(String phone, Integer code) {
	
		String key = KEY_FORMAT_CODE.format(new Object[] {phone});
		
		redisTemplate.opsForValue().set(key, code+"",65,TimeUnit.SECONDS);
	}

	@Override
	public Integer getCode(String phone) {
		
		String key = KEY_FORMAT_CODE.format(new Object[] { phone});
		Integer object = null;
		try {
			
			 Object object2 = redisTemplate.opsForValue().get(key);
			 object = Integer.valueOf(object2.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return object;
	}
}
