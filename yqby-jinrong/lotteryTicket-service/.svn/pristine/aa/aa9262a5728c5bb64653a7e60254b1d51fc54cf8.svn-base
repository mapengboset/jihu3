package com.yqbing.servicebing.utils;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.yqbing.servicebing.utils.ticket.regopimc.ThirdLotteryTicketRequestUtil;
import org.apache.commons.httpclient.util.HttpURLConnection;

import java.net.*;

/**
 * 接口调用(post请求) 数据处理
 *
 * @param url
 *            请求路径 例如：http://127.0.0.1:8080/test/test
 * @param param
 *            请求参数 例如：{ "userName":"Lily", "password":"123456" }
 * @return 响应数据 例如：{ "resultId":"1" "resultMsg":"操作成功" }
 *
 */
public class HttpServiceUtil {

	public static Map<String, String> defaultHeader = new HashMap<String, String>();

	private static String ENCODING = "UTF-8";

	private static long HTTP_TIME_OUT = 10000l;

	private static Integer CONNECTION_TIME_OUT = 20000;

	private static Integer READ_TIME_OUT = 10000;
	
	
	 public static String insureResponsePost(String url, String param) {
	        PrintWriter out = null;
	        InputStream is = null;
	        BufferedReader br = null;
	        String result = "";
	        HttpURLConnection conn = null;
	        StringBuffer strBuffer = new StringBuffer();
	        try {
	            URL realUrl = new URL(url);
	            conn = (HttpURLConnection) realUrl.openConnection();
	            // 设置通用的请求属性
	            conn.setRequestMethod( "POST");
	            conn.setConnectTimeout(20000);
	            conn.setReadTimeout(300000);
	            conn.setRequestProperty("Charset", "UTF-8");
               // 传输数据为json，如果为其他格式可以进行修改
	            conn.setRequestProperty( "Content-Type", "application/json");
	            conn.setRequestProperty( "Content-Encoding", "utf-8");
	            // 发送POST请求必须设置如下两行
	            conn.setDoOutput( true);
	            conn.setDoInput( true);
	            conn.setUseCaches( false);
	            // 获取URLConnection对象对应的输出流
	            out = new PrintWriter(conn.getOutputStream());
	            // 发送请求参数
	            out.print(param);
	            // flush输出流的缓冲
	            out.flush();
	            is = conn.getInputStream();
	            br = new BufferedReader( new InputStreamReader(is));
	            String line = null;
	            while ((line=br.readLine())!= null) {
	                strBuffer.append(line);
	            }
	            result = strBuffer.toString();
	        } catch (Exception e) {
	            System. out.println( "发送 POST 请求出现异常！" + e);
	            e.printStackTrace();
	        }
	        // 使用finally块来关闭输出流、输入流
	        finally {
	            try {
	                if (out != null) {
	                    out.close();
	                }
	                if (br != null) {
	                    br.close();
	                }
	                if (conn!= null) {
	                    conn.disconnect();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return result;
	    }

	public static String sendPost(String url, String param, Map<String, String> header, String encoding) throws Exception {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);

			URLConnection con = realUrl.openConnection();

			if (header != null) {
				for (String key : header.keySet()) {
					con.setRequestProperty(key, header.get(key));
				}
			}

			con.setDoOutput(true);
			con.setDoInput(true);

			out = new PrintWriter(con.getOutputStream());

			out.print(param);

			out.flush();
			in = new BufferedReader(
					new InputStreamReader(con.getInputStream(), encoding));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("POST error" + e);
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
				throw ex;
			}
		}
		return result;
	}
}
