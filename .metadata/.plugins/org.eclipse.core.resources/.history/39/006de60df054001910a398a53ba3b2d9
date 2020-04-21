package com.yqbing.servicebing.utils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/**
 * HttpClient 请求工具类
 * @author mapb
 *
 */
public class SendUtils {

	private static final CloseableHttpClient httpClient;
	public static final String CHARSET = "UTF-8";

	static {
		RequestConfig config = RequestConfig.custom().setConnectTimeout(60000)
				.setSocketTimeout(15000).build();
		httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config)
				.build();
	}

	public static String doGet(String url, Map<String, String> params) {
		return doGet(url, params, CHARSET);
	}

	public static String doPost(String url, Map<String, String> params) {
		return doPost(url, params, CHARSET);
	}

	/**
	 * HTTP Get 获取内容
	 * 
	 * @param url
	 *            请求的url地址 ?之前的地址
	 * @param params
	 *            请求的参数
	 * @param charset
	 *            编码格式
	 * @return 页面内容
	 */
	public static String doGet(String url, Map<String, String> params,
			String charset) {
		if (StrUtils.isNullOrBlank(url)) {
			return null;
		}
		try {
			if (params != null && !params.isEmpty()) {
				List<NameValuePair> pairs = new ArrayList<NameValuePair>(
						params.size());
				for (Map.Entry<String, String> entry : params.entrySet()) {
					String value = entry.getValue();
					if (value != null) {
						pairs.add(new BasicNameValuePair(entry.getKey(), value));
					}
				}
				url += "?"
						+ EntityUtils.toString(new UrlEncodedFormEntity(pairs,
								charset));
			}
			HttpGet httpGet = new HttpGet(url);
			CloseableHttpResponse response = httpClient.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				httpGet.abort();
				throw new RuntimeException("HttpClient,error status code :"
						+ statusCode);
			}
			HttpEntity entity = response.getEntity();
			String result = null;
			if (entity != null) {
				result = EntityUtils.toString(entity, "utf-8");
			}
			EntityUtils.consume(entity);
			response.close();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * HTTP Post 获取内容
	 * 
	 * @param url
	 *            请求的url地址 ?之前的地址
	 * @param params
	 *            请求的参数
	 * @param charset
	 *            编码格式
	 * @return 页面内容
	 */
	public static String doPost(String url, Map<String, String> params,
			String charset) {
		if (StrUtils.isNullOrBlank(url)) {
			return null;
		}
		try {
			List<NameValuePair> pairs = null;
			if (params != null && !params.isEmpty()) {
				pairs = new ArrayList<NameValuePair>(params.size());
				for (Map.Entry<String, String> entry : params.entrySet()) {
					String value = entry.getValue();
					if (value != null) {
						pairs.add(new BasicNameValuePair(entry.getKey(), value));
					}
				}
			}
			HttpPost httpPost = new HttpPost(url);
			
			 httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
		        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
			if (pairs != null && pairs.size() > 0) {
				httpPost.setEntity(new UrlEncodedFormEntity(pairs, CHARSET));
			}
			CloseableHttpResponse response = httpClient.execute(httpPost);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				httpPost.abort();
				throw new RuntimeException("HttpClient,error status code :"
						+ statusCode);
			}
			HttpEntity entity = response.getEntity();
			String result = null;
			if (entity != null) {
				result = EntityUtils.toString(entity, "utf-8");
			}
			EntityUtils.consume(entity);
			response.close();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * UDP 发送 UDP
	 * @param ip 地址
	 * @param port 端口
	 * @param data String 数据包
	 */
	public static void sendUdpData(String ip, Integer port, String data){
		try {  
            byte[] buffer = data.getBytes();  
            sendUdp(ip, port, buffer);
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
	}
	
	/**
	 * UDP 发送 UDP
	 * @param ip
	 * @param port
	 * @param buffer byte[] 数据包 
	 */
	public static void sendUdp(String ip, Integer port, byte[] buffer){
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket();  
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length,InetAddress.getByName(ip),port);  
			socket.send(packet);  
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(socket != null){
				socket.close();
			}
		}
	}

	public static void main(String[] args) {
		String getData = doGet("http://www.oschina.net/", null);
		System.out.println(getData);
		System.out.println("----------------------分割线-----------------------");
		String postData = doPost("http://www.oschina.net/", null);
		System.out.println(postData);
	}

}