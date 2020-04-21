package com.yqbing.servicebing.utils.pay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TradeUtil {

	public static String getNewTradeId(){
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String time = simpleDateFormat.format(new Date());
		
		Random rand = new Random();
		int randNum = rand.nextInt(89999) + 10001;
		return time + randNum;
	}
	
	public static String newTradeId(Integer customerId){
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String time = simpleDateFormat.format(new Date());
		
		Random rand = new Random();
		int randNum = rand.nextInt(89999) +  + 10001;
		return time + customerId + randNum;
	}
}
