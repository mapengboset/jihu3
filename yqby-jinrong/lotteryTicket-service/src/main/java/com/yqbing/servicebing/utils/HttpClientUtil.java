package com.yqbing.servicebing.utils;

import com.yqbing.servicebing.utils.ticket.regopimc.ThirdLotteryTicketRequestUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.HttpStatus;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class HttpClientUtil {

    /**
     * post请求提交
     * @throws IOException
     * @param url
     * @param params
     *
     *{"head": {"requestId": "2019122500000001","requestTime": "20190321100823","version": 1.0},"body": {"deviceNo": "Z610M01HZ0131"},"sign": "ac70244e1653cdd9f8b275c19582be86"}
     *{"head": {"requestId": "2020010287567810","requestTime": "20200102192137","version":1.0},"body":  {"deviceNo": "Z610M01HZ0131"},"sign": "be09834562692dbe71dc44dc910475db"}
     *
     *
     *
     */
    public static String doPost(String url,String params) {
        System.out.println("入参："+params);
        try {
            HttpClient httpClient = HttpClients.createDefault();
            HttpPost postMethod = new HttpPost(url);//传入URL地址
            //设置请求头
            postMethod.addHeader("Content-type", "application/json; charset=utf-8");
            //传入请求参数
            postMethod.setEntity(new StringEntity(params, Charset.forName("UTF-8")));
            HttpResponse response = httpClient.execute(postMethod);//获取响应
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("HTTP Status Code:" + statusCode);
            if (statusCode != HttpStatus.SC_OK) {
                System.out.println("HTTP请求未成功！HTTP Status Code:" + response.getStatusLine());
            }
            HttpEntity httpEntity = response.getEntity();
            String reponseContent = EntityUtils.toString(httpEntity);
            EntityUtils.consume(httpEntity);//释放资源
            System.out.println("响应内容：" + reponseContent);
            return reponseContent;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
