package com.yqbing.servicebing.service;

import java.util.Date;
import java.util.List;

import com.yqbing.servicebing.repository.database.bean.Trade;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInit;


public interface ITradeService {

	List<Trade> getPaySuccessTrades(Integer customerId, String orderId);

	TradeInfo getTradeInfo(Integer customerId, String orderId);

	void updateTradePayChannel(String id, Integer appChannel,
			String payChannel, String payProvider);

	TradeInfo createTrade(TradeInit tradeInit);

	TradeInfo getTradeInfo(String tradeId);
	/**
	 * 支付成功
	 * @param tradeId
	 * @param payId
	 * @param payAmount
	 * @param payTime
	 * @return
	 */
	Boolean payTradeSuccess(String tradeId, String payId, Long payAmount,
			Date payTime);

}
