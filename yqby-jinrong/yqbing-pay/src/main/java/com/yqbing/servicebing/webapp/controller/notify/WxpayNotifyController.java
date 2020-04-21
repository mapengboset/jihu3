package com.yqbing.servicebing.webapp.controller.notify;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
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

import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConstants;
import com.github.wxpay.sdk.WXPayUtil;
import com.google.common.collect.Maps;
import com.yqbing.servicebing.repository.database.bean.PayAppInfo;
import com.yqbing.servicebing.service.ICustomerService;
import com.yqbing.servicebing.service.IPayChannelService;
import com.yqbing.servicebing.service.ITradeService;
import com.yqbing.servicebing.utils.DateUtils;
import com.yqbing.servicebing.webapp.request.dto.WxpayAppConfig;
import com.yqbing.servicebing.webapp.request.pay.enums.WxpayTradeStatusEnum;
import com.yqbing.servicebing.webapp.request.pay.util.TradeUtil;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;

@Controller
@RequestMapping(WxpayNotifyController.CALLBACK)
public class WxpayNotifyController {

	private static final Logger logger = LoggerFactory.getLogger(WxpayNotifyController.class);

	public static final String CALLBACK = "/pay/callback/wxpay";
	@Resource
	private IPayChannelService payChannelService;
	@Resource
	private ICustomerService customerService;
	@Resource
	private ITradeService tradeService;

	/**
	 * 接收微信支付成功通知
	 * 
	 * @param request
	 * @param response
	 * @param notifyData
	 */
	@RequestMapping(value = "/notify", method = RequestMethod.POST)
	public void notify(HttpServletRequest request, HttpServletResponse response) {

		Boolean processSuccess = false;
		
		try {
			InputStream inStream = request.getInputStream();
	        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
	        byte[] buffer = new byte[1024];
	        int len = 0;
	        while ((len = inStream.read(buffer)) != -1) {
	            outSteam.write(buffer, 0, len);
	        }
	        outSteam.close();
	        inStream.close();
	        String respXml = new String(outSteam.toByteArray(),"utf-8");   //获取微信调用我们notify_url的返回信息
			
	        logger.info("[WeiXinMpPayAction.notify] notify = " + respXml);
			
			Map<String, String> notifyMap = WXPayUtil.xmlToMap(respXml); // 转换成map
			logger.info("==================WxPay notify " + notifyMap);
			String returnCode = notifyMap.get("return_code");
			if (!StringUtils.equals(returnCode, "SUCCESS")) {
				logger.info("WxPay notify failed! returnCode=" + returnCode);
				writeWxNotifyResult(response, processSuccess, "return_code is not SUCCESS");
				return;
			}

			String resultCode = notifyMap.get("result_code");
			if (!StringUtils.equals(resultCode, WxpayTradeStatusEnum.SUCCESS.getId())) {
				logger.info("WxPay notify failed! errCode=" + notifyMap.get("err_code") + ", errCodeDesc ("
						+ notifyMap.get("err_code_des") + ")");
				writeWxNotifyResult(response, processSuccess, "result_code is not SUCCESS");
				return;
			}

			String tradeId = notifyMap.get("out_trade_no");
			Integer payAmount = Integer.parseInt(notifyMap.get("total_fee"));
			Date payTime = DateUtils.getFormatDateOnDay(notifyMap.get("time_end"), "yyyyMMddHHmmss");
			String appId = notifyMap.get("appid");
			String transactionId = notifyMap.get("transaction_id");

			TradeInfo trade = tradeService.getTradeInfo(tradeId);
			if (trade == null) {
				logger.warn("Trade '" + tradeId + "' not exist!");
				writeWxNotifyResult(response, processSuccess, "out_trade_no " + tradeId + " not exist");
				return;
			}

			PayAppInfo payApp = payChannelService.getPayApp(trade.getAppChannel(), trade.getCustomerId(), trade.getPayGroupId(), trade.getPayProvider());
			WxpayAppConfig payChannelConfig = (WxpayAppConfig) payApp.getAppConfig();
			TradeUtil.initWxpaySignKey(payChannelConfig);

			WXPay wxpay = new WXPay(payChannelConfig, WXPayConstants.SignType.MD5, payChannelConfig.isUseSandbox());

			if (!wxpay.isPayResultNotifySignatureValid(notifyMap)) {
				logger.warn("Wxpay sign check failed!");
				writeWxNotifyResult(response, processSuccess, "sign invalid");
				return;
			}

			// 检查重要参数一致性
			if (trade.getPayAmount() != payAmount.longValue()) {
				logger.warn("Alipay totalAmount invalid! total_fee=" + payAmount + "   originalTotalAmount="
						+ trade.getPayAmount());
				writeWxNotifyResult(response, processSuccess, "total_fee invalid");
				return;
			}

			if (!StringUtils.equals(payChannelConfig.getAppID(), appId)) {
				logger.warn(
						"Alipay sellerId invalid! appId=" + appId + "   originalAppId=" + payChannelConfig.getAppID());
				writeWxNotifyResult(response, processSuccess, "appId invalid");
				return;
			}

			// 验证订单是否支付成功
			if (StringUtils.equals(resultCode, WxpayTradeStatusEnum.SUCCESS.getId())) {
				processSuccess = tradeService.payTradeSuccess(tradeId, transactionId, payAmount.longValue(), payTime);
				writeWxNotifyResult(response, processSuccess, "");
				return;
			}
		} catch (Exception e) {
			logger.error("", e);
		}

		writeWxNotifyResult(response, processSuccess, "error");

	}

	/**
	 * 异步通知接口返回数据
	 * 
	 * @param response
	 * @param processSuccess
	 */
	private void writeWxNotifyResult(HttpServletResponse response, Boolean processSuccess, String msg) {

		try {
			Map<String, String> data = Maps.newHashMap();
			data.put("return_code", processSuccess != null && processSuccess ? "SUCCESS" : "FAIL");
			data.put("return_msg", processSuccess != null && processSuccess ? "" : msg);

			String xml = WXPayUtil.mapToXml(data);
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(xml);
			response.getWriter().flush();
			response.getWriter().close();
			logger.info("writeWxNotifyResult " + xml);
		} catch (Exception e) {
			logger.error("", e);
		}
	}

}
