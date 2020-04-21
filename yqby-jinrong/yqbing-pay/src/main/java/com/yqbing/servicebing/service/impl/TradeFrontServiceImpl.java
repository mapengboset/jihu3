package com.yqbing.servicebing.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.yqbing.servicebing.exception.ParameterInvalidException;
import com.yqbing.servicebing.service.ICustomerService;
import com.yqbing.servicebing.service.ITradeFrontService;
import com.yqbing.servicebing.utils.pay.PaymentErrorCodeEnum;
import com.yqbing.servicebing.utils.pay.SignUtil;
import com.yqbing.servicebing.utils.pay.SignUtil.SignData;
import com.yqbing.servicebing.utils.pay.enums.CustomerStatusEnum;
import com.yqbing.servicebing.webapp.request.dto.CustomerInfo;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;


@Service("tradeFrontService")
public class TradeFrontServiceImpl implements ITradeFrontService{

	private static final Logger LOG = LoggerFactory.getLogger(TradeFrontServiceImpl.class);

	@Resource
	private ICustomerService customerService;
	
	
	public String getReturnUrl(TradeInfo trade) throws UnsupportedEncodingException {

		Integer customerId = trade.getCustomerId();

		CustomerInfo customer = (CustomerInfo) customerService.getCustomer(customerId);
		if (customer == null) {
			throw new ParameterInvalidException(PaymentErrorCodeEnum.CUSTOMER_NOT_EXIST, "customer " + customerId + " not exist!");
		}
		if (customer.getCustomerStatus() != CustomerStatusEnum.ENABLED.getId()) {
			throw new ParameterInvalidException(PaymentErrorCodeEnum.CUSTOMER_DISABLED, "customer " + customerId + " is not enabled!");
		}

		String returnUrlStr = initReturnUrl(customer, trade, "1.0", "UTF-8");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOG.warn("", e);
		}
		return returnUrlStr;
	}
	
	// @Override
		private String initReturnUrl(CustomerInfo customer, TradeInfo trade, String version, String charset) throws UnsupportedEncodingException {

			Map<String, String> signParams = Maps.newLinkedHashMap();
			signParams.put("customerId", customer.getCustomerId().toString());
			signParams.put("orderId", trade.getOrderId());
			signParams.put("tradeId", trade.getId().toString());
			signParams.put("payAmount", trade.getPayAmount().toString());
			signParams.put("totalAmount", trade.getTotalAmount().toString());
			signParams.put("timestamp", System.currentTimeMillis() + "");
			signParams.put("callbackParams", trade.getCallbackParams());
			signParams.put("version", version);
			signParams.put("charset", charset);

			SignData signData = SignUtil.sign(signParams, customer.getSecurityKey(), customer.getSignType());
			if (signData == null || StringUtils.isBlank(signData.getSign())) {
				throw new ParameterInvalidException(PaymentErrorCodeEnum.CUSTOMER_SIGN_INVALID, "signData " + signData + " invalid!");
			}
			
			StringBuilder sb = new StringBuilder(trade.getReturnUrl());

			boolean first = true;
			for (Entry<String, String> entry : signParams.entrySet()) {
				sb.append(first ? "?" : "&").append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), charset));
				first = false;
			}

			return sb.toString();
		}
	
	
}