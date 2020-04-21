package com.yqbing.servicebing.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

import com.yqbing.servicebing.exception.BingException;




public class FileUtil {
	
	/** 图片路径 */
	private static final String IMAGE_PATH = "photo";

	/**
	 * 上传文件
	 * 
	 * @param type 文件类型(0:其他文件;1:用户头像;2:日记照片)
	 * @param file 上传文件
	 * @param request HTTP服务请求
	 * @return 上传文件数据
	 */
	public static String uploadFile(MultipartFile file, HttpServletRequest request)
			throws BingException {
		// 检查文件
		if (!ServletFileUpload.isMultipartContent(request)) {
			throw new BingException("文件上传类型错误");
		}
//		if (file.getSize() > 1024 * 1024) {
//			throw new GymException("文件过大");
//		}
		
		//文件保存路径
		String path = IMAGE_PATH;
		String filepath = request.getSession().getServletContext().getRealPath(path);
		//判断文件夹是否存在，如果不存在则创建
		File fPath = new File(filepath);
		if(!fPath.exists()){
			fPath.mkdirs();
		}

		// 保存文件
		String filename = EncryptHelper.toMD5(file.getOriginalFilename() + System.currentTimeMillis()) + ".jpg";
		try {
			
			file.transferTo(new File(filepath, filename));
		}
		catch (Exception e) {
			throw new BingException("保存图片异常", e);
		}
		// 返回数据
		return path + "/" + filename;
	}
	public static byte[] getImageFromNetByUrl(String strUrl){    
        try {    
            URL url = new URL(strUrl);
         //   URLConnection connection = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();   
           
            connection.setRequestMethod("GET");    
            connection.setConnectTimeout(5 * 1000);    
            InputStream inStream = connection.getInputStream();//通过输入流获取图片数据    
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据    
            return btImg;    
        } catch (Exception e) {    
            e.printStackTrace();    
        }    
        return null;    
    }    
	
	/**  
     * 从输入流中获取数据  
     * @param inStream 输入流  
     * @return  
     * @throws Exception  
     */    
    public static byte[] readInputStream(InputStream inStream) throws Exception{    
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();    
        byte[] buffer = new byte[1024];    
        int len = 0;    
        while( (len=inStream.read(buffer)) != -1 ){    
            outStream.write(buffer, 0, len);    
        }    
        inStream.close();    
        return outStream.toByteArray();    
    }    

}
