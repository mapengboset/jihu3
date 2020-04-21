package com.yqbing.servicebing.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import sun.security.krb5.internal.crypto.Des;

public class TokenUtils {

	/**
	 * 根据用户Id生成token 并对token进行缓存
	 * 
	 * @Title generate
	 * @Description 根据用户Id生成token 并对token进行缓存
	 * @author Alan
	 * @date 2015年9月11日 下午5:05:00
	 * @updateTime 2015年9月11日 下午5:05:00
	 * @udpateAuthor Alan
	 * @param userId
	 *            用户ID
	 * @return
	 * @return String token
	 */
	/*public static String generate(long userId) {
		// 拼接基础token
		StringBuffer buf = new StringBuffer();
		// 用户ID
		buf.append(userId);
		buf.append("_");
		// 登录时间
		buf.append(getUnixTime());
		buf.append("_");
		// 10位随机字符串
		buf.append(RandomUtils.generateString(10));
		// 加密
		String token = buf.toString();
		// TODO token 加密
		// token = ThreeDesUtils.encrypt(TOKEN_SECRET,token);
		String userIds = String.valueOf(userId);
		// 缓存token
		CmCache.getInstance().setToken(userIds, token);
		return token;
	}

	*//**
	 * 校验token是否有效
	 * 
	 * @Title checkToken
	 * @Description 校验token是否有效
	 * @author Alan
	 * @date 2015年9月11日 下午5:06:21
	 * @updateTime 2015年9月11日 下午5:06:21
	 * @udpateAuthor Alan
	 * @param token
	 *            用户token
	 * @return
	 * @return boolean 校验结果 ture校验通过 false 校验失败
	 *//*
	public static boolean checkToken(String token) {
		// 校验入参
		if (StringUtils.isBlank(token)) {
			return false;
		}
		// 解析token
		String tokenMing;
		try {
			tokenMing = token;
			// TODO token 解密
			// tokenMing = ThreeDesUtils.decode(TOKEN_SECRET, token);
		} catch (Exception e) {
			return false;
		}
		if (StringUtils.isBlank(tokenMing)) {
			return false;
		}
		String[] tokenMings = tokenMing.split("_");
		if (tokenMings == null || tokenMings.length <= 1) {
			return false;
		}
		String cacheToken = CmCache.getInstance().getToken(tokenMings[0]);
		if (StringUtils.isBlank(cacheToken)) {
			return false;
		}
		return cacheToken.equals(token);
	}

	*//**
	 * 根据用户token获取用户ID
	 * 
	 * @Title getTokenUserId
	 * @Description 根据用户token获取用户ID
	 * @author Alan
	 * @date 2015年9月11日 下午5:09:02
	 * @updateTime 2015年9月11日 下午5:09:02
	 * @udpateAuthor Alan
	 * @param token
	 * @return
	 * @return String 返回类型
	 *//*
	public static String getTokenUserId(String token) {
		if (checkToken(token)) {
			if (StringUtils.isBlank(token)) {
				return null;
			}
			String tokenMing = token;
			try {
				tokenMing = token;
				// TODO token 解密
				// tokenMing = ThreeDesUtils.decode(TOKEN_SECRET, token);
			} catch (Exception e) {
				return null;
			}
			if (StringUtils.isBlank(tokenMing)) {
				return null;
			}
			String[] tokenMings = tokenMing.split("_");
			if (tokenMings == null || tokenMings.length <= 1) {
				return null;
			}
			return tokenMings[0];
		}
		return null;
	}

	public static boolean logOffToken(String token) {
		String userId = getTokenUserId(token);
		if (StringUtils.isNotBlank(userId)) {
			boolean result = CmCache.getInstance().delToken(userId);
			return result;
		}
		return true;
	}

	protected static String format(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	protected static String format(int length, int shortval) {
		String formatted = Integer.toString(shortval);
		StringBuffer buf = null;
		if (length >= formatted.length()) {
			buf = new StringBuffer("");
			for (int i = 0; i < length; i++) {
				buf.append("0");
			}
			buf.replace(length - formatted.length(), length, formatted);
		} else {
			buf = new StringBuffer(formatted);
		}
		return buf.toString();
	}

	protected static String getUnixTime() {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		long curr = cal.getTimeInMillis();
		curr = curr / 1000;
		StringBuffer buf = new StringBuffer();
		buf.append(curr);
		return buf.toString();
	}*/


	/**
	 * @param rcId 平台id
	 * @param appId
	 *            应用id
	 * @param md5Password
	 *            用户md5密码
	 * @return Token字符串
	 * @throws Exception
	 */
	
	public static String getToken(String userId, String md5Password) {
		StringBuffer tokenSb = new StringBuffer();
		try {
		//	UID
			tokenSb.append(DesUtil.encrytWithBase64(userId + UIdUtil.getUUIdPart() + md5Password));
			tokenSb.append(DES.encryptDES(userId)).append(UIdUtil.getUUIdPart()).append(DES.encryptDES(md5Password));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return tokenSb.toString();
	}

/*	*//**
	 * @param rcId 平台id
	 * @param appId
	 *            应用id
	 * @param md5Password
	 *            用户md5密码
	 * @return Token字符串
	 * @throws Exception
	 *//*
	
	public static String getTokenByMobile(String mobile) {
		StringBuffer tokenSb = new StringBuffer();
		try {
			tokenSb.append(DesUtil.encrytWithBase64(mobile + UIdUtil.getUUIdPart()));
			tokenSb.append(DES.encryptDES(mobile)).append(UIdUtil.getUUIdPart());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return tokenSb.toString();
	}

	public static void main(String[] args) {
		long userId = 17484;
		String token = generate(userId);
		// token="mjNNh/wr8neUtvT7M3QPtjGTixS8p5f8LjE3DA6BRes=";
		System.out.println("token:" + token + "\t" + token.length());
		// System.out.println("check:" +
		// checkToken("IFs3w8Qa4R/6OM1LSuHQw6WwCJP1Ijz2VHe5jFtOfU0="));
		System.out.println("check:" + checkToken(token));
		// System.out.println("getUserId:" + getTokenUserId(token));
		// System.out.println("logOff:"+logOffToken(token));
		// System.out.println("check:" + checkToken(token));
		// System.out.println("getUserId:" + getTokenUserId(token));
	}*/
}
