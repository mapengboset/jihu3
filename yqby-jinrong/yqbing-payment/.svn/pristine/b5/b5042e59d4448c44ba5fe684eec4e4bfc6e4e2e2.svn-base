package com.yqbing.servicebing.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.User;
import com.yqbing.servicebing.repository.database.bean.UserToken;
import com.yqbing.servicebing.repository.database.dao.UserMapper;
import com.yqbing.servicebing.repository.database.dao.UserTokenMapper;
import com.yqbing.servicebing.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService{

	
	@Resource
	UserMapper userMapper;
	@Resource
	UserTokenMapper userTokenMapper;
	
	@Override
	public User getUser(Integer appId,String token) {
		//如果数据库是q 直接体现
				UserToken utoken = userTokenMapper.queryUserByToken(appId, token);
				User user = null;
				if(utoken != null){
					 user = userMapper.selectByPrimaryKey(utoken.getUserId());
				}
				if(user == null){
					 return null;
				}
				return user;
	}

}
