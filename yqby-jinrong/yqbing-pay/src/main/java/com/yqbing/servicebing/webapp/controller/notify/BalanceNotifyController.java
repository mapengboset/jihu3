package com.yqbing.servicebing.webapp.controller.notify;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.repository.database.bean.BalanceAppConfig;
import com.yqbing.servicebing.repository.database.bean.PayAppInfo;
import com.yqbing.servicebing.service.ICustomerService;
import com.yqbing.servicebing.service.IPayChannelService;
import com.yqbing.servicebing.service.ITradeFrontService;
import com.yqbing.servicebing.service.ITradeService;
import com.yqbing.servicebing.utils.DateUtils;
import com.yqbing.servicebing.utils.json.JSONObject;
import com.yqbing.servicebing.utils.sign.ParamSignUtil;
import com.yqbing.servicebing.webapp.request.pay.enums.AlipayTradeStatusEnum;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;



@RestController
@RequestMapping("/pay/callback/balance")
public class BalanceNotifyController {
	private static final Logger logger = LoggerFactory.getLogger(BalanceNotifyController.class);

	public static final String CALLBACK = "/pay/callback/balance";
	@Resource
	private IPayChannelService payChannelService;	
	@Resource
	private ICustomerService customerService;
	@Resource
	private ITradeService tradeService;
	@Resource
	private ITradeFrontService tradeFrontService;
	
	/**
	 * Balance异步通知接口
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/notify", method=RequestMethod.POST)
	public void notify(HttpServletRequest request,
			HttpServletResponse response,
			//公共参数
			@RequestParam(value="version") String version,
			@RequestParam(value="signType") String signType,
			@RequestParam(value="sign") String sign,
			//业务参数
			@RequestParam(value="appId") String appId,
			@RequestParam(value="outTradeNo") String outTradeNo,
			@RequestParam(value="tradeNo") String tradeNo,
			@RequestParam(value="tradeStatus", required=false) String tradeStatus,
			@RequestParam(value="totalAmountStr", required=false) String totalAmountStr,
			@RequestParam(value="gmtPayment", required=false) String gmtPayment){
		
		Boolean processSuccess = false;
		
		try {
			String tradeId = outTradeNo;			
			Long payAmount = Long.parseLong(totalAmountStr);//DecimalUtils.decimalFormat(new BigDecimal(totalAmountStr).multiply(new BigDecimal(100)), 0).longValue();
//			BigDecimal totalAmount = new BigDecimal(totalAmountStr);
			Date payTime = DateUtils.getFormatDateOnDay(gmtPayment, "yyyy-MM-dd HH:mm:ss");
			
			
			TradeInfo trade = tradeService.getTradeInfo(tradeId);
			if(trade == null){
				logger.warn("Trade '" + tradeId + "' not exist!");
				writeBalanceNotifyResult(response, processSuccess);
				return;
			}
			
			PayAppInfo payApp = payChannelService.getPayApp(trade.getAppChannel(), trade.getCustomerId(), trade.getPayGroupId(), trade.getPayProvider());
			BalanceAppConfig payChannelConfig = (BalanceAppConfig)payApp.getAppConfig();
			
			Map<String,String> params = new HashMap<String,String>();
			params.put("version", version);
			params.put("signType", signType);
			params.put("appId", appId);
			params.put("outTradeNo", outTradeNo);
			params.put("tradeNo", tradeNo);
			params.put("tradeStatus", tradeStatus);
			params.put("totalAmountStr", totalAmountStr);
			params.put("gmtPayment", gmtPayment);

			logger.info("balance notify = {}", JSONObject.fromObject(params).toString());
			
			HashMap<String, String> signMap = ParamSignUtil.sign(params, null, payChannelConfig.getSecretKey());
			if (!signMap.get(ParamSignUtil.DEFAULT_SIGN_KEY).equals(sign)) {
				logger.warn("Balance sign check failed!");
				writeBalanceNotifyResult(response, processSuccess);
				return;
			}
			
			//检查重要参数一致性
			if(!StringUtils.equals(trade.getId(), outTradeNo)){
				logger.warn("Balance outTradeNo invalid! outTradeNo=" + outTradeNo +"   originalTradeId=" + trade.getId());
				writeBalanceNotifyResult(response, processSuccess);
				return;
			}
			if(!StringUtils.equals(trade.getPayAmount().toString(), payAmount.toString())){
				logger.warn("Balance totalAmount invalid! totalAmount=" + totalAmountStr +"   originalTotalAmount=" + trade.getPayAmount());
				writeBalanceNotifyResult(response, processSuccess);
				return;
			}
			if(!StringUtils.equals(payChannelConfig.getAppId(), appId)){
				logger.warn("Balance sellerId invalid! appId=" + appId +"   originalAppId=" + payChannelConfig.getAppId());
				writeBalanceNotifyResult(response, processSuccess);
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

		writeBalanceNotifyResult(response, processSuccess);
	
	}
	
	/**
	 * 异步通知接口返回数据
	 * @param response
	 * @param processSuccess
	 */
	private void writeBalanceNotifyResult(HttpServletResponse response, Boolean processSuccess){
		
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
