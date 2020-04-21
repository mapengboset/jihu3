package com.yqbing.servicebing.webapp.controller;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.helper.StringUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yqbing.servicebing.service.IAliPayService;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.web.CommonResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//支付宝付款
@RestController
@Api(tags = "百媒云签署合同")
@CrossOrigin
public class ALIController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ALIController.class);
	
	@Resource
	IAliPayService aliPayService;
	
	//调起支付
	@RequestMapping(value="/ali/pay/unifiedorder",method = {RequestMethod.GET,RequestMethod.POST})
	public CommonResult createPay(String PID,String amount,String openId){
		
		if(StringUtils.isBlank(amount)) {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		
		if(StringUtils.isBlank(openId)) {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		
		LOGGER.info("000000000000000000000000000000调起支付:PID="+PID+"&amount="+amount+"&auth_code="+openId);
		CommonResult ali = aliPayService.createPay(PID, amount,openId);
		
		return ali;
		
	}
	
	
/*	public CommonResult notifyPay(){
		
		CommonResult ali = aliPayService.notifyPay();
		
		return ali;
		
	}*/
	//交易查询,成功进行转账处理
	@RequestMapping(value="/ali/pay/queryorder")
	public CommonResult queryPay(String trade_no){
		LOGGER.info("000000000000000000000000000000查询支付:trade_no="+trade_no);
		CommonResult ali = aliPayService.queryPay(trade_no);
		
		return ali;
		
	}
	
	
	/**
	 * 获取静默授权地址
	 */
	@RequestMapping("/ali/pay/oauth")
	@ResponseBody
	@ApiOperation(value = "下单支付")
	public ModelAndView getOauthUrl(HttpServletRequest request,String token,Integer appChanl,String url,String pid) throws Exception {
	
		ModelAndView mv = new ModelAndView();
		mv = aliPayService.getOauthUrl(request, token, appChanl, url, pid);
		 
		 return mv;
	}
	
	@RequestMapping("/ali/pay/getOpenId")
	public ModelAndView  getOpenId(String app_id,String auth_code,String state,String url) throws Exception {
		ModelAndView result = new ModelAndView();
		LOGGER.info("ali/pay/getOpenId--------------------获取url--------------------url:"+url);
		LOGGER.info("--------------------获取userID--------------------auth_code:"+auth_code+"&state:"+state);
		if (StringUtil.isBlank(auth_code)) { 
			LOGGER.error("初始化预支付参数失败，参数为空");
		}
		result.addObject("openId",auth_code);
		result.addObject("storeName","水果商店");
		result.addObject("pid",state);
		result.addObject("payWay",2);
	
		result.setViewName("redirect:"+url);
		return result;
	}
	
	
}
