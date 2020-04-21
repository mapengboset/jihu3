package com.yqbing.servicebing.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.UserInfoBeanMapper;
import com.yqbing.servicebing.repository.redis.RAppraiseData;
import com.yqbing.servicebing.repository.redis.RUserLogBean;
import com.yqbing.servicebing.service.RedisService;
import com.yqbing.servicebing.utils.NotifyUtil;


@Service("redisService")
@SuppressWarnings("all")
public class RedisServiceImpl implements RedisService{

	@Resource
	RUserLogBean rUserLogBean;
	@Resource
	RAppraiseData rAppraiseData;
	
	 @Resource
	 private UserInfoBeanMapper userInfoBeanMapper = null;
	
	@Override
	public String getUserById(String userId, String phone) {
		// TODO Auto-generated method stub
		UserInfoBean user = null;
		try {
			
			if(StringUtils.isBlank(userId)){
				
				user = rUserLogBean.getPhone(phone);
			}
			user = userInfoBeanMapper.selectByPrimaryKey(Long.valueOf(userId));
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return NotifyUtil.success(user);
	}

	@Override
	public void delAppraise(String userId, String appPack) {
                 
		rAppraiseData.removeAppraise(appPack);
		
	}
   
	
	
}
