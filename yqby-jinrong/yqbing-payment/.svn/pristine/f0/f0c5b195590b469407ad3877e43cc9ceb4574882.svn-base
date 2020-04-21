package com.yqbing.servicebing.service.impl;

import io.swagger.annotations.ApiOperation;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayTradeCreateRequest;
import com.alipay.api.request.AlipayTradeOrderSettleRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayTradeCreateResponse;
import com.alipay.api.response.AlipayTradeOrderSettleResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.google.gson.Gson;
import com.yqbing.servicebing.repository.redis.RPayAccountLogBean;
import com.yqbing.servicebing.service.IAliPayService;
import com.yqbing.servicebing.service.IPublicPayService;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.wxpay.pay.WxPayData;
import com.yqbing.servicebing.webapp.wxpay.util.HttpUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service("aliPayService")
public class AliPayServiceImpl implements IAliPayService{

	private static final Logger LOGGER = LoggerFactory.getLogger(AliPayServiceImpl.class);
	
	private static String OAUTH_API = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=APPID&scope=auth_base&redirect_uri=REDIRECT_URI&state=PID";

	
	@Value("${ali_pid}")
	private  String aliPid;
	@Value("${your_Private}")
	private  String your_Private;
	@Value("${alipay_public_key}")
	private  String alipayPublicKey;
	@Value("${servehttp}")
	private  String servehttp;
	
	@Resource
	RPayAccountLogBean payAccountLogBean;
	@Resource
	IPublicPayService publicPayService;
	@Override
	public CommonResult createPay(String pID,String amount,String auth_code) {
		
		
		
		String aliUserID = getALIUserID(auth_code);
		if(StringUtils.isBlank(aliUserID)) {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
		AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\""+payAccountLogBean.increment(new Date().getTime()) +"\"," +
		"\"total_amount\":"+amount+"," +
		"\"subject\":\"商家收款\"," +
		"\"sub_merchant\":{" +
		"\"merchant_id\":\"201904251831291201154595\"" +
		"}," +
		"\"buyer_id\":\""+aliUserID+"\"," +
		"\"product_code\":\"FACE_TO_FACE_PAYMENT\"," +
		"\"timeout_express\":\"2m\"" +
		"}");
		//request.setNotifyUrl("");
		AlipayTradeCreateResponse response = null;
		Map<String,Object> map = new HashMap<String, Object>();
		
		try {
			
			response = alipayClient.execute(request);
			//保存到数据库 PID
			if(response.isSuccess()){
				//保存到数据库 PID
				LOGGER.info("------------------------------------支付宝调起支付成功");
				map.put("out_trade_no", response.getOutTradeNo());
				map.put("trade_no", response.getTradeNo());
				
				
			} else {
				return new CommonResult(ErrorCode.CODE_PARAM_ERROR, response.isSuccess()+"");
				
			}
		} catch (AlipayApiException e) {
			
			e.printStackTrace();
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "调起支付失败");
		}
		
		
		return new CommonResult(ErrorCode.CODE_SUCCESS, "成功", map);
	}

	public String getALIUserID(String auth_code){
		
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
		AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
		request.setCode(auth_code);
		request.setGrantType("authorization_code");
		try {
		    AlipaySystemOauthTokenResponse oauthTokenResponse = alipayClient.execute(request);
		    return oauthTokenResponse.getUserId();
		} catch (AlipayApiException e) {
		    //处理异常
		    e.printStackTrace();
		    return "fail";
		}
		
	}
	
	@Override
	public CommonResult queryPay(String trade_no) {
		/**
		 *  交易目前所处的状态,
		 *  WAIT_BUYER_PAY 交易创建，等待买家付款
		 *  TRADE_CLOSED 未付款交易超时关闭，或支付完成后全额退款
		 *  TRADE_SUCCESS 交易支付成功
		 *  TRADE_FINISHED 交易结束，不可退款
		 */
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
		"\"trade_no\":\""+trade_no+"\"," +
		"  }");
		AlipayTradeQueryResponse response = null;
		String tradeStatus = null;
		String totalAmount = null;
		String tradeNo = null;
		String outTradeNo = null;
		String buyerLogonId = null;
		List<TradeFundBill> fundBillList = null;
		String buyerUserId = null;
		try {
			
			    response = alipayClient.execute(request);
			    
			    if(response.isSuccess()){
				
				 tradeNo = response.getTradeNo();
				 outTradeNo = response.getOutTradeNo();
				 buyerLogonId = response.getBuyerLogonId();
				 tradeStatus = response.getTradeStatus();
				 totalAmount = response.getTotalAmount();
				 fundBillList = response.getFundBillList();
				 buyerUserId = response.getBuyerUserId();
				//保存到数据库
				
				} else {
					
					LOGGER.info("---------------------------支付宝交易是否成功:"+tradeStatus);
					if("TRADE_SUCCESS".equals(tradeStatus)){//成功走交易分账
						//通过订单号 返回 用户PID  ,然后通过PID返回 --用户支付宝账号
				//		boolean settle = getOrderSettle(totalAmount, tradeNo, "1043995543@qq.com");
						boolean cash = cashOut(outTradeNo, "1043995543@qq.com", totalAmount);
						if(cash){//转账成功-->调取音响接口
							LOGGER.info("---------------------------转账是否成功-->音响接口:"+tradeStatus);
						}
						
					}
				}
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
	
		
		return new CommonResult(ErrorCode.CODE_SUCCESS, "成功");
	}
	
	
	public boolean cashOut(String outTradeNo,String account,String amount){
		
		
		  AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aliPid, your_Private, "json", "UTF-8", alipayPublicKey, "RSA2");
			
		AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("out_biz_no",outTradeNo);
		map.put("payee_type", "ALIPAY_LOGONID");
	    map.put("payee_account",account);//支付宝账号
		map.put("amount",amount);
		
		request.setBizContent(new Gson().toJson(map));
		
		AlipayFundTransToaccountTransferResponse response = null;
		
			try {
				response = alipayClient.execute(request);
				if(response.isSuccess()){
				   if(!response.getCode().equals("10000") ){
					   return false;
				   }     	   	
				  response.getOutBizNo();
				  response.getOrderId();
				  response.getPayDate();
				  return true;	
				}
				
				return false;
			} catch (AlipayApiException e) {
				e.printStackTrace();
			}
			return false;
	}
	
	   public boolean getOrderSettle(String amo,String tradeNo,String aliaccount){
		   
		   if(StringUtils.isBlank(amo)||amo.equals("0")){
			   return false;
		   }
		   //判断是否分过账,分过不在分
		   AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aliPid, your_Private, "json", "UTF-8", alipayPublicKey, "RSA2");
			
			AlipayTradeOrderSettleRequest  request = new AlipayTradeOrderSettleRequest ();
			request.setBizContent("{" +
					"\"out_request_no\":\""+payAccountLogBean.increment(new Date().getTime()) +"\"," +
					"\"trade_no\":\""+tradeNo+"\"," +
					"\"royalty_parameters\":[{" +
					"\"royalty_type\":\"transfer\"," +
					"\"trans_in_type\":\"loginName\"," +
					"\"trans_in\":\""+aliaccount+"\"," +
					"\"amount\":\""+amo+"\"," +
					"\"desc\":\"商家分账\"" +
					"}]" +
					"}");
				AlipayTradeOrderSettleResponse response = null;
				try {
					
					response = alipayClient.execute(request);
					LOGGER.info("---------------------------支付宝分账是否成功:"+response.isSuccess());
					if(!response.isSuccess()){//调用失败
						return false;
					}
					
					if(response.getCode().equals("10000")){
						response.getTradeNo();
						LOGGER.info("---------------------------支付宝分账成功:"+response.getTradeNo());
						return true;
						}
						
					
				} catch (AlipayApiException e) {
					e.printStackTrace();
					return false;
				}
				return false;
	   }

	   
	   
	@Override
	public ModelAndView getOauthUrl(HttpServletRequest request, String token,
			Integer appChanl, String url, String pid) {
		LOGGER.info("--------------------已经下订单选择支付宝支付跳转到静默授权--------------------");
			Long 	userID = 0L;
			if(!StringUtils.isBlank(token)){//彩票m
	        }
			if(appChanl == 12){//二码合一
				url = publicPayService.getConfigData(12);
			}
			// 重定向地址https://openauth.alipay.com/oauth2/publicAppAuthorize.htm
			String redirectUrl="";
				StringBuffer redirectUrlBuffer = new StringBuffer();
				redirectUrlBuffer.append(servehttp+"/ali/pay/getOpenId".trim());
				redirectUrlBuffer.append("?userID=" + userID);
				redirectUrlBuffer.append("&appChanl=" + appChanl);
				redirectUrlBuffer.append("&url=" + url);
				LOGGER.error("[静默授权重定向地址]:" + redirectUrlBuffer.toString());
				try {
					redirectUrl = URLEncoder.encode(redirectUrlBuffer.toString(), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			// 静默授权地址
			String oauthUrl = OAUTH_API.replace("APPID", aliPid).replace("REDIRECT_URI", redirectUrl).replace("PID", pid);
			LOGGER.error("[静默授权地址]:" + oauthUrl);
	        ModelAndView result = new ModelAndView();
	        result.setViewName("redirect:"+oauthUrl);
			return result;
		}
		

}
