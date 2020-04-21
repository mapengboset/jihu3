package com.yqbing.servicebing.service;

import java.util.Map;

import com.yqbing.servicebing.webapp.response.ThirdPartyAppsRes;

public interface ChargBoxService {
    
	
	/**
	 * 
	
	 * @Title: myTaskApps
	
	 * @Description: 我的任务下载列表
	
	 * @param token
	 * @return
	
	 * @return: String
	 */
	String myTaskApps(String token);
    /**
     * 
    
     * @Title: chargHomePage
    
     * @Description: TODO
    
     * @param token
     * @param deviceId 设备编号
     * @return
    
     * @return: String
     */
	String chargHomePage(String token, String deviceId);
	/**
	 * 
	
	 * @Title: boxOrder
	
	 * @Description: TODO
	
	 * @param token
	 * @return
	
	 * @return: String
	 */
	String boxOrder(String token);
	
	/**
	 * 
	
	 * @Title: boxPassword
	
	 * @Description: TODO
	
	 * @param token
	 * @param orderNo  订单号
	 * @param deviceId 设备ID
	 * @return
	
	 * @return: String
	 */
	String boxPassword(String token, String orderNo, String deviceId);
	
	/**
	 * 
	
	 * @Title: getOrder
	
	 * @Description: TODO
	
	 * @param token
	 * @param ideaId 套餐ID
	 * @param deviceId 充电宝设备ID
	 * @param type 1微信 2支付宝 3免费
	 * @param totalAmount 订单金额
	 * @param plat 
	 * @return
	
	 * @return: String
	 */
	String getOrder(String token, String ideaId, String deviceId, short type, String totalAmount, Integer plat);
	
	/**
	 * 
	
	 * @Title: alipayUrl
	
	 * @Description: TODO
	
	 * @param params
	
	 * @return: void
	 */
	void alipayUrl(Map<String, String> params);
	/**
	 * 
	
	 * @Title: refPass
	
	 * @Description: TODO
	
	 * @param token
	 * @param deviceId
	 * @param orderNo
	 * @return
	
	 * @return: String
	 */
	String refPass(String token, String deviceId, String orderNo);
	
	/**
	 * 
	
	 * @Title: isCharg
	
	 * @param token
	 * @return
	
	 * @return: String
	 */
	String isCharg(String token);
	/**
	 * 
	
	 * @Title: ChargOver
	
	 * @Description: TODO
	
	 * @param token
	 * @return
	
	 * @return: String
	 */
	void ChargOver(String token, String orderNo);
	
	/**
	 * 
	
	 * @Title: thirdPartyApps
	
	 * @Description: TODO
	
	 * @param token
	 * @param res
	 * @return
	
	 * @return: String
	 */
	String thirdPartyApps(String token, ThirdPartyAppsRes res);
	/**
	 * 
	
	 * @Title: thirdPartyAppsDatail
	
	 * @Description: TODO
	
	 * @param appPack
	 * @param appPack2 
	 * @param res
	 * @return
	
	 * @return: String
	 */
	String thirdPartyAppsDatail(String token, String appPack, ThirdPartyAppsRes res);

}
