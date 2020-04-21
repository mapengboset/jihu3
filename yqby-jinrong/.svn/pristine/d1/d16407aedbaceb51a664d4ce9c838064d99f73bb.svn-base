package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.webapp.response.weBankResponse;


@Repository("rAntClickDatailLog")
public class RAntClickDatailLogImpl implements RAntClickDatailLog{
   
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;

	/** 键值格式 */
	private static final String KEY = "Id:AntClickDatailLog";
	private static final String KEY1 = "Id:AntClickLog";
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyMMdd");
	
	private static final MessageFormat KEY_FORMAT_CODE = new MessageFormat("Object:yimei_qrcode{0}");
	
	@Override
	public void set(String trade_no, String datail) {
		// TODO Auto-generated method stub
	   redisTemplate.opsForValue().set(trade_no,datail);
	}
	public void setlist(String data){
	
		redisTemplate.opsForList().leftPushAll(KEY1, new Gson().toJson(data));
	}
	@Override
	public String get(String trade_no) {
		
		return redisTemplate.opsForValue().get(trade_no);
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
