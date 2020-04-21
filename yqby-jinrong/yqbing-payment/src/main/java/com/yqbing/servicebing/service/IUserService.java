package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.User;

public interface IUserService {

	User getUser(Integer appId,String token);

}
