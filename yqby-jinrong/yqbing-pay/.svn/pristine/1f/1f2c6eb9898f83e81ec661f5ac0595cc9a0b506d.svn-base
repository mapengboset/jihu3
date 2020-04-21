package com.yqbing.servicebing.utils.pay;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yqbing.servicebing.utils.md5.MD5;

/**
 * Title:SignUtil.java
 * Description:
 * @author alexaz
 * 2019年7月16日
 */
public class SignUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(SignUtil.class);
	
	/**
	 * 生成签名，可以屏蔽不参加签名的参数, 自定义秘钥
	 * @param paramValues
	 * @param ignoreParamNames
	 * @param secret
	 * @param charset
	 * @param signType 只支持MD5
	 * @param sign
	 * @return 
	 */
	public static boolean checkSign(Map<String, String> paramValues, String secret, String signType, String sign) {
		
		SignData signData = sign(paramValues, secret, signType);
		return sign != null && sign.equalsIgnoreCase(signData.getSign());
    }  

	/**
	 * 生成customer签名
	 * @param paramValues
	 * @param secret
	 * @param charset
	 * @param signType
	 * @param decode
	 * @return
	 */
	public static SignData sign(Map<String, String> paramValues, String secret, String signType) {
		
		if(StringUtils.isBlank(signType)){
			signType = "MD5";
		}
		
		SignData signData = new SignData();
        try {  
        	paramValues.put("signType", signType);
        	paramValues.remove("sign");
        	
            StringBuilder sb = new StringBuilder();  
            List<String> paramNames = new ArrayList<String>(paramValues.keySet());  
            Collections.sort(paramNames);
            
            int num = 1;
            for (String paramName : paramNames) {
            	sb.append(paramName).append("=").append(paramValues.get(paramName));
                if(num++ < paramNames.size()){
                	sb.append("&");
                }
            }  
            sb.append("#").append(secret);
            
            String signParam = sb.toString();
            LOG.info("sign before = {}", signParam);
            String sign = MD5.md5UTF8(signParam);
            LOG.info("sign after = {}", sign);
            signData.setSignParam(signParam);
            signData.setSign(sign);      
            paramValues.put("sign", sign);
        } catch (Exception e) {  
             LOG.error("", e);
        }
        LOG.info("sign is " + signData);
        return signData; 
    }  
	
	public static class SignData implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private String sign;
		
		private String signParam;
		
		public SignData() {
			
		}
		
		public SignData(String sign, String signParam) {
			super();
			this.sign = sign;
			this.signParam = signParam;
		}

		public String getSign() {
			return sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getSignParam() {
			return signParam;
		}

		public void setSignParam(String signParam) {
			this.signParam = signParam;
		}
		
		@Override
		public String toString() {
			return "SignData [sign=" + sign + ", signParam=" + signParam + "]";
		}
	}

	
	public static void main(String[] args){
		

	}


}
