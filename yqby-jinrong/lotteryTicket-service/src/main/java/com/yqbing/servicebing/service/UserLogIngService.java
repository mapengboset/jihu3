package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.UserInfoBean;

public interface UserLogIngService {
    
	/**
	 * 
	
	 * @Title: login
	
	 * @Description: TODO
	
	 * @param password
	 * @param phone
	 * @param code
	 * @param device
	 * @param version
	 * @param plat
	 * @return
	
	 * @return: String
	 */
	String login(String password, String phone, String code, String device,
			String version, Integer plat);
    /**
     * 
    
     * @Title: auth
    
     * @Description: TODO
    
     * @param code
     * @param type
     * @return
    
     * @return: String
     */
	String auth(String code, Integer type);
	
	
	/**
	 * 
	
	 * @Title: wxLogIn
	
	 * @Description: TODO
	
	 * @param token
	 * @param type
	 * @return
	
	 * @return: String
	 */
	String wxLogIn(String token, Integer type);
	
	
	/**
	 * 
	
	 * @Title: getPhone
	
	 * @Description: TODO
	
	 * @param phone
	 * @param openId
	 * @param type
	 * @param code 
	 * @return
	
	 * @return: String
	 */
	String getPhone(String phone, String openId, Integer type, String code);
	/**
	 * 
	
	 * @Title: queryAndPhone
	
	 * @Description: TODO
	
	 * @param phone
	 * @return
	
	 * @return: UserInfoBean
	 */
	UserInfoBean queryAndPhone(String phone);
	
	/**
	 * 
	
	 * @Title: loginUserPass
	
	 * @Description: TODO
	
	 * @param phone
	 * @param password
	 * @param device
	 * @param version
	 * @param plat
	 * @return
	
	 * @return: String
	 */
	String loginUserPass(String phone, String password, String device,
			String version, Integer plat);
	String getXUPhone();

}
