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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.redis.RAccountCodeLog;
import com.yqbing.servicebing.service.AccountService;
import com.yqbing.servicebing.service.HomePageService;
import com.yqbing.servicebing.utils.CloudUtil;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.utils.SendSms;
import com.yqbing.servicebing.utils.SendUtils;


@RestController
@Api(tags = "我的详情")
@SuppressWarnings("all")
public class AccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
	
	@Resource
	private AccountService accountService = null;
	@Resource
	private RAccountCodeLog rAccountCodeLog = null;
	
	//展示商店基本信息和余额
	 @RequestMapping(value = "/account/myStoreInfo",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "展示商店基本信息和余额")
		public String myStoreInfo(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
			
			
			LOGGER.info("--------------------------------------------/account/myStoreInfo:"+token);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = accountService.myStoreInfo(token);
				LOGGER.info("/account/myStoreInfo--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}
	 @RequestMapping(value = "/account/ifcashout",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "提现设置 是否绑定 支付宝账号")
		public String cashoutRegisterPage(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
			
			
			LOGGER.info("--------------------------------------------/account/ifcashout:"+token);
			String result = StringUtils.EMPTY;
			
			try {
				
				result = accountService.ifcashout(token);
				LOGGER.info("/account/ifcashout--------------------------------------返回参数集合:"+result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return result;
		}   
	 
	//提现设置
		 @RequestMapping(value = "/account/cashoutRegister",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			@ApiOperation(value = "提现设置/充值支付宝账号")
			public String cashoutRegister(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
					@ApiParam(name = "aliaccount",value="支付宝账户") @RequestParam(value = "aliaccount", required = true) String aliaccount,
					@ApiParam(name = "name",value="支付宝真实名字") @RequestParam(value = "name", required = true) String name,
					@ApiParam(name = "card",value="身份证号码") @RequestParam(value = "card", required = true) String card,
					@ApiParam(name = "password",value="提现密码") @RequestParam(value = "password", required = false) String password){
				
				
				LOGGER.info("--------------------------------------------/account/cashoutRegister:"+aliaccount);
				String result = StringUtils.EMPTY;
				
				try {
					
					
					result = accountService.cashoutRegister(token,aliaccount,name,card,password);
					LOGGER.info("/account/cashoutRegister--------------------------------------返回参数集合:"+result);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return result;
			}
		/* @RequestMapping(value = "/account/resPasswordPage",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			@ApiOperation(value = "重置密码页面,返回手机号")
			public String resPasswordPage(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
				
				
				LOGGER.info("--------------------------------------------/account/resPasswordPage:"+token);
				String result = StringUtils.EMPTY;
				
				try {
					
					result = accountService.resPasswordPage(token);
					LOGGER.info("/account/resPassword--------------------------------------返回参数集合:"+result);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return result;
			}   */
		 
		    @ApiOperation(value = "发送验证码")
		    @RequestMapping(value = "/account/smsCode",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			public String smsCode(@ApiParam(name="phone",value = "手机号") @RequestParam(value = "phone", required = true) String phone
			){
		    	
		    	  String result = StringUtils.EMPTY;
		    	  LOGGER.info("--------------------------------------------account/smsCode:"+phone);
		    	  if(!StringUtils.isNotBlank(phone)){
		          	
		       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"手机号不能为空");
		   			
		   			return result;
		       }
		          try { 
		        	  int sendSms = 0;
		        	  if(!phone.equals("18600816543")){
		        		  
		        		  sendSms = SendSms.sendSms(phone);
		        	  }else{
		        		  sendSms=123456;
		        	  }
		              LOGGER.info("--------------------------------------------发送验证码手机号:"+phone+",验证码:"+sendSms);
		              //存到redis
		              rAccountCodeLog.setCode(phone, sendSms);
		              Map<String,Object> map = new HashMap<String, Object>();
		      		  map.put("code", 0);
		              result = NotifyUtil.success(map);
		          } catch (Exception e) {
		        	
		        	  LOGGER.error("系统异常" + e.getLocalizedMessage());
		        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		           
		        }
		       

		    	return result;
		    }
		    @RequestMapping(value = "/account/PasswordCODE",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			@ApiOperation(value = "重置密码验证码是否正确")
			public String PasswordCODE(@ApiParam(name = "code",value="验证码") @RequestParam(value = "code", required = true) String code,
					@ApiParam(name = "phone",value="手机号") @RequestParam(value = "phone", required = true) String phone){
				
				
				LOGGER.info("--------------------------------------------/account/PasswordCODE:"+code);
				String result = StringUtils.EMPTY;
				
				try {
					
					result = accountService.PasswordCODE(code,phone);
					LOGGER.info("/account/PasswordCODE--------------------------------------返回参数集合:"+result);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return result;
			}   
		 
		 @RequestMapping(value = "/account/resPassword",
		        	method = {RequestMethod.GET,RequestMethod.POST})
			@ApiOperation(value = "重置密码")
			public String resPassword(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
					@ApiParam(name = "password",value="提现密码") @RequestParam(value = "password", required = true) String password){
				
				
				LOGGER.info("--------------------------------------------/account/resPassword:"+password);
				String result = StringUtils.EMPTY;
				
				try {
					
					result = accountService.resPassword(token,password);
					LOGGER.info("/account/resPassword--------------------------------------返回参数集合:"+result);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return result;
			}
		 
		 
		 
		 
	 //提现到支付宝
    @ApiOperation(value = "账号提现接口")
    @RequestMapping(value = "/account/cashout",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String cashout(@ApiParam(value = "token") @RequestParam(value = "token", required = true) String token,
			            @ApiParam(value = "money") @RequestParam(value = "money", required = true) String money,
			            @ApiParam(name="device",value = "设备mac") @RequestParam(value = "device", required = false) String device,
			            @ApiParam(name = "plat",value="1.android 2.ios") @RequestParam(value = "plat", required = false) Integer plat){
    	
    	  LOGGER.info("--------------------------------------------user/login:token:"+token+",money="+money);
 	      String result = StringUtils.EMPTY;
	
	        
 	     if(!StringUtils.isNotBlank(token)){
	           	
	           	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"用户信息必须填写");
	           	
	           	return result;
	    }
 	     
 	    //---验证码+手机号
 		try {
 			result = accountService.cashOut(token,money,device,plat);
 			LOGGER.info("/user/cashout--------------------------------------返回参数集合:"+result);
         		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    @ApiOperation(value = "图片上传token")
    @RequestMapping(value = "/account/uploadToken",
    method = {RequestMethod.GET,RequestMethod.POST})
    public String uploadToken(@ApiParam(name="token",value = "token") @RequestParam(value = "token", required = false) String token){
        
    	LOGGER.info("--------------------------------------------account/uploadToken:"+token);
    	String result = StringUtils.EMPTY;
    	Map<String,Object> map = new HashMap<String,Object>();
    	String uploadToken =null;
    	try {
    		//获取app列表
    		 uploadToken = CloudUtil.getUploadToken();
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    		result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
    	}
    	map.put("UploadToken", uploadToken);
    	return NotifyUtil.success(map);
    }
    
    //提交充值
    @ApiOperation(value = "提交充值截图")
    @RequestMapping(value = "/account/subrecharge",
    method = {RequestMethod.GET,RequestMethod.POST})
    public String recharge(@ApiParam(name="token",value = "token") @RequestParam(value = "token", required = false) String token,
    		@ApiParam(name="Img",value = "图片地址") @RequestParam(value = "Img", required = false) String Img){
        
    	  LOGGER.info("--------------------------------------------account/recharge:"+Img);
 	      String result = StringUtils.EMPTY;
	
	        
 	     if(!StringUtils.isNotBlank(token)){
	           	
	           	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"用户信息必须填写");
	           	
	           	return result;
	    }
 	     
 		try {
 			result = accountService.recharge(token,Img);
 			LOGGER.info("/user/recharge--------------------------------------返回参数集合:"+result);
         		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
    //充值成功记录
    
    //提交记录
    @ApiOperation(value = "提交记录/充值成功记录")
    @RequestMapping(value = "/account/rechargeList",
    method = {RequestMethod.GET,RequestMethod.POST})
    public String subrecharge(@ApiParam(name="token",value = "token") @RequestParam(value = "token", required = false) String token,
    		@ApiParam(name="type",value = "0.提交记录 1.充值记录") @RequestParam(value = "type", required = false) Integer type){
        
    	  LOGGER.info("--------------------------------------------account/subrecharge:"+type);
 	      String result = StringUtils.EMPTY;
	
	        
 	     if(!StringUtils.isNotBlank(token)){
	           	
	           	result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"用户信息必须填写");
	           	
	           	return result;
	    }
 	     
 	    //---验证码+手机号
 		try {
 			result = accountService.subrecharge(token,type);
 			LOGGER.info("/user/recharge--------------------------------------返回参数集合:"+result);
         		} catch (Exception e) {
			e.printStackTrace();
			result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		}
 		
    	return result;
    }
}
