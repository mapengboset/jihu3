package com.yqbing.servicebing.service;

import com.yqbing.servicebing.utils.web.CommonResult;

public interface IBaiMeiYunService {


	CommonResult contract(String token, Integer appId);

	String synContract(String status, String mobile, String contractNo);

	String synAttestation(String status, String mobile);

	CommonResult asyAttestation(String status, String mobile);

	CommonResult asyContract(String status, String mobile, String contractNo);

	CommonResult ifattestation(String token, Integer appId);

	CommonResult userAdd(String moble, String name, String idCard, String token, String appChannel);

	CommonResult userEdit(String moble, String name, String idCard);

	CommonResult userInfo(String phone);
    /**
     * 
    
     * @Title: aliequalBaimei
    
     * @Description: TODO
    
     * @param userphone
     * @param name
     * @param idcard
     * @return
    
     * @return: CommonResult
     */
	CommonResult aliequalBaimei(String userphone, String name, String idcard);

	CommonResult delBaiMeiYun(String phone);

}
