package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.service.ThirdQRcodeService;
import com.yqbing.servicebing.utils.NotifyUtil;

@Api(tags = "推广链接")
@RestController
public class ThirdQRcodeController extends BaseController{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ThirdQRcodeController.class);
	
	@Resource
	private ThirdQRcodeService thirdQRcodeService;
	
	 //通过邀请码返回店铺数据
		@ApiOperation(value = "二维码推广链接")
	    @RequestMapping(value = "/thirdQRcode/thirdQRcodeBack",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		public String thirdQRcodeBack(@ApiParam(name = "token",value="token") @RequestParam(value = "token", required = true) String token,
				                      @ApiParam(name = "type",value="0:美团") @RequestParam(value = "type", required = true) Integer type){
	    	 LOGGER.info("--------------------------------------------thirdQRcode/thirdQRcodeBack:"+token);
		      String result = StringUtils.EMPTY;
		    
		      try {
		    	  result = thirdQRcodeService.thirdQRcodeBack(token,type);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
	    	
	    	 return result;
	    }
    
}
