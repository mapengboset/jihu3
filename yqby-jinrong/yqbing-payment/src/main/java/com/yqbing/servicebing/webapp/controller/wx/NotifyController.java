package com.yqbing.servicebing.webapp.controller.wx;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.helper.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xml.sax.SAXException;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.yqbing.servicebing.repository.database.bean.TWxNoticeBean;
import com.yqbing.servicebing.repository.database.bean.TWxRefundQueryBean;
import com.yqbing.servicebing.service.IPublicPayService;
import com.yqbing.servicebing.webapp.wxpay.util.MapUtils;
import com.yqbing.servicebing.webapp.wxpay.util.XmlUtil;
import com.yqbing.servicebing.webapp.wxpay.util.aes.AESUtil;

/**
 * 微信支付 异步通知
 * 
 * @author mapb
 *
 */
@Controller
public class NotifyController extends CommonController{


	private static Logger logger = LoggerFactory.getLogger(NotifyController.class);

	
    @Resource
	IPublicPayService publicPayService;
    /**
	 * 支付成功回调映射
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	@RequestMapping("/weixin/pay/pay_notify")
	public void payNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.error("-------------微信支付回调数据开始--------------");
		String inputLine;
		String notityXml = "";
		String resXml = "";
		try {
			while ((inputLine = request.getReader().readLine()) != null) {
				notityXml += inputLine;
			}
			request.getReader().close();
		} catch (Exception e) {
			logger.error("接受支付回调失败-----------");
			logger.error(e.getMessage());
		}
		logger.debug("[接收到的报文]：" + JSON.toJSONString(notityXml));
		// 处理回调参数
		Map<String, String> map = notifyProcess(notityXml);
		String code = map.get("code");
		String msg = map.get("msg").toUpperCase();
		logger.error("---------------------------回调code:" + code + " msg:" + msg);
		if ("0".equals(code) && "OK".equals(msg)) {
			resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
					+ "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
		} else {
			resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
					+ "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
		}
		logger.debug("微信支付回调数据结束----------");
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		out.write(resXml.getBytes());
		out.flush();
		out.close();
	}




	@RequestMapping("/weixin/pay/refund_notify")
	@ApiOperation(value = "异步回调退款")
	public void  refundNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.error("-------------微信退款回调数据开始--------------");
		String inputLine;
		String notityXml = "";
		String resXml = "";
		try {
			while ((inputLine = request.getReader().readLine()) != null) {
				notityXml += inputLine;
			}
			request.getReader().close();
		} catch (Exception e) {
			logger.error("接受微信退款回调失败-----------");
			logger.error(e.getMessage());
		}
		logger.debug("[接收到的报文]：" + JSON.toJSONString(notityXml));
		// 处理回调参数
		Map<String, String> map = notifyrefund(notityXml);
		String code = map.get("code");
		String msg = map.get("msg").toUpperCase();
		logger.error("code:" + code + " msg:" + msg);
		if ("0".equals(code) && "OK".equals(msg)) {
			resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
					+ "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
		} else {
			resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
					+ "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
		}
		logger.debug("微信支付回调数据结束----------");
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		out.write(resXml.getBytes());
		out.flush();
		out.close();
	}

	private Map<String, String> notifyrefund(String notityXml) {
		
		Map<String, String> resultMap = new HashMap<>();
		
		Map map = null;
		Map map1 = null;
		try {
			map = XmlUtil.doXMLParse(notityXml);
			MapUtils mapUtils = new MapUtils(map);
			if(mapUtils.getString("return_code").equals("SUCCESS")){//
				String req_info = mapUtils.getString("req_info");
				String encryptData = AESUtil.encryptData(req_info, "1573218931");
				
				map1 = AESUtil.readStringXmlOut(encryptData);
				MapUtils mapUtils1 = new MapUtils(map1);
				TWxRefundQueryBean refundBean = new TWxRefundQueryBean();
				
				if(mapUtils.getString("return_code").equals("SUCCESS")){
					
					    mapUtils1.getString("refund_request_source");
						refundBean.setOutRefundNo(mapUtils1.getString("out_refund_no"));
						refundBean.setOutTradeNo(mapUtils1.getString("out_trade_no"));
						refundBean.setTotalRefundCount(Integer.valueOf(mapUtils1.getString("total_fee")));
						refundBean.setCashFee(Integer.valueOf(mapUtils1.getString("cash_fee")));
						refundBean.setRefundCount(Integer.valueOf(mapUtils1.getString("refund_account")));
						refundBean.setRefundFeeN(mapUtils1.getString("refund_fee"));
						refundBean.setRefundStatusN(mapUtils1.getString("refund_status"));   
						refundBean.setRefundRecvAccoutN(mapUtils1.getString("refund_recv_accout"));   
						refundBean.setTransactionId(mapUtils1.getString("transaction_id"));
						publicPayService.saveRefundQuery(refundBean);
					
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultMap;
	}
   public static void main(String[] args) throws Exception {
	   JsonArray jsonArray = new JsonArray();
		JsonObject receiver = new JsonObject();
		receiver.addProperty("type", "PERSONAL_OPENID");
		receiver.addProperty("account","ddd");
		receiver.addProperty("amount", "ddd");
		receiver.addProperty("description", "商品交易");
		jsonArray.add(receiver);
	System.out.println(jsonArray);
}
}
