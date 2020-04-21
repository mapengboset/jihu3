package com.yqbing.servicebing.webapp.wxpay.util;

import java.util.UUID;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yqbing.servicebing.utils.StringUtil;


public class WeixinUtil {

	private static Logger LOGGER = LoggerFactory.getLogger(WeixinUtil.class);

	public static String OAUTH2_TOKEN_API = "https://api.weixin.qq.com/sns/oauth2/access_token";
	public static String ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token";
	public static String USER_INFO = "https://api.weixin.qq.com/cgi-bin/user/info";

	/**
	 * 
	 * @Description 根据微信公众号网页授权获得的code来获取openid
	 * @param code 微信公众号网页授权返回的code
	 * @param appid 公众号appid
	 * @param secret 公众号secret
	 * @return 用户openid或者""
	 * @throws Exception
	 */
	public static String getOpenidByCode(String code, String appid, String secret) {
		String url = OAUTH2_TOKEN_API;
		StringBuffer sb = new StringBuffer();
		sb.append("appid=" + appid);
		sb.append("&secret=" + secret);
		sb.append("&code=" + code);
		sb.append("&grant_type=authorization_code");
		LOGGER.info("获取用户参数appid：{}，secret：{}，code：{}", appid, secret, code);
		String result = HttpRequest.sendPost(url, sb.toString());
		LOGGER.info("获取用户参数返回结果为：{}", result);
		JSONObject json = new JSONObject(result);
		String openid = json.optString("openid", "");
		LOGGER.info("获取用户【openid】:" + openid);
		return openid;
	}

	/**
	 * 
	 * @param grant_type 获取access_token填写client_credential
	 * @param appid 公众号appid
	 * @param secret 公众号secret
	 */

	public static String getAccessToken(String appid, String secret) {
		String url = ACCESS_TOKEN;
		StringBuffer sb = new StringBuffer();
		sb.append("grant_type=" + "client_credential");
		sb.append("&appid=" + appid);
		sb.append("&secret=" + secret);
		String result = HttpRequest.sendGet(url, sb.toString());
		LOGGER.error("获取access_token结果:");
		LOGGER.error(result);
		JSONObject json = new JSONObject(result);
		String access_token = json.optString("access_token");
		if(StringUtil.isNotEmpty(access_token)){
			String errcode = String.valueOf(json.get("errcode"));
			LOGGER.error("获取access_token出现错误【errcode】:",errcode);
			return errcode;
		}
		LOGGER.error("获取【access_token】:",access_token);
		return access_token;

	}

	/**
	 * 获取微信昵称,性别等等
	 * 
	 * 
	 * @param access_token access_token
	 * @param openid openid
	 */

	public static String getUserInfo(String openid, String access_token) {
		String url = USER_INFO;
		StringBuffer sb = new StringBuffer();
		sb.append("access_token=" + access_token);
		sb.append("&openid=" + openid);
		String result = HttpRequest.sendGet(url, sb.toString());
		JSONObject json = new JSONObject(result);
		String ns = null;
		LOGGER.info("获取用户【json】:" + json.toString());
		try {
			String nickname = (String) json.get("nickname");
			String city = (String) json.get("city");
			String headimgurl = (String) json.get("headimgurl");
			int sex = (int) json.get("sex");
			ns = nickname + "&" + sex + "&" + city + "&" + headimgurl;
			LOGGER.info("获取" + "用户【nickname】:" + sex);

		} catch (Exception e) {
			// TODO: handle exception18735094654
			String errcode = "40013";
			LOGGER.info("获取用户出现错误【errcode】:" + errcode);
			return errcode;
		}
		return ns;
	}
	
	public static String generateOrderSN() {
	    StringBuffer orderSNBuffer = new StringBuffer();
	    orderSNBuffer.append(System.currentTimeMillis());
	    orderSNBuffer.append(createNonceStr());
	    return orderSNBuffer.toString();
	}

	/**
	 * 获取随机字符串
	 * @param len
	 * @return
	 */
	public static String createNonceStr() {
        String s = UUID.randomUUID().toString();
        // 去掉“-”符号
     	return s.replaceAll( "\\-","").toUpperCase();
	}
	/**
	  * unicode转字符串
	  *
	  * @param unicode
	  * @return
	  */
	 public static String unicodeToString(String unicode) {
	  StringBuffer sb = new StringBuffer();
	  String[] hex = unicode.split("\\\\u");
	  for (int i = 1; i < hex.length; i++) {
	   int index = Integer.parseInt(hex[i], 16);
	   sb.append((char) index);
	  }
	  return sb.toString();
	 }
}
