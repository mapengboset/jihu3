package com.yqbing.servicebing.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MeituanSign {
	
	/**
	* 利用 java 原生的摘要实现 SHA256 加密
	* @param str 加密后的报文
	* @return
	*/
	public static String string2SHA256StrJava(String str){
		MessageDigest messageDigest;
		String encodeStr = "";
		try {
		messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update(str.getBytes("UTF-8"));
		encodeStr = byte2Hex(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encodeStr;
	}
	
	/**
	* 将 byte 转为 16 进制
	* @param bytes
	* @return
	*/
	private static String byte2Hex(byte[] bytes){
		StringBuffer stringBuffer = new StringBuffer();
		String temp = null;
		for (int i=0;i<bytes.length;i++){
			temp = Integer.toHexString(bytes[i] & 0xFF);
			if (temp.length()==1){
				stringBuffer.append("0");
			}
			stringBuffer.append(temp);
		}
			return stringBuffer.toString();
		}
	
	public static void main(String[] args) {
		String stringToSign= "/tspopenapi/union/buildPartnerUrls?{\"userRole\":\"firstLevelPartner\",\"partnerAppId\":\"3615585995031466\",\"activityId\":\"\",\"auTraceKey\":\"45AEDD665B374D73\",\"createCount\":\"2\"}1560909765676bdcb5e82edf04f528cc6b193ece784a2";
		String sign = string2SHA256StrJava(stringToSign);
		System.out.println(sign);
	}
	
	
}
