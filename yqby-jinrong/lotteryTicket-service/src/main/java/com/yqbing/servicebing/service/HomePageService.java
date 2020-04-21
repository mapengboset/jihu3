package com.yqbing.servicebing.service;

public interface HomePageService {
    
	/**
	 * 
	
	 * @Title: homePage
	
	 * @Description: TODO
	
	 * @param token
	 * @param device
	 * @param version 
	 * @return
	
	 * @return: String
	 */
	String homePage(String token, String device, String version);
    
	/**
	 * 
	
	 * @Title: queryDate
	
	 * @Description: TODO
	
	 * @param token
	 * @param type
	 * @param stime
	 * @param etime
	 * @param page
	 * @param size
	 * @return
	
	 * @return: String
	 */
	String queryDate(String token, Integer type, String stime, String etime,
			Integer page, Integer size);
    
	/**
	 * 
	
	 * @Title: downUrl
	
	 * @Description: TODO
	
	 * @return
	
	 * @return: String
	 */
	String downUrl(); 
    /**
     * 
    
     * @Title: replace
    
     * @Description: TODO
    
     * @param token
     * @param version
     * @return
    
     * @return: String
     */
	String replace(String token, String version);

}
