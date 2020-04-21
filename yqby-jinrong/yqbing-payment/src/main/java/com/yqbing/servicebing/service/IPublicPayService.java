package com.yqbing.servicebing.service;


import com.yqbing.servicebing.repository.database.bean.PayQrAccountBean;
import com.yqbing.servicebing.repository.database.bean.TWxApayOrderBean;
import com.yqbing.servicebing.repository.database.bean.TWxNoticeBean;
import com.yqbing.servicebing.repository.database.bean.TWxPayOrderBean;
import com.yqbing.servicebing.repository.database.bean.TWxProfitOrderBean;
import com.yqbing.servicebing.repository.database.bean.TWxRefundQueryBean;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.wxpay.pay.WxPayData;

public interface IPublicPayService {

	void saveNotifyResult(TWxNoticeBean notic);

	WxPayData getWXPayConfig();

	void savePayOrderData(TWxPayOrderBean payOrder);

	void savePrepPayResult(TWxApayOrderBean apayRecord);

	TWxApayOrderBean getPrepPayParam(String out)throws Exception;

	TWxPayOrderBean getOrder(String order, Integer appChanl);

	long getTotalFee(String order);

	TWxNoticeBean getNoticePay(String out_trade_no, Integer appChanl);

	CommonResult refund(String order, Integer appChanl)throws Exception;

	CommonResult refundquery(String order, Integer appChanl);

	CommonResult refundNotify();

	void saveRefundQuery(TWxRefundQueryBean refundBean);

	String getConfigData(int i);

	void saveProfitOrder(TWxProfitOrderBean orderBean);

	TWxProfitOrderBean getProfitOrder(String order);

	CommonResult profitsharingquery(TWxProfitOrderBean profitorder,
			Integer appChanl)throws Exception;

	PayQrAccountBean getwxAccount(String pID);

}
