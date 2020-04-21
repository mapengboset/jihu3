package com.yqbing.servicebing.service;

public interface LaXinService {
    
	/**
	 * 
	
	 * @Title: queryStore
	
	 * @Description: TODO
	
	 * @param storeId
	 * @return
	
	 * @return: String
	 */
	String queryStore(Long storeId);
    
	/**
	 * 
	
	 * @Title: queryUserId
	
	 * @Description: TODO
	
	 * @param userId
	 * @return
	
	 * @return: String
	 */
	String queryUserId(Long userId);
    /*
     * 
     */
	String queryToken(String token);

}
