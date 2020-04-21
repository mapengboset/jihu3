package com.yqbing.servicebing.webapp.wxpay.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date: 2014/10/29
 * Time: 15:23
 */
public class Signature {
	
	private static Logger logger=LoggerFactory.getLogger(Signature.class);

    public static String getSign(Map<String,Object> map){
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
        String result = sb.toString();
        result += "key=" + Configure.getKey();
        logger.error("Sign Before MD5:" + result);
        result = MD5.MD5Encode(result).toUpperCase();
        logger.error("Sign Result:" + result);
        return result;
    }
/*    public static String getHMACSign(Map<String,Object> map){
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
        String result = sb.toString();
        result += "key=" + Configure.getKey();
        logger.error("Sign Before MD5:" + result);
        result = hash_hmac("sha256",result, Configure.getKey()).toUpperCase();
        logger.error("Sign Result:" + result);
        return result;
    }*/
    
    /**
     * HmacSHA256类型签名
     * @param map
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static String paySignDesposit(Map<String, Object> map, String key) throws Exception{
        Map<String, String> params = new HashMap<String, String>();
        Set<String> set = map.keySet();
        for (String string : set) {
            if(!map.get(string).equals("")){
                params.put(string, String.valueOf(map.get(string)));
            }
        }
      
        String string1 = createSign(params);
        String stringSignTemp = string1 + "&key=" + key;
        //return DigestUtils.sha256Hex(stringSignTemp).toUpperCase();
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        //  utf-8 : 解决中文加密不一致问题,必须指定编码格式
        return byteArrayToHexString(sha256_HMAC.doFinal(stringSignTemp.getBytes("utf-8"))).toUpperCase();
    }
    
    /**
     * 将加密后的字节数组转换成字符串
     *
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b!=null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }
    
    /**
     * 构造package
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String createSign(Map<String, String> params) throws UnsupportedEncodingException {
        Set<String> keysSet = params.keySet();
        Object[] keys = keysSet.toArray();
        Arrays.sort(keys);
        StringBuffer temp = new StringBuffer();
        boolean first = true;
        for (Object key : keys) {
            if (first) {
                first = false;
            } else {
                temp.append("&");
            }
            temp.append(key.toString()).append("=");
            Object value = params.get(key);
            String valueString = "";
            if (null != value) {
                valueString = value.toString();
            }
            temp.append(valueString);
        }
        return temp.toString();
    }
    /**
     * 从API返回的XML数据里面重新计算一次签名
     * @param responseString API返回的XML数据
     * @return 新鲜出炉的签名
     * @throws Exception 
     */
    public static String getSignFromResponseString(String responseString) throws Exception {
        Map<String,Object> map = XmlUtil.doXMLParse(responseString);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign","");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        return Signature.getSign(map);
    }

    /**
     * 检验API返回的数据里面的签名是否合法，避免数据在传输的过程中被第三方篡改
     * @param responseString API返回的XML数据字符串
     * @return API签名是否合法
     * @throws Exception 
     */
    public static boolean checkIsSignValidFromResponseString(String responseString) throws Exception {

        Map<String,Object> map = XmlUtil.doXMLParse(responseString);
        logger.error(map.toString());

        String signFromAPIResponse = map.get("sign").toString();
        if(signFromAPIResponse=="" || signFromAPIResponse == null){
        	logger.error("API返回的数据签名数据不存在，有可能被第三方篡改!!!");
            return false;
        }
        logger.error("服务器回包里面的签名是:" + signFromAPIResponse);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign","");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        String signForAPIResponse = Signature.getSign(map);

        if(!signForAPIResponse.equals(signFromAPIResponse)){
            //签名验不过，表示这个API返回的数据有可能已经被篡改了
        	logger.error("API返回的数据签名验证不通过，有可能被第三方篡改!!!");
            return false;
        }
        logger.error("恭喜，API返回的数据签名验证通过!!!");
        return true;
    }
    
    
 

}
