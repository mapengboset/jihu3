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
import com.yqbing.servicebing.service.AccountService;
import com.yqbing.servicebing.service.StoreInfoService;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.webapp.request.StoreInfoReq;


@RestController
@Api(tags = "门店信息")
@SuppressWarnings("all")
public class StoreInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StoreInfoController.class);
	
	@Resource
	private StoreInfoService storeInfoService = null;
	
	
	
	 //是否注册店铺或者是否有权限开店
	@RequestMapping(value = "/store/ifRegister",
        	method = {RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value = "是否注册店铺//或者是否有权限开店")
	public String ifRegister(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
		
		
		LOGGER.info("--------------------------------------------/store/ifRegister:"+token);
		String result = StringUtils.EMPTY;
		
		try {
			
			result = storeInfoService.ifRegister(token);
			LOGGER.info("/store/ifRegister--------------------------------------返回参数集合:"+result);
		} catch (Exception e) {
			  	
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	 //注册店铺
	 @ApiOperation(value = "注册店铺")
	    @RequestMapping(value = "/store/register",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		public String register(StoreInfoReq req){
	    	
	    	LOGGER.info("--------------------------------------------/store/register::"+req);
	 	    String result = StringUtils.EMPTY;
		
		        
	 	    if(!StringUtils.isNotBlank(req.getToken())){
		           	
		           	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"用户信息必须填写");
		           	
		           	return result;
		    }
	 	    //---验证码+手机号
	 		try {
	 			result = storeInfoService.register(req);
	 			LOGGER.info("/store/register--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				e.printStackTrace();
				result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
			}
	 		
	    	return result;
	    }
	 
	 //补全信息
	 @ApiOperation(value = "补全信息")
	    @RequestMapping(value = "/store/padding",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		public String padding(StoreInfoReq req){
	    	
	    	LOGGER.info("--------------------------------------------/store/padding::"+req.toString());
	 	    String result = StringUtils.EMPTY;
		
		        
	 	    if(!StringUtils.isNotBlank(req.getToken())){
		           	
		           	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"用户信息必须填写");
		           	
		           	return result;
		    }
	 	    //---验证码+手机号
	 		try {
	 			result = storeInfoService.padding(req);
	 			LOGGER.info("/store/padding--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				e.printStackTrace();
				result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
			}
	 		
	    	return result;
	    }
	
    //查询店铺
	 @RequestMapping(value = "/store/queryStore",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "查询店铺")
		public String queryStoreInfo(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
			
			
			LOGGER.info("--------------------------------------------/store/queryStore:"+token);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = storeInfoService.queryStoreInfo(token);
				LOGGER.info("/store/queryStore--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
	 //邀请码返回店铺信息
	 @RequestMapping(value = "/store/quereyStoreCode",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "邀请码返回店铺信息")
		public String addStoreName(@ApiParam(name = "code",value="用户code") @RequestParam(value = "code", required = true) String code){
		 LOGGER.info("--------------------------------------------/store/quereyStoreName:"+code);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = storeInfoService.quereyStoreName(code);
				LOGGER.info("/store/quereyStoreName--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
	 }
	 
	 
    //店员 -->加入门店
	 @RequestMapping(value = "/store/joinStore",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "店员 -->加入门店")
		public String joinStore(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
				@ApiParam(name = "storeCode",value="门店 邀请码") @RequestParam(value = "storeCode", required = true) String storeCode,
				@ApiParam(name = "name",value="用户姓名") @RequestParam(value = "name", required = true) String name){
			
			
			LOGGER.info("--------------------------------------------/store/joinStore:"+storeCode);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = storeInfoService.joinStore(token,storeCode,name);
				LOGGER.info("/store/joinStore--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
	 
    //我的店员
	 @RequestMapping(value = "/store/myStaff",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "我的店员")
		public String myStaff(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
			
			
			LOGGER.info("--------------------------------------------/store/myStaff:"+token);
			String result = StringUtils.EMPTY;
			
			try {
				result = storeInfoService.myStaff(token);
				LOGGER.info("/store/myStaff--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
	 //店长 -->添加店员
	 @RequestMapping(value = "/store/increaseWorker",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "店长 -->添加店员")
		public String increaseWorker(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
				@ApiParam(name = "name",value="员工姓名") @RequestParam(value = "name", required = true) String name,
				@ApiParam(name = "phone",value="员工手机") @RequestParam(value = "phone", required = true) String phone,
				@ApiParam(name = "password",value="注册密码") @RequestParam(value = "password", required = true) String password){
			
			
			LOGGER.info("--------------------------------------------/store/increaseWorker:"+name);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = storeInfoService.increaseWorker(token,name,phone,password);
				LOGGER.info("/store/increaseWorker--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
	 //店长 -->删除店员
	 @RequestMapping(value = "/store/delWorker",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "店长 -->删除店员")
		public String delWorker(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
				@ApiParam(name = "userId",value="员工ID") @RequestParam(value = "userId", required = true) Long userId){
			
			LOGGER.info("--------------------------------------------/store/delWorker:"+userId);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = storeInfoService.delWorker(token,userId);
				LOGGER.info("/store/delWorker--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
}
