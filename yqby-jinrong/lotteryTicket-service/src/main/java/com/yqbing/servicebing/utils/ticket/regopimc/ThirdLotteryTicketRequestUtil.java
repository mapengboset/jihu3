package com.yqbing.servicebing.utils.ticket.regopimc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqbing.servicebing.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class ThirdLotteryTicketRequestUtil {

    private static final Logger log = LoggerFactory.getLogger(ThirdLotteryTicketRequestUtil.class);

    public static void main(String[] args) {
        try{
            String lotteryTicketInfo = getLotteryTicketInfo("http://admin.500lottery.com:9090/queryLotteryInfo","Z610M01HZ0131");
            JSONObject lotteryTicketJSONObject = JSON.parseObject(lotteryTicketInfo);

            Map<String,Object> lotteryTicketMap = lotteryTicketJSONObject.getJSONObject("body");
            lotteryTicketMap.put("deviceNo","Z610M01HZ0131");
            lotteryTicketMap.put("standbyTicket","4");
            String orderResponse = ThirdLotteryTicketRequestUtil.buildOrder("http://admin.500lottery.com:9090/buildOrder",lotteryTicketMap);
            System.out.println("订单接口："+orderResponse);
            JSONObject orderInfoJSONObject = JSON.parseObject(orderResponse);
            JSONObject orderResponseJSONObject = orderInfoJSONObject.getJSONObject("body");
            String thridOrderNo = orderResponseJSONObject.getString("orderNo");

            // 第三方支付通知
            String payResultResponse = ThirdLotteryTicketRequestUtil.payResult("http://admin.500lottery.com:9090/payResult",thridOrderNo,2000L);
            System.out.println("支付接口："+payResultResponse);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getLotteryTicketInfo(String url,String deviceNo) throws Exception {
        JSONObject paramsMap = new JSONObject(true);
        paramsMap.put("deviceNo",deviceNo);
        String params = ThirdLotteryTicketRequestUtil.requestParams(paramsMap);
        log.info("获取润歌"+url+"接口参数：" + params);
        String response = HttpClientUtil.doPost(url, params);
        log.info("获取润歌"+url+"接口返回值：" + params);
        return response;
    }

    public static String buildOrder(String url,Map<String,Object> lotteryTicketInfoMap) throws Exception {
        String deviceNo = String.valueOf(lotteryTicketInfoMap.get("deviceNo"));
        String priceStr = String.valueOf(lotteryTicketInfoMap.get("price"));
        String standbyTicket = String.valueOf(lotteryTicketInfoMap.get("standbyTicket"));
        String lotteryType = String.valueOf(lotteryTicketInfoMap.get("lotteryType"));
        String lotteryName = String.valueOf(lotteryTicketInfoMap.get("lotteryName"));

        BigDecimal priceBig = new BigDecimal(priceStr);
        BigDecimal standbyTicketBig = new BigDecimal(standbyTicket);
        BigDecimal totalPrice = priceBig.multiply(standbyTicketBig);

        JSONObject paramsMap = new JSONObject(true);
        paramsMap.put("lotteryType",lotteryType);
        paramsMap.put("deviceNo",deviceNo);
        paramsMap.put("price",priceBig.intValue());
        paramsMap.put("standbyTicket",standbyTicketBig.intValue());
        paramsMap.put("lotteryName",lotteryName);
        paramsMap.put("totalPrice",totalPrice.intValue());

        paramsMap.put("mchtId","");
        paramsMap.put("channelNo",7);

        // {"sign":"2adc330f01d053e12766bfe1bc6b0fca"}
        // "sign":"5a1bad5de54b98f264613c542328dac3"
        // 2020010602256372"body":{"lotteryType":"36-0453-000083681","deviceNo":"Z610M01HZ0131","price":500,"standbyTicket":4,"lotteryName":"旺旺","totalPrice":2000,"mchtId":"","channelNo":7}N12Y4J0NXU2J2Z1HDOIY
        // {"head":{"requestId":"2020010602256372","requestTime":"20200106191603","version":1.0},"body":{"lotteryType":"36-0453-000083681","deviceNo":"Z610M01HZ0131","price":500,"standbyTicket":4,"lotteryName":"旺旺","totalPrice":2000,"mchtId":"","channelNo":7},"sign":"48950dbc45ee2cb48a2218030aaf60cf"}
        String params = ThirdLotteryTicketRequestUtil.requestParams(paramsMap);
        log.info("提交订单参数："+params);
        String response = HttpClientUtil.doPost(url, params);
        //String response = HttpClientUtil.send(url, params);
        log.info("返回订单接口："+response);
        return response;
    }

    public static String payResult(String url, String orderNo, long chargeAmt) throws Exception {
        JSONObject paramsMap = new JSONObject(true);
        paramsMap.put("orderNo",orderNo);
        paramsMap.put("chargeDate",LocalDateTime.now().format(LocalDateTimeUtil.df));
        paramsMap.put("chargeAmt",chargeAmt);
        String params = ThirdLotteryTicketRequestUtil.requestParams(paramsMap);
        return HttpClientUtil.doPost(url, params);
    }


    private static JSONObject thirdReGoPiMcHead(){
        JSONObject headJSONObject = new JSONObject(true);
        headJSONObject.put("requestId",LocalDateTime.now().format(LocalDateTimeUtil.dfyMd)+ RandomUtils.getRandomString(8));
        headJSONObject.put("requestTime", LocalDateTime.now().format(LocalDateTimeUtil.df));
        headJSONObject.put("version",1.0);
        return headJSONObject;
    }

    private static String requestParams(JSONObject params){
        JSONObject resultJSONObject = new JSONObject(true);
        String result = "";
        if (params == null || params.size() <= 0) {
            return result;
        }

        // 请求头
        JSONObject headJSONObject = thirdReGoPiMcHead();

        // 验签串
        StringBuilder signStr = new StringBuilder(headJSONObject.get("requestId").toString());
        signStr.append('"'+"body"+'"'+":");
        signStr.append(params.toJSONString());
        signStr.append("N12Y4J0NXU2J2Z1HDOIY");
        log.info("代加密字符串："+signStr.toString());
        String sign = MD5Util.getMD5String(signStr.toString());

        // 请求完整字符串
        resultJSONObject.put("head",headJSONObject);
        resultJSONObject.put("body",params);
        resultJSONObject.put("sign",sign);
        return resultJSONObject.toJSONString();
    }
}
