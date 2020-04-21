package com.yqbing.servicebing.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.exception.ParameterInvalidException;
import com.yqbing.servicebing.repository.database.bean.Notify;
import com.yqbing.servicebing.repository.database.dao.NotifyMapper;
import com.yqbing.servicebing.service.INotifyService;
import com.yqbing.servicebing.service.ITradeService;
import com.yqbing.servicebing.utils.pay.PaymentErrorCodeEnum;
import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;
import com.yqbing.servicebing.webapp.request.trade.enums.TradeStatusEnum;

@Service("notifyService")
public class NotifyServiceImpl implements INotifyService{

	private static final Logger LOG = LoggerFactory.getLogger(NotifyServiceImpl.class);
	
	
	@Resource
	private ITradeService tradeService;
	
	@Resource
	private NotifyMapper notifyMapper;
	
	private BlockingQueue<String> notifyQueue = new ArrayBlockingQueue<String>(2000);
	@Override
	public Boolean createNotify(String tradeId) {
		
		TradeInfo trade = tradeService.getTradeInfo(tradeId);
		if(trade == null){
			//删除notify
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_NOT_EXIST, "trade " + tradeId + " not exist!");
		}	
		if(trade.getTradeStatus() != TradeStatusEnum.TRADE_SUCCESS.getId() && trade.getTradeStatus() != TradeStatusEnum.TRADE_FINISHED.getId()){
			//删除notify
			throw new ParameterInvalidException(PaymentErrorCodeEnum.TRADE_NOT_EXIST, "trade " + tradeId + " not exist!");
		}
		
		createOrGetNotify(trade);
		
		try {
			notifyQueue.offer(tradeId);
		} catch (Exception e) {
			LOG.warn("", e);
		}
		return true;
	}
	/**
	 * 查询通知，如果不存在则创建
	 * @param trade
	 * @return
	 */
	private Notify createOrGetNotify(TradeInfo trade){
		
		Notify notify = notifyMapper.queryNotify(trade.getCustomerId(), trade.getOrderId());
		if(notify == null){
			
			notify = new Notify();
			notify.setCustomerId(trade.getCustomerId());
			notify.setOrderId(trade.getOrderId());
			notify.setTradeId(trade.getId());
			notify.setNotifyStatus(Notify.STATUS_NOT_FINISHED);
			notify.setNotifyNum(0);	
			notify.setNotifyTime(getNextNotifyTime(0));
			notifyMapper.insertSelective(notify);
		}
		return notify;
	}
	private Date getNextNotifyTime(Integer currentNotifyNum){
		
		int second = 30;
		if(currentNotifyNum <= 1){
			
		}else if(currentNotifyNum <= 3){
			second = 60;		//每隔1分钟
		}else if(currentNotifyNum <= 7){
			second = 300;		//每隔5分钟
		}else if(currentNotifyNum <= 9){
			second = 1800;		//每隔30分钟
		}else if(currentNotifyNum <= 15){
			second = 3600;		//每隔1小时
		}else if(currentNotifyNum <= 17){
			second = 43200;		//每隔6小时
		}else {
			second = 86400;		//每隔24小时
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, second);
		return calendar.getTime();
	}
}
