package com.yqbing.servicebing.service.jedis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

@Service
public class JedisPulseOn implements  ApplicationListener<ContextRefreshedEvent> {

	private static Logger logger = LoggerFactory.getLogger(JedisPulseOn.class);
	@Value("${redis.host}")
	private  String host;
	@Value("${redis.password}")
	private  String password;
	@Value("${redis.port}")
	private  String port;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		 if (event.getApplicationContext().getParent() == null) {
			
				Thread thread = new Thread(new Runnable() {
     	            @Override
     	            public void run() {
     	            	 subjava();
     	            }
     	        });
				thread.start();
	        }
	}
	
    public void subjava() {
    	while(true){
        Jedis jr = null;
        try {
            jr = new Jedis(host, 6379, 0);// redis服务地址和端口号
            jr.auth(password);
            RedisMsgPubSubListener sp = new RedisMsgPubSubListener();
            jr.subscribe(sp, "wxOrder");

        } catch (JedisConnectionException  e) {
        	
            e.printStackTrace();
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            try{

            	 if (jr != null) {
                     jr.disconnect();
                     jr.close();
                 }
        } finally {
        	  jr.close();
        }
    	}
    }
    }
    
  /*  public void gets(final String... channels){
    	Runnable run = new Runnable(){
			String[] allChannels = channels;
			@Override
			public void run() {
				// 如果连接异常则释放当前连接对象重新申请连接
				for(;;){
					try{
						getJedis().subscribe(jedisPubSub,allChannels);
						break;
					} catch (JedisConnectionException e) {
						// 释放当前连接再试
						releaseJedis();
						logger.error("Subscribing failed. {}", e.getMessage());
						// 延时后再试
						try {
							Thread.sleep(RECONNECT_DELAY_MILLS);
						} catch (InterruptedException e1) {
						}
						// 重新注册所有频道
						allChannels = channelSubs.keySet().toArray(new String[0]);
					}catch (Exception e) {
						logger.error("Subscribing failed.", e);
					}
				}
			}};
		subscribeExecutor.execute(run);
    }
    
    *//**
	 * 释放当前的{@link Jedis}实例<br>
	 * 向{@link JedisPoolLazy}归还{@link Jedis}实例，并将{@link #jedis}置为{@code null}
	 *//*
	private void releaseJedis(){
		// double check
		if(jedis != null){
			synchronized (this) {
				if(jedis != null){
					pool.releaseJedis(jedis);
					jedis = null;
				}
			}
		}
	}*/
}
