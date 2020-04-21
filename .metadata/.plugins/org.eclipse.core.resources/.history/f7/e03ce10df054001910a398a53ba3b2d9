package com.yqbing.servicebing.utils;

import java.io.File;

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
	
}
