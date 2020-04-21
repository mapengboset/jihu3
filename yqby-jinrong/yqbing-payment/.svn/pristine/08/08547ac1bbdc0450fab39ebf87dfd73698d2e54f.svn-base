package com.yqbing.servicebing.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;



public class SignUtils {
	
	
	public static String HMACSHA256(Map<String,Object> map, String key) throws Exception {

		
	    ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
            if(entry.getValue()!=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String data = sb.toString();
       
		
		
		
	       Mac sha256_HMAC = Mac.getInstance("HmacSHA256");

	       SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");

	       sha256_HMAC.init(secret_key);

	       byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));

	       StringBuilder sb1 = new StringBuilder();

	       for (byte item : array) {

	           sb1.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));

	       }

	       return sb1.toString().toUpperCase();

	   }
}
