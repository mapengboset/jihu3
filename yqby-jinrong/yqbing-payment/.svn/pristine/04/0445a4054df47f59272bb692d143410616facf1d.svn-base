package com.yqbing.servicebing.service;

import com.yqbing.servicebing.utils.web.CommonResult;

public interface IWxAliPayService {
    
	/**
	 * 
	
	 * @Title: getPay
	
	 * @Description:调起支付接口
	
	 * @param payWay 1微信 2支付宝
	 * @param pID 用户标识
	 * @return
	
	 * @return: CommonResult
	 */
	CommonResult getPay(int payWay, String pID);
    
	/**
	 * 
	
	 * @Title: getAcount
	
	 * @Description: 上传账号信息
	
	 * @param wx
	 * @param ali
	 * @param name
	 * @param desc
	 * @param phone
	 * @param phone2 
	 * @param idcard 
	 * @param desc2 
	 * @return
	
	 * @return: CommonResult
	 */

	CommonResult queryQR(String wx, String ali, String phone);

	CommonResult getAcount(String meid, String wx, String ali,
			String storeName, String name, String desc, String idcard,
			String phone) throws Exception;

}
