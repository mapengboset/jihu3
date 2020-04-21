package com.yqbing.servicebing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.exception.BingException;
import com.yqbing.servicebing.repository.database.abstracts.TUserInfoBeanExample;
import com.yqbing.servicebing.repository.database.abstracts.TUserInfoBeanExample.Criteria;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.repository.database.dao.TUserInfoBeanMapper;
import com.yqbing.servicebing.service.TUserInfoBeanService;

@Service("userInfoBeanService")
public class TUserInfoBeanServiceImpl implements TUserInfoBeanService{
    
	@Autowired
	private TUserInfoBeanMapper userInfoBeanMapper = null;
	
	public List<TUserInfoBean> queryName(String name) throws BingException{
		// TODO Auto-generated method stub
		TUserInfoBeanExample example = new TUserInfoBeanExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameLike(name+"%");
		List<TUserInfoBean> list = userInfoBeanMapper.selectByExample(example);
		
		return list;
	}

}
