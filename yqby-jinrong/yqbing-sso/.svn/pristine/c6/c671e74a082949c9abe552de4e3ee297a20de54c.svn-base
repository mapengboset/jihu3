package com.yqbing.servicebing.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.User;
import com.yqbing.servicebing.repository.database.dao.UserMapper;
import com.yqbing.servicebing.service.IUserBaseService;


@Service("userBaseService")
public class UserBaseServiceImpl implements IUserBaseService{
    
	@Resource
	UserMapper userMapper;
	
	@Override
	public User queryUserByLoginUser(String loginUser) {
		
		return userMapper.queryUserByLoginUser(loginUser);
	}

	@Override
	public User queryUserByMobile(String mobile) {
		
		return userMapper.queryUserByMobile(mobile);
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUserPassword(Long id, String loginPassword) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		user.setLoginPassword(loginPassword);
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void updateUserMobile(Long id, String mobile) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		user.setMobile(mobile);
		userMapper.updateByPrimaryKeySelective(user);
	}

}
