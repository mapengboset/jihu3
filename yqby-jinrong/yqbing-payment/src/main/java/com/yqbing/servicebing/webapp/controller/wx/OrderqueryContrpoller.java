package com.yqbing.servicebing.webapp.controller.wx;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.yqbing.servicebing.repository.database.bean.PayQrAccountBean;
import com.yqbing.servicebing.repository.database.bean.TWxNoticeBean;
import com.yqbing.servicebing.repository.database.bean.TWxPayOrderBean;
import com.yqbing.servicebing.repository.database.bean.TWxProfitOrderBean;
import com.yqbing.servicebing.service.IPublicPayService;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.wxpay.pay.WxPayData;
import com.yqbing.servicebing.webapp.wxpay.util.Configure;
import com.yqbing.servicebing.webapp.wxpay.util.HttpUtil;
import com.yqbing.servicebing.webapp.wxpay.util.MapUtils;
import com.yqbing.servicebing.webapp.wxpay.util.Signature;
import com.yqbing.servicebing.webapp.wxpay.util.TenpayUtil;
import com.yqbing.servicebing.webapp.wxpay.util.WeixinUtil;
import com.yqbing.servicebing.webapp.wxpay.util.XmlUtil;


/**
 * 微信支付  订单查询
// * @author m
 *
 */

@Controller
@Api(tags = "微信支付 订单查询")
@CrossOrigin
public class OrderqueryContrpoller extends CommonController{

	@Resource
	IPublicPayService publicPayService;
	

	private static Logger logger = LoggerFactory.getLogger(OrderqueryContrpoller.class);

	/**
	 * 查询订单是否完成<br>
	 * out_trade_no,transaction_id二选一必填
	 * @param out_trade_no  业务订单号
	 * @param transaction_id  微信支付生成的微信交易流水号
	 * @throws Exception
	 */
	@RequestMapping(value = "/weixin/pay/queryOrder")
	@ResponseBody
	@ApiOperation(value = "微信订单查询")
	public CommonResult queryOrderStatus(@ApiParam(name = "order",value="流水号")String order,@ApiParam(name = "appChanl",value="渠道")Integer appChanl)
			throws Exception {
		
		TWxPayOrderBean payorder = publicPayService.getOrder(order,appChanl);
		if(payorder == null){
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误,不存在订单");
		}
		Map<String, Object> map = orderquery(payorder.getOutTradeNo(),appChanl);
//		 * SUCCESS—支付成功 REFUND—转入退款 NOTPAY—未支付 CLOSED—已关闭 REVOKED—已撤销（刷卡支付）
//		 * USERPAYING--用户支付中 PAYERROR--支付失败(其他原因，如银行返回失败)
		 
		Object trade_state = map.get("trade_state");
		String desc = (String) map.get("trade_desc");
		if (!trade_state.equals("SUCCESS")) {
			return  new CommonResult(ErrorCode.WXPAYERROR, desc);
		}
        
		return  new CommonResult(ErrorCode.CODE_SUCCESS, "交易成功");

	}
	
	
	

	@RequestMapping(value = "/weixin/pay/profitsharingquery")
	@ResponseBody
	@ApiOperation(value = "微信查询分账结果")
	public CommonResult profitsharingquery(@ApiParam(name = "order",value="流水号")String order,@ApiParam(name = "appChanl",value="渠道")Integer appChanl)
			throws Exception {
		CommonResult result = null;
		TWxProfitOrderBean profitorder = publicPayService.getProfitOrder(order);
		if(profitorder == null){
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误,不存在订单");
		}
		try {
			
			result = publicPayService.profitsharingquery(profitorder,appChanl);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new CommonResult(ErrorCode.CODE_FAIL_ERROR, "操作有误");
		}
        
		return  result;

	}
	
}
