package com.yqbing.servicebing.utils;


import redis.clients.jedis.Jedis;

public class JedisProducer {

	
      
	
	public static void main(String[] args) {
       Jedis jedis = new Jedis("47.94.211.93");
		  
	      jedis.auth("yqbing2018");
	      
	      jedis.rpush("wxqueryorder", "太难起不从");
	  
	}

}
