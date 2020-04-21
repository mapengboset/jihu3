package com.yqbing.servicebing.service;

import java.util.List;

import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;


public interface TUserInfoBeanService {

	List<TUserInfoBean> queryName(String name);

}
