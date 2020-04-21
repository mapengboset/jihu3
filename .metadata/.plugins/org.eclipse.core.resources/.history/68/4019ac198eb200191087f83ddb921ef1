package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.service.ChargBoxService;
import com.yqbing.servicebing.service.ReplaceKxService;
import com.yqbing.servicebing.utils.NotifyUtil;


@RestController
@CrossOrigin
@Api(tags = "下载页面")
@SuppressWarnings("all")
public class DownAppController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(DownAppController.class);
	
	
	@Resource
	private ReplaceKxService replaceKxService = null;
	
	@RequestMapping(value ={"/downapp/downAppPage"},method=RequestMethod.GET)
	public  ModelAndView  zanClickLogPage(){
		
		return new ModelAndView("downApp/html/myPages/html/downApp/downloadKuaixia");
	}
	@RequestMapping(value ={"/downapp/xieyi"},method=RequestMethod.GET)
	public  ModelAndView  xieyiPage(){
		
		return new ModelAndView("downApp/html/myPages/html/doc/kuaiXiaDoc");
	}
	
	
	@RequestMapping(value ={"/downapp/replaceKX"},method=RequestMethod.GET)
	public  String  replaceKX(@ApiParam(name="version",value = "快下版本") @RequestParam(value = "version", required = true) String version,
			@ApiParam(name="token",value = "token") @RequestParam(value = "token", required = true) String token){
		 LOGGER.info("--------------------------------------------downapp/replaceKX:"+token);
		    String result = StringUtils.EMPTY;
	        
	        try {
	        	 if(!StringUtils.isNotBlank(token)){
			        	
		        	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token必须填写");
		    			
		    			return result;
		        }
	        	
		        
		        result =  replaceKxService.replaceKX(token,version);
	         
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	LOGGER.error("系统异常" + e.getLocalizedMessage());
	        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
	           
	        }
	       
		    return result;
	}
	
}
