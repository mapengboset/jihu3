package com.yqbing.servicebing.service.jedis;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

@Service
public class RedisSub {
	@Value("${redis.host}")
	private static  String host;
	@Value("${redis.password}")
	private static String password;
	@Value("${redis.port}")
	private static String port;
	public static void subjava(String amount) {
	    
        Jedis jr = null;
        try {
        	 jr = new Jedis(host, 6379, 0);// redis服务地址和端口号
             jr.auth(password);
             
             jr.publish("wxOrder", amount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jr != null) {
                jr.disconnect();
                jr.close();
            }
        }
		
    }
	
}
