package com.yqbing.servicebing.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class MeituanCreateLinkUtil {
	
	public static final String serverUrl = "https://openapi.waimai.meituan.com/tspopenapi/union/buildPartnerUrls";
	
	
	/**
	 * 生成美团拉新链接
	 * @author gavin
	 */
	public static String createMeituanLink(String serverUrl,
		String bodyJson,
		Map<String, String> headers) throws ParseException, IOException {
		
		long timestamp = System.currentTimeMillis();
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(serverUrl);
		String body = "";

		httpPost.addHeader("Content-Type", "application/json");
		httpPost.setEntity(new StringEntity(bodyJson, ContentType.APPLICATION_JSON));

		if (null != headers && headers.size() > 0) {
		   for (String key : headers.keySet())
			   httpPost.setHeader(key, headers.get(key));
		}

		CloseableHttpResponse response = client.execute(httpPost);
	    HttpEntity entity = response.getEntity();
		if (entity != null) {
		   body = EntityUtils.toString(entity, "UTF-8");
		}
		EntityUtils.consume(entity);
		response.close();

	//	System.out.println( timestamp + "【headers】：" + headers.toString());
	//	System.out.println( timestamp + "【请求地址】：" + serverUrl + "\n【请求参数】：" + bodyJson +  "\n【请求结果】：" + body);
		return body;
    }
	
}
