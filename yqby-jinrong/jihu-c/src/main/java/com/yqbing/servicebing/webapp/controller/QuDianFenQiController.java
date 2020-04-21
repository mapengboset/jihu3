package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yqbing.servicebing.repository.redis.RUserLogBean;
import com.yqbing.servicebing.service.UserLogingService;



@Controller
@Api(tags = "趣店来分期授权token 查询用户信息接口")
@SuppressWarnings("all")
public class QuDianFenQiController {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QuDianFenQiController.class);
	
	
	@Resource
	private UserLogingService userLogingService = null;
	
	@ApiOperation(value = "查询用户信息接口")
    @RequestMapping(value = "/qudian/queryUserInfo",
        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String queryUserInfo(@ApiParam(name = "enc_token",value="用户token") @RequestParam(value = "enc_token", required = true) String enc_token){
	        String result = StringUtils.EMPTY;
	      
	      
	      try {
	    	  result = userLogingService.queryQuDianUserInfo(enc_token);
	    	  
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
    	
    	return result;
    }
	

}
