package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository("rgoodsOrderLog")
public class GoodsOrderLogImpl implements GoodsOrderLog{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;

	/** 键值格式 */
	private static final String KEY = "Id:GoodsOrder";
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyMMddhhmmss");
	private static final MessageFormat KEY_FORMAT_CODE = new MessageFormat("Object:yimei_qrcode{0}");
	@Override
	public String increment(long time) {
		long date = Long.parseLong(DATE_FORMAT.format(new Date(time)));
		long index = this.redisTemplate.opsForValue().increment("Id:GoodsOrder", 1L).longValue();
		String valueOf = Long.valueOf(date * 1000000000000L + index % 1000000000000L)+"";
		String substring = valueOf.substring(1);
		return substring;
	}
   
	@Override
	public void setQrCode(String outNo, String qrcode) {
		
      String key = KEY_FORMAT_CODE.format(new Object[] {outNo});
		
		redisTemplate.opsForValue().set(key, qrcode+"",125,TimeUnit.SECONDS);
		
	}

	@Override
	public String getQrCode(String outNo) {
		
		String key = KEY_FORMAT_CODE.format(new Object[] { outNo});
		String qrcode = null;
		try {
			
			 Object object2 = redisTemplate.opsForValue().get(key);
			 qrcode = object2.toString();
		} catch (Exception e) {
			
		}
		return  qrcode;
	}
	
}
