package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.utils.NotifyUtil;


@Repository("rStoreInfoData")
public class RStoreInfoDataImpl implements RStoreInfoData{
     
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_storeinfo{0}");
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyMMddhhmmss");
	
	
	
	public Integer increment() {
		long date = Long.parseLong(DATE_FORMAT.format(new Date()));
		long index = this.redisTemplate.opsForValue().increment("Id:CharBox", 1L).longValue();

		return Integer.valueOf(date * 1000000000000L + index % 1000000000000L+"");
	}
	@Override
	public void setStoreInfo(String invite, StoreInfoBean info) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {invite});
		redisTemplate.opsForValue().set(key, new Gson().toJson(info),8,TimeUnit.HOURS);
	}

	@Override
	public StoreInfoBean getStoreInfo(String invite) {
		// TODO Auto-generated method stub
		StoreInfoBean infoBean = null;
		 Object object = null;
				try {
					String key = KEY_FORMAT.format(new Object[] { invite});
					 object = redisTemplate.opsForValue().get(key);
				     if(object != null){

			        		JSONObject jsonobject = JSONObject.fromObject(object);

			        		infoBean = (StoreInfoBean)JSONObject.toBean(jsonobject,StoreInfoBean.class);
			        	
			        	
			        	return infoBean;
			        }
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return infoBean;
	}

}
