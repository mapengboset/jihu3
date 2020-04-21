package com.yqbing.servicebing.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * 读取配置properties文件工具类
 * .properties文件放到自己的项目的context ClassLoader的可以加载的目录下
 * @author mapb
 *
 */
public class PropertiesUtil {

	public static Properties properties = new Properties();
	private static URI uri;

	public static String getValue(String key, String value) {
		if(properties.getProperty(key)==null){
			return value;
		}else{
			return properties.getProperty(key);
		}
	}

	/**
	 * 更改配置文件(内存中)
	 * @param key
	 * @param value
	 */
	public static void updateProperties(String key, String value) {
		properties.setProperty(key, value);
	}

	public static void loadFile(String file){
		try {
			properties.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream(file));
			 uri = Thread.currentThread().getContextClassLoader().getResource(file).toURI(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @描述	 : 将属性值写入配置文件中
	 * @作者	 : SHGU
	 * @param key
	 * @param value
	 */
	public static void writePropertiesFile(String file,String key, String value) {
		try {
			OutputStream fos = new FileOutputStream(new File(uri));  
			properties.setProperty(key, value);
            // 以适合使用 load 方法加载到 Properties 表中的格式，   
            // 将此 Properties 表中的属性列表（键和元素对）写入输出流   
			properties.store(fos, "Update '" + key + ":"+value);  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
