package com.yqbing.servicebing.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.UserToken;
import com.yqbing.servicebing.repository.database.dao.UserTokenMapper;
import com.yqbing.servicebing.service.IUserTokenBaseService;



@Service("userTokenBaseService")
public class UserTokenBaseServiceImpl implements IUserTokenBaseService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserTokenBaseServiceImpl.class);
	@Resource
	UserTokenMapper userTokenMapper;
	
	@Override
	public void saveOrUpdateUserToken(UserToken userToken) {
		UserToken user = userTokenMapper.queryUserIdByAppId(userToken.getUserId(), userToken.getAppId());
		
		if(user == null){//userid+app_id 
			
			userTokenMapper.insertSelective(userToken);
			
		}else{//存在更新token
			LOGGER.info("---------------------------------提交用户token:"+userToken.getToken());
			user.setToken(userToken.getToken());
			user.setUpdateTime(new Date());
			userTokenMapper.updateByPrimaryKeySelective(user);
		}
	}

	@Override
	public UserToken queryUserByToken(Integer appId, String token) {
		// TODO Auto-generated method stub
		return userTokenMapper.queryUserByToken(appId,token);
	}

	@Override
	public UserToken queryPlatformUserByToken(Integer platformId, String token) {
		// TODO Auto-generated method stub
		return userTokenMapper.queryPlatformUserByToken(platformId,token);
	}

}
