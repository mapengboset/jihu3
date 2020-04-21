package com.yqbing.servicebing.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.Apps;
import com.yqbing.servicebing.repository.database.dao.AppsMapper;
import com.yqbing.servicebing.service.IAppsBaseService;

@Service("appsBaseService")
public class AppsBaseServiceImpl implements IAppsBaseService{

	@Resource
	AppsMapper appsMapper;
	
	
	@Override
	public Apps queryAppsByAppId(Integer appId) {
		// TODO Auto-generated method stub
		return appsMapper.queryAppsByAppId(appId);
	}

}
