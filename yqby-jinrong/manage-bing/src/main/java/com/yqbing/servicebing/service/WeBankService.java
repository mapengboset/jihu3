package com.yqbing.servicebing.service;

import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;
import com.yqbing.servicebing.repository.database.bean.WebankTaskRuleBean;

public interface WeBankService {
    
	/**
	 * 
	
	 * @Title: query
	
	 * @Description: TODO
	
	 * @param name
	 * @param stime
	 * @param etime
	 * @return
	
	 * @return: PageInfo<WeBankBean>
	 */
	public PageInfo<WeBankBean> query(String name, String stime, String etime,Integer page,Integer limit);
    
	/**
	 * 
	
	 * @Title: queryWelth
	
	 * @Description: TODO
	
	 * @param company
	 * @param store
	 * @param stime
	 * @param etime
	 * @return
	
	 * @return: PageInfo<WeBankBean>
	 */
	public PageInfo<WeBankBean> queryWelth(String company, String store,
			String stime, String etime,int page,int limit);
    
	/**
	 * 
	
	 * @Title: importWB
	
	 * @Description: TODO
	
	 * @param file
	
	 * @return: void
	 * @throws Exception 
	 */
	public int importWB(MultipartFile file,String f) throws Exception;
    /**
     * 
    
     * @Title: exportWB
    
     * @Description: TODO
    
     * @param time
     * @param response 
    
     * @return: void
     * @throws Exception 
     */
	public int exportWB(String time, HttpServletResponse response) throws Exception;
    
	/**
	 * 
	
	 * @Title: weBankOff
	
	 * @Description: TODO
	
	 * @param off
	 * @return
	
	 * @return: Byte
	 */
	public int weBankOff(String off);
    
	/**
	 * 
	
	 * @Title: queryWeBankopen
	
	 * @Description: TODO
	
	 * @return
	
	 * @return: WebankTaskRuleBean
	 */
	public WebankTaskRuleBean queryWeBankopen();
}
