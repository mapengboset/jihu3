/*package com.yqbing.servicebing.webapp.request;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.xiangshi.zanbei.pcreditpay.utils.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TradeQuery {

    private static TestRestTemplate template = new TestRestTemplate();

    private static final String privatekey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCxS0IyphYV3Uj+" +
            "4rJm5vzcKXqwBiRvCYcKOL4YQSblthI2aQOIgCovGlEikP82xOS/V9hwslR0vD/e" +
            "e70cCy2EBCGQmEOmZNWppTgUdMl75USgiMzcv4l90F4NVeXu8SiO+P3G3ss/VdXg" +
            "RyHP/qPm3KFuWdWXIHfhSjmfLfxSvbQw2ykMYz9MtJEj45UPkobR9IiQzL755aaA" +
            "JcMGEhuqrbBAumy/I46QhO4lvHvTazsTxPooRnZS4az9V8QrDxPsNFfgXnb5AID5" +
            "jIsQQfWna/pYxbG71JILFYO3X4122j01CQGJ4HXXsEnTXWLlibQcM1qHfQDy5Y4H" +
            "I3LXvjgbAgMBAAECggEBAJUY30DM38HfaGXBq5pSIs/bqiuh3r3qW0BDW8n18Io5" +
            "xbMwOSJv9gnKrfTNz3L1vhEUBRcxQUkyjtvBX9XXqJ1fBAMfqbSjE/Qo17KMTGz+" +
            "7+m5Yd86zJubwZyhYk7BTASAbJrz/iTzQHvuFgde8+NQJAozTiZbzbUOwMqW152U" +
            "OJOT0BYYZbvnhTuRq7cKyfuD6EhdV2ktN1t0W7bEEaZdgQGNcuMMpyOGjWnsouSB" +
            "V+bRdX2jFZyW0l+7U05stskL3pUmaNz5Q5Xs0nVhlNHnbvbyKNs5WM4iPt+MRsJY" +
            "jfAWh9zGCMqhYyPZmOyxqzmBBBenUUkXlvW51GiyZVECgYEA4qTk2ssAB01rRDLK" +
            "KDGIbuV+vPDneSTKItNjDk2J3bbcY2ChRpRbvRM3fu1OKz+cJS6iGqz+UF1NNe9K" +
            "rES80gE7yg38dbOESx9uCd1TjMJSUkTOv4fVfkLaEJgsMgwiBDEIwOuWqvIBKXKX" +
            "tFFM6O9wA0WS3QiujCf3Uzbk2WcCgYEAyEIBAlbdCYJs1DJdkczoGOENf9Y7zKKF" +
            "eyTG+64/1ciRasGBM9blPQS7K8FkBvDa1dTkKkc6a+BJHrl8txdrAmBh0Z+jG6qt" +
            "xN9wuiwtaZgTt2BnzMlZH56shVl4bPQEbQklN4bcGadBbIMC17aNJq7/AucU0p4e" +
            "JcCWKDgOVy0CgYAp2vfkrA6iSprfql2JFLS0fi9spzSoO7IUwmMNtiYayvViaOr/" +
            "xNA4V78s8pg4BnRIrZcERCRnJQPoTPvGWp9gTRgElZalCfUJhpFkwvn2CcD4Lnrc" +
            "BjLYMXJiFCg9Sd5SVdffAOL/SNgMFnyLsWP5tJZEFGot5beObKcROBcFSwKBgQCR" +
            "eelzwph2RQo8KI5y0XE2SZ9d48qzQMlJCRGIWjBDZJ3G+OWcPBtx9VLnWWkJ5cSD" +
            "nFFYKUBWh6t2p3bjJx70rgHBn3+FJLtxjoQ8qsUetXx1NZKSYR7eao2XncRvGeFx" +
            "ODiSGuUfubI8WvwgqpvlozDb8fTdgEIUWNB8TSSVzQKBgCmu/XhFLRoIlyHC8Xg+" +
            "vDsW/DMpTlldMTSoIAwcxCAhhLjxTr8760CDUzsfk/Bfn+jzLlVY9zun78eds6lx" +
            "UlRuTO/mYjyRTCkgho8fw4GpdgmnEhR/PUX30geHEU/Jn1Uk1bnP34ei5Fb2+YS0" +
            "EOgN9DwwRVNixE/9Z06Ul4RI";

    static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxm3d289lHfuXenK90mvPSyCe/opF/MrFNbKHnaiTO3EQNqam+vb/+bdBvr5KrKs8Zmj+IN8PmOq9GW6DM4i/StAj42Lh6danpKqrygtpygkr0X3Pw5mPmYwTnaigRMHG/Cz78W8UrYO1C7WQwgXZzytNwe0sEK+EqEhcLL3mn9LRLXjwlk6M0Tt4keEqZNJrHk0KhH7AXCvtVSEuNC2krKdZNQpCGGKi5fnM3PzQqEfpO+/w/w9O1n85+Ia7mZckOBQau7OUnQ7/3Qxp1ttHrMhjlquV4g2pJm/Rm5fO0K2ao4sfI1zPvm5doTFyYddahdaFeSBddzWFSW6iIi3qTQIDAQAB";


    private static final DateFormat yyyy_MM_dd_HH_mm_ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

     private static final String gateway = "http://172.16.4.9:8086/gateway.do";



    public static void main(String[] args) throws Exception {
//        String result = testTradeQuery("154278560164943330826");
//        System.err.println(result);
//        verify(result);

        System.err.println(url());
    }

    static void verify(String result) throws AlipayApiException {
        JSONObject object = JSONObject.parseObject(result).getJSONObject("Response");
        Map<String,String> params = object.toJavaObject(Map.class);
        boolean ss =  AlipaySignature.rsaCheckV1(params,publicKey,"UTF-8","RSA2");
        System.err.println(ss);
    }

    *//**
     * 交易查询
     * *//*
    static String testTradeQuery(String trade_no) throws Exception {
        JSONObject request = getRequest("alipay.trade.query");
        JSONObject object = new JSONObject();
        object.put("trade_no",trade_no);//对应单号
       // object.put("out_trade_no","153959468312971116385");
        request.put("biz_content",object.toJSONString());

        Map<String,String> params = request.toJavaObject(Map.class);
       // return sendPost(params);
        return httpPost(params);
    }

    *//**
     * 退款接口
     * *//*
    static String testTradeRefund(String trade_no) throws Exception {
        JSONObject request = getRequest("alipay.trade.refund");
        JSONObject object = new JSONObject();
        object.put("trade_no",trade_no);//对应单号
        //  object.put("out_trade_no","154106621350069810320");//对应单号
        request.put("biz_content",object.toJSONString());

        Map<String,String> params = request.toJavaObject(Map.class);
      //  return sendPost(params);//二选一
        return httpPost(params);
    }

    *//**
     * H5拼接
     * *//*
    static String url() throws Exception {
        Map<String,String> params = new HashMap<>();
        params.put("totalAmount","188.8");
        params.put("body","圣诞夜超大、超红苹果~紧188哦");
        params.put("payType","1");
        params.put("merchantId","201812201506521201157454");
        params.put("notifyUrl","http://duchong.ngrok.zanclick.cn/open/merchant/notify.htm");
        params.put("outTradeNo","HBFQ1543304684380506");
        String content = AlipaySignature.getSignCheckContentV1(params);
        String sign = AlipaySignature.rsa256Sign(content,privatekey,"UTF-8");
        params.put("signType","RSA2");
        StringBuffer sb = new StringBuffer();
        sb.append("http://duchong-html.ngrok.zanclick.cn/open/html/pay.html");
        for (String key:params.keySet()){
            if (sb.indexOf("?")==-1){
                sb.append("?").append(key).append("=").append(params.get(key));
            }else {
                sb.append("&").append(key).append("=").append(params.get(key));
            }
        }
        sb.append("&").append("sign=").append(sign);
        return sb.toString();
    }


    static JSONObject getRequest(String method){
        JSONObject request = new JSONObject();
        request.put("app_id","2018091414234911145");
        request.put("method",method);
        request.put("timestamp",yyyy_MM_dd_HH_mm_ss.format(new Date()));
        request.put("charset","utf-8");
        request.put("format","JSON");
        request.put("version","1.0");
     //   request.put("sign_type","RSA2");
        return request;
    }

    static String sendPost(Map<String,String> params) throws AlipayApiException {
        String content = AlipaySignature.getSignCheckContentV1(params);
        params.put("sign",AlipaySignature.rsa256Sign(content,privatekey,params.get("charset")));
        params.put("sign_type","RSA2");
        MultiValueMap<String, Object> postParameters = new LinkedMultiValueMap<>();
        for (String key:params.keySet()){
            postParameters.add(key,params.get(key));
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, Object>> r = new HttpEntity<>(postParameters, headers);
        String result = template.postForObject(gateway,r,String.class);
        return result;
    }

    static String httpPost(Map<String, String> map) throws AlipayApiException {
        String content = AlipaySignature.getSignCheckContentV1(map);
        map.put("sign",AlipaySignature.rsa256Sign(content,privatekey,map.get("charset")));
        map.put("sign_type","RSA2");

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(gateway);
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        String str = null;
        try {
            if (null != map) {
                List<NameValuePair> nvps = new ArrayList<NameValuePair>();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
                    }
                }
                httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            }
            HttpResponse result = httpClient.execute(httpPost);
            if (result.getStatusLine().getStatusCode() == 200) {
                try {
                    str = EntityUtils.toString(result.getEntity());
                } catch (Exception e) {
                   e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
*/