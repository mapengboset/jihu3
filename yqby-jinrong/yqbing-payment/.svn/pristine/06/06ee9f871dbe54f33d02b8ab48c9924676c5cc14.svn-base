package com.yqbing.servicebing.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.yqbing.servicebing.utils.web.CommonResult;

public interface IAliPayService {
    
	CommonResult createPay(String pID,String amount, String auth_code);

	CommonResult queryPay(String trade_no);

	ModelAndView getOauthUrl(HttpServletRequest request, String token,
			Integer appChanl, String url, String pid);

}
