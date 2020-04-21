package com.yqbing.servicebing.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * MD5签名
 * @Autor Jason
 */
public class SignUtils {
    private static final String salt = "yqby-agent-submitOrder";

    public static String getSign(Map<String,Object> valueMap){
        String sign = StringUtils.EMPTY;
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        if(valueMap != null && valueMap.size() > 0){
            for (String key : valueMap.keySet()) {
                String v = (String)valueMap.get(key);
                BasicNameValuePair pair = new BasicNameValuePair(key, v);
                list.add(pair);
            }
        }
        BasicNameValuePair signpair = new BasicNameValuePair("sign", salt);
        list.add(signpair);
        sign = MD5Utils.encrypt(list.toString());
        return sign;
    }

   /* public static void main(String args[]){
        Map<String,Object> map = new HashMap<>();
        map.put("key","key");
        map.put("valye","1232132");
        System.out.println(getSign(map));
    }*/




}
