package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.service.InternetCafeService;
import com.yqbing.servicebing.utils.NotifyUtil;

/**
 * 

 * @ClassName: InternetCafeController

 * @Description: TODO

 * @author: mpb

 * @date: 2019年5月6日 下午4:50:49
 */
@RestController
@Api(tags = "网咖接口")
@SuppressWarnings("all")
public class InternetCafeController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(InternetCafeController.class);
	
	@Resource
	private InternetCafeService internetCafeService = null;
	
	     
		 @RequestMapping(value = "/internetcafe/welfarePage",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			@ApiOperation(value = "网吧专区")
			public String welfarePage(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
				
			 LOGGER.info("--------------------------------------------/internetcafe/welfarePage:"+token);
			 String result = StringUtils.EMPTY;
				 try {
			
				   if(!StringUtils.isNotBlank(token)){
			        	
		       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
		   			
		   			return result;
		          }
				  result = internetCafeService.welfarePage(token);
				  
			 } catch (Exception e) {
				 e.printStackTrace();
				 result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		 
		        
		     }
				return result;
			}
	
	
	
}
