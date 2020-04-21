package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;

public interface Bank360Service {
    
	/**
	 * 
	
	 * @Title: put360Bank
	
	 * @Description: 360贷款拉新数据
	
	 * @param validToken
	 * @return
	
	 * @return: String
	 */
	String put360Bank(TUserInfoBean validToken);
    
	/**
	 * 
	
	 * @Title: queryBank360Off
	
	 * @Description: TODO
	
	 * @param userId
	 * @return
	
	 * @return: String
	 */
	String queryBank360Off(long userId);
    
	/**
	 * 
	
	 * @Title: bank360List
	
	 * @Description: 返回所有数据,包括二维码数据
	
	 * @param validToken
	 * @param page
	 * @param size
	 * @param startTime
	 * @param endTime
	 * @return
	
	 * @return: String
	 */
	String bank360List(TUserInfoBean validToken, String page, String size,
			String startTime, String endTime);
    
	/**
	 * 
	
	 * @Title: getUser
	
	 * @Description: TODO
	
	 * @param userId
	 * @return
	
	 * @return: String
	 */
	String getUser(Integer userId);

}
