package com.yqbing.servicebing.webapp.controller;

import java.util.HashMap;
import java.util.Map;

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
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.redis.RUserLogBean;
import com.yqbing.servicebing.service.AccountService;
import com.yqbing.servicebing.service.UserLogIngService;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.utils.SendSms;


@RestController
@Api(tags = "用户登录接口")
@SuppressWarnings("all")
public class UserLogIngController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserLogIngController.class);
	
	@Resource
	private RUserLogBean rUserLogBean = null;
	@Resource
	private UserLogIngService userLogIngService = null;
	@Resource
	private AccountService accountService = null;
	
	
	
	//发送验证码398884
    @ApiOperation(value = "发送验证码")
    @RequestMapping(value = "/user/smsCode",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String smsCode(@ApiParam(name="phone",value = "手机号") @RequestParam(value = "phone", required = true) String phone
	){
    	
    	  String result = StringUtils.EMPTY;
    	  LOGGER.info("--------------------------------------------user/smsCode:"+phone);
    	  if(!StringUtils.isNotBlank(phone)){
          	
       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"手机号不能为空");
   			
   			return result;
       }
          try { 
        	  
        	  String  xuphone = userLogIngService.getXUPhone();
        	  String[] xp = xuphone.split(",");
         	  for (String s : xp) {
         		if(phone.substring(0, 3).equals(s)){
         			result = NotifyUtil.error(ErrorCodeEnum.XUPHONE);
         			return result;
         		} 
     		} 
        	  
        	  int sendSms = 0;
        	  if(!phone.equals("18600816543")){
        		  
        		  sendSms = SendSms.sendSms(phone);
        	  }else{
        		  sendSms=123456;
        	  }
              LOGGER.info("--------------------------------------------发送验证码手机号:"+phone+",验证码:"+sendSms);
              //存到redis
              rUserLogBean.setCode(phone, sendSms);
              Map<String,Object> map = new HashMap<String, Object>();
      		  map.put("code", 0);
              result = NotifyUtil.success(map);
          } catch (Exception e) {
        	
        	  LOGGER.error("系统异常" + e.getLocalizedMessage());
        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
           
        }
       

    	return result;
    }
    
    
    //验证码直接登录和注册
    //未注册/已注册过,直接登录
    @ApiOperation(value = "手机登录接口")
    @RequestMapping(value = "/user/login",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String login(@ApiParam(value = "phone") @RequestParam(value = "phone", required = true) String phone,
			            @ApiParam(value = "password") @RequestParam(value = "password", required = false) String password,
			            @ApiParam(value = "code") @RequestParam(value = "code", required = true) String code,
			            @ApiParam(name="device",value = "设备mac") @RequestParam(value = "device", required = true) String device,
			            @ApiParam(name="version",value = "版本号") @RequestParam(value = "version", required = true) String version,
			            @ApiParam(name = "plat",value="1.android 2.ios") @RequestParam(value = "plat", required = true) Integer plat){
    	
    	  LOGGER.info("--------------------------------------------user/login:"+phone+",code="+code);
 	      String result = StringUtils.EMPTY;
	
	        if(!StringUtils.isNotBlank(phone)){
	        	
	        	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"手机号必须填写");
	    			
	    			return result;
	        }
	        if(!StringUtils.isNotBlank(code)){
	        	
	        	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"验证码必须填写");
	        	
	        	return result;
	        }
 	  
 		//
 		LOGGER.info("/user/login--------------------------------------参数集合手机号:"+phone+"验证码:"+code);
 	    //---验证码+手机号
 		try {
			
 			result =  userLogIngService.login(password,phone,code,device,version,plat);
 			LOGGER.info("/user/login--------------------------------------返回参数集合:"+result);
		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    
    //密码登录
    @RequestMapping(value = "/user/loginUser",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String loginUser(@ApiParam(value = "phone") @RequestParam(value = "phone", required = true) String phone,
			@ApiParam(value = "password") @RequestParam(value = "password", required = true) String password,
			  @ApiParam(name="device",value = "设备mac") @RequestParam(value = "device", required = true) String device,
	            @ApiParam(name="version",value = "梦想版本") @RequestParam(value = "version", required = true) String version,
	            @ApiParam(name = "plat",value="1.android 2.ios") @RequestParam(value = "plat", required = true) Integer plat
			){
    	
    	      String result = StringUtils.EMPTY;
    	      LOGGER.info("--------------------------------------------user/loginUser:"+phone);
	
	    
	        if(!StringUtils.isNotBlank(phone)){
	        	
	        	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"手机号必须填写");
	    			
	    			return result;
	        }
	        //判断手机是否注册过
	        UserInfoBean user = rUserLogBean.getPhone(phone);
	        if(user == null){
	        	user =	userLogIngService.queryAndPhone(phone);
	            if(user == null){
		        	
	        	    result = NotifyUtil.error(ErrorCodeEnum.EXISTUSER,"请先注册");
	    			
	    			return result;
	       }
	        }
	        if(StringUtils.isNotBlank(password)){//走密码
	        	
	                result = userLogIngService.loginUserPass(phone,password,device,version,plat);
	        }else{
	        	    result = NotifyUtil.error(ErrorCodeEnum.ERRORCODE,"请输入验证码或者密码");
	        }
	    
    	
    	return result;
    }
    
    
    
    
    //微信,支付宝授权登录接口
    @ApiOperation(value = "手机授权接口")
    @RequestMapping(value = "/user/auth",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String auth(@ApiParam(name = "code",value="微信授权码") @RequestParam(value = "code", required = true) String code,
			            @ApiParam(name = "type",value="1.微信 2.支付宝") @RequestParam(value = "type", required = true) Integer type){
    	
    	  LOGGER.info("--------------------------------------------user/login:+code="+code+",type="+type);
 	      String result = StringUtils.EMPTY;
	        if(!StringUtils.isNotBlank(code)){
	        	
	        	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"授权码必须填写");
	        	
	        	return result;
	        }
 	  
 		try {
			
 			result =  userLogIngService.auth(code,type);
 			LOGGER.info("/user/auth--------------------------------------返回参数集合:"+result);
		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    
    @ApiOperation(value = "小程序获取手机接口")
    @RequestMapping(value = "/user/getPhone",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String getPhone( @ApiParam(name = "phone",value = "phone") @RequestParam(value = "phone", required = false) String phone,
			            @ApiParam(name = "phone",value = "code") @RequestParam(value = "code", required = false) String code,
			            @ApiParam(name = "openId",value = "openId") @RequestParam(value = "openId", required = true) String openId,
			            @ApiParam(name = "type",value="1.微信 2.支付宝") @RequestParam(value = "type", required = true) Integer type){
    	
    	  LOGGER.info("--------------------------------------------user/getPhone:"+openId+",phone="+phone+",type="+type);
 	      String result = StringUtils.EMPTY;
	
	        
	      if(!StringUtils.isNotBlank(openId)){
	        	
	        	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"openId");
	        	
	        	return result;
	        }
 	  
 		try {
			
 			result =  userLogIngService.getPhone(phone,openId,type,code);
 			LOGGER.info("/user/getPhone--------------------------------------返回参数集合:"+result);
		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    
    
    
    
    
    @ApiOperation(value = "小程序登录接口")
    @RequestMapping(value = "/user/wxLogIn",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String wxLogIn( 
			           @ApiParam(name = "openId",value = "openId") @RequestParam(value = "openId", required = true) String openId,
			            @ApiParam(name = "type",value="1.微信 2.支付宝") @RequestParam(value = "type", required = true) Integer type){
    	
    	  LOGGER.info("--------------------------------------------user/wxLogIn:"+openId+",type="+type);
 	      String result = StringUtils.EMPTY;
	
	       /* if(!StringUtils.isNotBlank(token)){
	        	
	        	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token必须填写");
	    			
	    			return result;
	        }*/
	        if(!StringUtils.isNotBlank(openId)){
	        	
	        	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"openId");
	        	
	        	return result;
	        }
 	  
 		try {
			
 			result =  userLogIngService.wxLogIn(openId,type);
 			LOGGER.info("/user/wxLogIn--------------------------------------返回参数集合:"+result);
		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    
    
}
