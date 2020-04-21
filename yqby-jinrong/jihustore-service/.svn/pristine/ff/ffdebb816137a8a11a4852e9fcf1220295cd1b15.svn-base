package com.yqbing.servicebing.utils.wx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: rizenguo
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

   
    
    
    public static void main(String[] args) throws IllegalAccessException {
    	Map<String, Object> packageParams = new HashMap<>();
		packageParams.put("appid", "wx6e3b92a84b8a737a");
		packageParams.put("mch_id", "1405193702");
		packageParams.put("nonce_str", "1634358275");
		packageParams.put("body", "私教服务");
		packageParams.put("attach", "5");
		packageParams.put("out_trade_no", "16112916343500001");
		packageParams.put("total_fee", "1");
		packageParams.put("spbill_create_ip", "223.223.198.235");
		packageParams.put("notify_url", "http://wx.techfit.cn/gym-web/weixin/tenpay/pay_notify");
		packageParams.put("trade_type", "JSAPI");
		packageParams.put("openid", "o0WHmwFGN14ZEiRNoDqABOsFLDK4");
		Configure.setKey("46100784FDA3CEF41908722B2FE50261");
		String sign = Signature.getSign(packageParams);
		System.err.println(sign);
	}

}
