package com.yqbing.servicebing.service.jedis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yqbing.servicebing.webapp.controller.wx.CommonController;

import redis.clients.jedis.JedisPubSub;

public class RedisMsgPubSubListener  extends JedisPubSub {
    private Logger logger = LoggerFactory.getLogger(RedisMsgPubSubListener.class);
    
    @Override
    public void unsubscribe() {
        super.unsubscribe();
    }
 
    @Override
    public void unsubscribe(String... channels) {
        super.unsubscribe(channels);
    }
 
    @Override
    public void subscribe(String... channels) {
        super.subscribe(channels);
    }
 
    @Override
    public void psubscribe(String... patterns) {
        super.psubscribe(patterns);
    }
 
    @Override
    public void punsubscribe() {
        super.punsubscribe();
    }
 
    @Override
    public void punsubscribe(String... patterns) {
        super.punsubscribe(patterns);
    }
 
    @Override
    public void onMessage(String channel, String message) {
        logger.info("onMessage: channel[{}], message[{}]",channel, message);
      //  orderquery(order.getOutTradeNo(), 12);
        //调微信查询
        try {
			CommonController.orderquery(message, 12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.unsubscribe();
    }
 
    @Override
    public void onPMessage(String pattern, String channel, String message) {
        logger.info("onPMessage: pattern[{}], channel[{}], message[{}]", pattern, channel, message);
    }
 
    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        logger.info("onSubscribe: channel[{}], subscribedChannels[{}]", channel, subscribedChannels);
        
    }
 
    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        logger.info("onPUnsubscribe: pattern[{}], subscribedChannels[{}]", pattern, subscribedChannels);
        
    }
 
    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        logger.info("onPSubscribe: pattern[{}], subscribedChannels[{}]", pattern, subscribedChannels);
        
    }
 
    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        logger.info("channel:{} is been subscribed:{}", channel, subscribedChannels);
    }
}
