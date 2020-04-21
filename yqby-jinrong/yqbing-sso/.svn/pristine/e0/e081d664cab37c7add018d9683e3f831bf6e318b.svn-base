package com.yqbing.servicebing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.abstracts.UserAppExample;
import com.yqbing.servicebing.repository.database.bean.UserApp;
import com.yqbing.servicebing.repository.database.dao.UserAppMapper;
import com.yqbing.servicebing.service.IUserAppBaseService;

@Service("userAppBaseService")
public class UserAppBaseServiceImpl implements IUserAppBaseService{

	@Resource(name = "userAppMapper")
	private UserAppMapper userAppMapper = null;
	
	@Override
	public UserApp queryPlatformByUserId(int platformId, Long userId) {

		
		
		return userAppMapper.queryPlatformByUserId(platformId,userId);
	}

	@Override
	public void createUserApp(UserApp userApp) {
		// TODO Auto-generated method stub
		userAppMapper.insert(userApp);
	}

	@Override
	public List<UserApp> queryPlatformByUserId(Long id) {
		UserAppExample example = new UserAppExample();
		example.createCriteria().andUserIdEqualTo(id);
		example.setOrderByClause(" id");
		return userAppMapper.selectByExample(example);
	}

}
