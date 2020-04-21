package com.yqbing.servicebing.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;


public class UserStoreUtil {
	
	@Autowired
    private RestTemplate restTemplate;
	
	    public static final String serverUrl = "http://ppt.yqbing.com/app/store/api";
     	//public static final String serverUrl = "http://pp.yqbing.com/app/store/api";

	/**
	 * 用户加入门店(后端调用)
	 * @author gavin
	 */
	public String saveUserInsertStore(String platformId, String userId, String storeId, String roleId) {
		
		PropertiesUtil.loadFile("antcredit.properties");
		String serverUrl = PropertiesUtil.getValue("erver_url_ce", "");
		String result = StringUtils.EMPTY;
        String paramsStr = "{\"platformId\":\""+platformId+"\",\"userId\":\""+userId+"\",\"storeId\":\""+storeId+"\",\"roleId\":\""+roleId+"\"}";
        String url = serverUrl + "/userToStore?data="+paramsStr;
        try {
        	result = HttpUtil.sendPost(url, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
       
        return result;
    }
	
	/**
	 * 记录用户备案信息(后端调用)
	 * @author gavin
	 */
	public String saveUserBusinessInfo(String platformId, String userId, String relationId){
		String result = StringUtils.EMPTY;
        String paramsStr = "{\"platformId\":\""+platformId+"\",\"userId\":\""+userId+"\",\"relationId\":\""+relationId+"\"}";
        String url = serverUrl + "/recordUserBusinessInfo?data="+paramsStr;
        try {
        	result = HttpUtil.sendPost(url, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("*************记录用户备案信息Start*************");
        System.out.println("*************记录用户备案信息返回结果:" + result + "*************");
        System.out.println("*************记录用户备案信息End*************");
        return result;
    }

	
	public static void main(String[] args) {
	}
}
