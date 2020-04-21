package com.yqbing.servicebing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.exception.BingException;
import com.yqbing.servicebing.repository.database.abstracts.TUserInfoBeanExample;
import com.yqbing.servicebing.repository.database.abstracts.TUserInfoBeanExample.Criteria;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.repository.database.dao.TUserInfoBeanMapper;
import com.yqbing.servicebing.service.TUserInfoBeanService;
import com.yqbing.servicebing.utils.StrUtils;

@Service("userInfoBeanService")
public class TUserInfoBeanServiceImpl implements TUserInfoBeanService {

	@Autowired
	private TUserInfoBeanMapper userInfoBeanMapper = null;

	public List<TUserInfoBean> queryName(String name) throws BingException {
		// TODO Auto-generated method stub
		TUserInfoBeanExample example = new TUserInfoBeanExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameLike(name + "%");
		List<TUserInfoBean> list = userInfoBeanMapper.selectByExample(example);

		return list;
	}

	public TUserInfoBean getValidToken(String token) {
		// TODO Auto-generated method stub
		TUserInfoBean validToken = null;
		if (!StrUtils.isNullOrBlank(token)) {
			validToken = userInfoBeanMapper.getValidToken(token);
		} else {
			return null;
		}

		return validToken;
	}

}
