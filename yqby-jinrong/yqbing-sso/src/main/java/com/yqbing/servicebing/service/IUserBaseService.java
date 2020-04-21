package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.User;


public interface IUserBaseService {

	User queryUserByLoginUser(String loginUser);

	User queryUserByMobile(String mobile);

	void createUser(User user);

	User getById(Long id);

	void updateUserPassword(Long id, String loginPassword);

	void updateUserMobile(Long id, String mobile);

}
