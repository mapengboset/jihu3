package com.yqbing.servicebing.webapp.controller.notify;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.google.common.collect.Maps;
import com.yqbing.servicebing.exception.ParameterInvalidException;
import com.yqbing.servicebing.repository.database.bean.AlipayAppConfig;
import com.yqbing.servicebing.repository.database.bean.PayAppInfo;
import com.yqbing.servicebing.service.ICustomerService;
import com.yqbing.servicebing.service.IPayChannelService;
import com.yqbing.servicebing.service.ITradeFrontService;
import com.yqbing.servicebing.service.ITradeService;
import com.yqbing.servicebing.utils.DateUtils;
import com.yqbing.servicebing.utils.json.JSONObject;
import com.yqbing.servicebing.utils.pay.DecimalUtils;
import com.yqbing.servicebing.utils.pay.PaymentErrorCodeEnum;
import com.yqbing.servicebing.webapp.request.pay.enums.AlipayTradeStatusEnum;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;


@Controller
@RequestMapping("/pay/callback/alipay")
public class AlipayNotifyController {
		
	private static final Logger logger = LoggerFactory.getLogger(AlipayNotifyController.class);

	@Resource
	private IPayChannelService payChannelService;	
	@Resource
	private ICustomerService customerService;
	@Resource
	private ITradeService tradeService;
	@Resource
	private ITradeFrontService tradeFrontService;
	
	
	
	/**
	 * Alipay页面回调地址
	 * @param request
	 * @param appId
	 * @param method
	 * @param charset
	 * @param timestamp
	 * @param version
	 * @param authAppId
	 * @param signType
	 * @param sign
	 * @param outTradeNo
	 * @param tradeNo
	 * @param totalAmountStr
	 * @param sellerId
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="/return", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request,
			//公共参数
			@RequestParam(value="app_id") String appId,
			@RequestParam(value="method") String method,
			@RequestParam(value="charset") String charset,
			@RequestParam(value="timestamp") String timestamp,
			@RequestParam(value="version") String version,
			@RequestParam(value="auth_app_id") String authAppId,
			@RequestParam(value="sign_type") String signType,
			@RequestParam(value="sign") String sign,
			//业务参数
			@RequestParam(value="out_trade_no") String tradeId,
			@RequestParam(value="trade_no") String tradeNo,
			@RequestParam(value="total_amount") String totalAmountStr,
			@RequestParam(value="seller_id") String sellerId) throws Exception{

		
		TradeInfo trade = tradeService.getTradeInfo(tradeId);
		if(trade == null){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_NOT_EXIST, "trade " + tradeId + " not exist!");
		}
		
		PayAppInfo payApp = payChannelService.getPayApp(trade.getAppChannel(), trade.getCustomerId(), trade.getPayGroupId(), trade.getPayProvider());
		AlipayAppConfig payChannelConfig = (AlipayAppConfig)payApp.getAppConfig();
		
		Map<String, String> paramsMap = Maps.newHashMap();
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()){
			String paramName = paramNames.nextElement().toString();
			paramsMap.put(paramName, request.getParameter(paramName));
		}
		
		boolean signVerified = false;
		try {
			signVerified = AlipaySignature.rsaCheckV1(paramsMap, payChannelConfig.getAlipayPublicKey(), charset, signType);
		} catch (AlipayApiException e) {
			logger.error("", e);
		}
		if(!signVerified){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.PAY_ALIPAY_SIGN_INVALID, "alipay sign " + sign + " invalid!");
		}
				
		return new ModelAndView(new RedirectView(tradeFrontService.getReturnUrl(trade)));
	
	}
	
	/**
	 * Alipay异步通知接口
	 * @param request
	 * @param response
	 * @param notifyTime
	 * @param notifyType
	 * @param notifyId
	 * @param charset
	 * @param version
	 * @param authAppId
	 * @param signType
	 * @param sign
	 * @param appId
	 * @param outTradeNo
	 * @param tradeNo
	 * @param outBizNo
	 * @param buyerId
	 * @param sellerId
	 * @param tradeStatus
	 * @param totalAmountStr
	 * @param receiptAmountStr
	 * @param invoiceAmountStr
	 * @param buyerPayAmountStr
	 * @param pointAmountStr
	 * @param refundFeeStr
	 * @param subject
	 * @param body
	 * @param gmtCreate
	 * @param gmtPayment
	 * @param gmtRefund
	 * @param gmtClose
	 * @param fundBillList
	 * @param voucherDetailList
	 * @param passbackParams
	 */
	@RequestMapping(value="/notify", method=RequestMethod.POST)
	public void notify(HttpServletRequest request,
			HttpServletResponse response,
			//公共参数
			@RequestParam(value="notify_time") String notifyTime,
			@RequestParam(value="notify_type") String notifyType,
			@RequestParam(value="notify_id") String notifyId,
			@RequestParam(value="charset") String charset,
			@RequestParam(value="version") String version,
			@RequestParam(value="auth_app_id") String authAppId,
			@RequestParam(value="sign_type") String signType,
			@RequestParam(value="sign") String sign,
			//业务参数
			@RequestParam(value="app_id") String appId,
			@RequestParam(value="out_trade_no") String outTradeNo,
			@RequestParam(value="trade_no") String tradeNo,
			@RequestParam(value="out_biz_no", required=false) String outBizNo,
			@RequestParam(value="buyer_id", required=false) String buyerId,
			@RequestParam(value="seller_id", required=false) String sellerId,
			@RequestParam(value="trade_status", required=false) String tradeStatus,
			@RequestParam(value="total_amount", required=false) String totalAmountStr,
			@RequestParam(value="receipt_amount", required=false) String receiptAmountStr,
			@RequestParam(value="invoice_amount", required=false) String invoiceAmountStr,
			@RequestParam(value="buyer_pay_amount", required=false) String buyerPayAmountStr,
			@RequestParam(value="point_amount", required=false) String pointAmountStr,
			@RequestParam(value="refund_fee", required=false) String refundFeeStr,
			@RequestParam(value="subject", required=false) String subject,
			@RequestParam(value="body", required=false) String body,
			@RequestParam(value="gmt_create", required=false) String gmtCreate,
			@RequestParam(value="gmt_payment", required=false) String gmtPayment,
			@RequestParam(value="gmt_refund", required=false) String gmtRefund,
			@RequestParam(value="gmt_close", required=false) String gmtClose,
			@RequestParam(value="fund_bill_list", required=false) String fundBillList,
			@RequestParam(value="voucher_detail_list", required=false) String voucherDetailList,
			@RequestParam(value="passback_params", required=false) String passbackParams){
		
		Boolean processSuccess = false;
		
		try {
			String tradeId = outTradeNo;			
			Long payAmount = DecimalUtils.decimalFormat(new BigDecimal(totalAmountStr).multiply(new BigDecimal(100)), 0).longValue();
			BigDecimal totalAmount = new BigDecimal(totalAmountStr);
			Date payTime = DateUtils.getFormatDateOnDay(gmtPayment, "yyyy-MM-dd HH:mm:ss");
			
			
			TradeInfo trade = tradeService.getTradeInfo(tradeId);
			if(trade == null){
				logger.warn("Trade '" + tradeId + "' not exist!");
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}
			
			PayAppInfo payApp = payChannelService.getPayApp(trade.getAppChannel(), trade.getCustomerId(), trade.getPayGroupId(), trade.getPayProvider());
			AlipayAppConfig payChannelConfig = (AlipayAppConfig)payApp.getAppConfig();
			
//			Map<String, String> paramsMap = Maps.newHashMap();
//			Enumeration paramNames = request.getParameterNames();
//			while(paramNames.hasMoreElements()){
//				String paramName = paramNames.nextElement().toString();
//				paramsMap.put(paramName, request.getParameter(paramName));
//			}
			
			Map<String,String> params = new HashMap<String,String>();
			Map requestParams = request.getParameterMap();
			for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			    String name = (String) iter.next();
			    String[] values = (String[]) requestParams.get(name);
			    String valueStr = "";
			    for (int i = 0; i < values.length; i++) {
			        valueStr = (i == values.length - 1) ? valueStr + values[i]
			                    : valueStr + values[i] + ",";
			  	}
			    //乱码解决，这段代码在出现乱码时使用。
				//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
				params.put(name, valueStr);
			}

			logger.info("alipay notify = {}", JSONObject.fromObject(params).toString());
			logger.info("AlipayPublicKey = {}", payChannelConfig.getAlipayPublicKey());
			
			//切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
			//boolean AlipaySignature.rsaCheckV1(Map<String, String> params, String publicKey, String charset, String sign_type)
			boolean signVerified = AlipaySignature.rsaCheckV1(params, payChannelConfig.getAlipayPublicKey(), charset, signType);

//			boolean signVerified = AlipaySignature.rsaCheckV1(paramsMap, payChannelConfig.getAlipayPublicKey(), charset, signType);
			if(!signVerified){
				logger.warn("Alipay sign check failed!");
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}
			
			//检查重要参数一致性
			if(!StringUtils.equals(trade.getId(), outTradeNo)){
				logger.warn("Alipay outTradeNo invalid! outTradeNo=" + outTradeNo +"   originalTradeId=" + trade.getId());
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}
			if(!StringUtils.equals(trade.getPayAmount().toString(), payAmount.toString())){
				logger.warn("Alipay totalAmount invalid! totalAmount=" + totalAmount +"   originalTotalAmount=" + trade.getPayAmount());
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}		
			if(!StringUtils.equals(payApp.getAccountId(), sellerId)){
				logger.warn("Alipay sellerId invalid! sellerId=" + sellerId +"   originalSellerId=" + payApp.getAccountId());
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}
			if(!StringUtils.equals(payChannelConfig.getAppId(), appId)){
				logger.warn("Alipay sellerId invalid! appId=" + appId +"   originalAppId=" + payChannelConfig.getAppId());
				writeAlipayNotifyResult(response, processSuccess);
				return;
			}
			
			
			//验证订单是否支付成功
			if(StringUtils.equals(tradeStatus, AlipayTradeStatusEnum.TRADE_SUCCESS.getId()) || StringUtils.equals(tradeStatus, AlipayTradeStatusEnum.TRADE_FINISHED.getId())){
				processSuccess = tradeService.payTradeSuccess(tradeId, tradeNo, payAmount, payTime);
			}else if(StringUtils.equals(tradeStatus, AlipayTradeStatusEnum.TRADE_CLOSED.getId())){
				
			}
		} catch (Exception e) {
			logger.error("", e);
		}

		writeAlipayNotifyResult(response, processSuccess);
	
	}
	
	/**
	 * 异步通知接口返回数据
	 * @param response
	 * @param processSuccess
	 */
	private void writeAlipayNotifyResult(HttpServletResponse response, Boolean processSuccess){
		
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(processSuccess != null && processSuccess ? "success" : "failure");
			response.getWriter().flush();
			response.getWriter().close();
			logger.info("writeAlipayNotifyResult " + (processSuccess != null && processSuccess ? "success" : "failure"));
		} catch (IOException e) {
			logger.error("", e);
		}
	}
	

	

}
