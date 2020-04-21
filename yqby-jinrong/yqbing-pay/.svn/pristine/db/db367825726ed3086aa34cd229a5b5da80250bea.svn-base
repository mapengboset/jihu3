package com.yqbing.servicebing.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.exception.ParameterInvalidException;
import com.yqbing.servicebing.repository.database.abstracts.TradeExample;
import com.yqbing.servicebing.repository.database.bean.Customer;
import com.yqbing.servicebing.repository.database.bean.OrderPaySuccess;
import com.yqbing.servicebing.repository.database.bean.PayChannelInfo;
import com.yqbing.servicebing.repository.database.bean.Trade;
import com.yqbing.servicebing.repository.database.bean.TradeExt;
import com.yqbing.servicebing.repository.database.dao.CustomerInfoMapper;
import com.yqbing.servicebing.repository.database.dao.OrderPaySuccessMapper;
import com.yqbing.servicebing.repository.database.dao.PayChannelInfoMapper;
import com.yqbing.servicebing.repository.database.dao.TradeExtMapper;
import com.yqbing.servicebing.repository.database.dao.TradeMapper;
import com.yqbing.servicebing.service.INotifyService;
import com.yqbing.servicebing.service.ITradeService;
import com.yqbing.servicebing.utils.json.JSONUtils;
import com.yqbing.servicebing.utils.pay.PaymentErrorCodeEnum;
import com.yqbing.servicebing.utils.pay.TradeUtil;
import com.yqbing.servicebing.utils.pay.enums.CustomerStatusEnum;
import com.yqbing.servicebing.webapp.request.dto.CustomerInfo;
import com.yqbing.servicebing.webapp.request.pay.po.PayChannel;
import com.yqbing.servicebing.webapp.request.trade.dto.Goods;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInit;
import com.yqbing.servicebing.webapp.request.trade.enums.TradeStatusEnum;


@Service("tradeService")
public class TradeServiceImpl implements ITradeService{

	@Resource
	private TradeMapper tradeMapper;
	@Resource
	private TradeExtMapper tradeExtMapper;
	@Resource
	private CustomerInfoMapper customerInfoMapper;
	@Resource
	private PayChannelInfoMapper payChannelInfoMapper;
	@Resource
	private INotifyService notifyService;
	@Resource
	private OrderPaySuccessMapper orderPayDAO;
	
	@Override
	public List<Trade> getPaySuccessTrades(Integer customerId, String orderId) {
		
		TradeExample example = new TradeExample();
		List<Short> resultList = new ArrayList<Short>();
		resultList.add(Short.valueOf(TradeStatusEnum.TRADE_SUCCESS.getId()+""));
		resultList.add(Short.valueOf(TradeStatusEnum.TRADE_FINISHED.getId()+""));
		resultList.add(Short.valueOf(TradeStatusEnum.TRADE_DUPLICATE.getId()+""));
		
		example.createCriteria().andCustomerIdEqualTo(customerId).andOrderIdEqualTo(orderId).andTradeStatusIn(resultList);
		return tradeMapper.selectByExample(example);
	}
	@Override
	public void updateTradePayChannel(String id, Integer appChannel,
			String payChannel, String payProvider) {
		Trade trad = tradeMapper.selectByPrimaryKey(id);
		trad.setPayChannel(payChannel);
		trad.setAppChannel(appChannel);
		trad.setPayProvider(payProvider);
		tradeMapper.updateByPrimaryKeySelective(trad);
		
	}
	@Override
	public TradeInfo getTradeInfo(Integer customerId, String orderId) {
		
		
		TradeInfo tradeInfo = null;
		Trade trade = tradeMapper.queryTradeInfo(customerId, orderId);
		if(trade != null){
			tradeInfo = new TradeInfo();
			toTradeInfo(tradeInfo, trade);
			TradeExt tradeExt = tradeExtMapper.selectByPrimaryKey(trade.getId());
			if(tradeExt != null) {
				toTradeInfo(tradeInfo, tradeExt);
			}
		}
		return null;
	}
	@Override
	public TradeInfo getTradeInfo(String tradeId) {
		TradeInfo tradeInfo = null;
		Trade trade = tradeMapper.selectByPrimaryKey(tradeId);
		if(trade != null){
			tradeInfo = new TradeInfo();
			toTradeInfo(tradeInfo, trade);
			TradeExt tradeExt = tradeExtMapper.selectByPrimaryKey(tradeId);
			if(tradeExt != null) {
				toTradeInfo(tradeInfo, tradeExt);
			}
		}
		return tradeInfo;
	}
	@Override
	public TradeInfo createTrade(TradeInit tradeInit) {
		
		Customer customer = customerInfoMapper.selectByPrimaryKey(tradeInit.getCustomerId());
		if(customer == null){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.CUSTOMER_NOT_EXIST, "customer " + tradeInit.getCustomerId() + " not exist!");
		}
		if(customer.getCustomerStatus() != CustomerStatusEnum.ENABLED.getId()){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.CUSTOMER_DISABLED, "customer " + tradeInit.getCustomerId() + " is not enabled!");
		}
		
		PayChannelInfo payChannel = payChannelInfoMapper.queryPayChannel(tradeInit.getPayChannel());
		if(payChannel == null || payChannel.getPayChannelStatus() != PayChannel.STATUS_ENABLED){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.PAY_CHANNEL_INVALID, "PayChannel " + tradeInit.getPayChannel() + " invalid!");
		}
//		PayProviderInfo payProvider = payChannelService.getPayProvider(payChannel.getPayProvider());
//		if(payProvider == null || payProvider.getPayProviderStatus() != PayProvider.STATUS_ENABLED){
//			throw new ParameterInvalidException(PaymentErrorCodeEnum.PAY_PROVIDER_INVALID, "PayProvider " + payChannel.getPayProvider() + " invalid!");
//		}
		
		if(tradeInit.getTotalAmount() == null || tradeInit.getTotalAmount() < 0L){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_AMOUNT_INVALID, "Trade totalAmount " + tradeInit.getTotalAmount() + " invalid!");
		}
		if(tradeInit.getPayAmount() == null || tradeInit.getPayAmount() < 0L || tradeInit.getPayAmount() > tradeInit.getTotalAmount()){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_AMOUNT_INVALID, "Trade payAmount " + tradeInit.getPayAmount() + " invalid!");
		}
		if(StringUtils.isBlank(tradeInit.getReturnUrl())){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_RETURN_URL_INVALID, "Trade returnUrl " + tradeInit.getReturnUrl() + " invalid!");
		}
		if(StringUtils.isBlank(tradeInit.getNotifyUrl())){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_NOTIFY_URL_INVALID, "Trade notifyUrl " + tradeInit.getNotifyUrl() + " invalid!");
		}
		if(tradeInit.getGoodsItem() == null || StringUtils.isBlank(tradeInit.getGoodsItem().getSubject())){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_GOODS_INVALID, "Trade goods " + tradeInit.getGoodsItem() + " invalid!");
		}
		//TODO检查支付组和支付app信息
		
		TradeInfo trade = new TradeInfo();
		trade.setId(TradeUtil.newTradeId(customer.getCustomerId()));
		trade.setCustomerId(tradeInit.getCustomerId());
		trade.setPayGroupId(customer.getPayGroupId());
		trade.setOrderId(tradeInit.getOrderId());
		trade.setPayProvider(payChannel.getPayProvider());
		trade.setPayChannel(payChannel.getPayChannel());
		trade.setPayAmount(tradeInit.getPayAmount());
		trade.setTotalAmount(tradeInit.getTotalAmount());
		trade.setUserId(tradeInit.getUserId());
		trade.setTradeStatus(TradeStatusEnum.WAIT_PAY.getId());
		trade.setGoodsItem(tradeInit.getGoodsItem());
		trade.setAppChannel(tradeInit.getAppChannel());
		
		TradeExt tradeExt = new TradeExt();
		tradeExt.setGoods(JSONUtils.toJson(tradeInit.getGoodsItem()));		
		tradeExt.setReturnUrl(tradeInit.getReturnUrl());
		tradeExt.setNotifyUrl(tradeInit.getNotifyUrl());
		tradeExt.setCallbackParams(tradeInit.getCallbackParams());

		tradeMapper.insertSelective(trade);
		tradeExt.setTradeId(trade.getId());
		tradeExtMapper.insertSelective(tradeExt);
		
		return trade;
	}

	@Override
	public Boolean payTradeSuccess(String tradeId, String payId,
			Long payAmount, Date payTime) {
		Trade trade = tradeMapper.selectByPrimaryKey(tradeId);
		if(trade == null){
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_NOT_EXIST, "trade " + tradeId + " not exist!");
		}
		
		//交易状态为待支付的，更新为支付成功
		if(trade.getTradeStatus() == TradeStatusEnum.WAIT_PAY.getId()){
			trade.setPayId(payId);
			trade.setPayTime(payTime);
			trade.setTradeStatus(TradeStatusEnum.TRADE_SUCCESS.getId());
			
			int site = getOrderPaySite(trade.getCustomerId(), trade.getOrderId());
			createOrderPaySuccess(trade, site);
			//site=1表示order对应的唯一一笔支付，重复支付site>100
			if(site != 1){
				trade.setTradeStatus(TradeStatusEnum.TRADE_DUPLICATE.getId());
			}
			tradeMapper.updateByPrimaryKeySelective(trade);
		}
		
		if(trade.getTradeStatus() == TradeStatusEnum.TRADE_SUCCESS.getId() || trade.getTradeStatus() == TradeStatusEnum.TRADE_FINISHED.getId()){
			return notifyService.createNotify(tradeId);
		}
		
		return true;
	}
	
      private void createOrderPaySuccess(Trade trade, Integer site){
		
		OrderPaySuccess orderPay = new OrderPaySuccess();
		orderPay.setCustomerId(trade.getCustomerId());
		orderPay.setOrderId(trade.getOrderId());
		orderPay.setPayId(trade.getPayId());
		orderPay.setTradeId(trade.getId());
		orderPay.setPayProvider(trade.getPayProvider());
		orderPay.setPayTime(trade.getPayTime());
		orderPay.setState(site);
		
		orderPayDAO.insertSelective(orderPay);
	}
      
    private int getOrderPaySite(Integer customerId, String orderId) {
  		
  		List<OrderPaySuccess> list = orderPayDAO.queryOrderPayList(customerId, orderId);
  		if(list != null && list.size() > 0){
  			OrderPaySuccess ops = list.get(list.size() - 1);
  			return ops.getState() > 100 ? ops.getState() + 1 : 101;
  		}
  		return 1;
  	}
	private void toTradeInfo(TradeInfo tradeInfo, Trade trade) {
		tradeInfo.setId(trade.getId());
		tradeInfo.setCustomerId(trade.getCustomerId());
		tradeInfo.setOrderId(trade.getOrderId());
		tradeInfo.setPayId(trade.getPayId());
		tradeInfo.setPayProvider(trade.getPayProvider());
		tradeInfo.setPayChannel(trade.getPayChannel());
		tradeInfo.setPayAmount(trade.getPayAmount());
		tradeInfo.setTotalAmount(trade.getTotalAmount());
		tradeInfo.setUserId(trade.getUserId());
		tradeInfo.setTradeStatus(trade.getTradeStatus());
		tradeInfo.setPayTime(trade.getPayTime());
		tradeInfo.setCreateTime(trade.getCreateTime());
		tradeInfo.setAppChannel(trade.getAppChannel());
	}
	
	private void toTradeInfo(TradeInfo tradeInfo, TradeExt tradeExt) {
		tradeInfo.setGoodsItem(JSONUtils.toObject(tradeExt.getGoods(), Goods.class));
		tradeInfo.setReturnUrl(tradeExt.getReturnUrl());
		tradeInfo.setNotifyUrl(tradeExt.getNotifyUrl());
		tradeInfo.setCallbackParams(tradeExt.getCallbackParams());
	}
	
	
	
	
}
