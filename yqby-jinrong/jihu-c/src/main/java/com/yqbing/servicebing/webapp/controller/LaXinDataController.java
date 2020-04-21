package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.redis.RUserLogBean;
import com.yqbing.servicebing.service.LaChineService;
import com.yqbing.servicebing.utils.NotifyUtil;

@CrossOrigin
@Controller
@Api(tags = "拉新数据")
@SuppressWarnings("all")
public class LaXinDataController {

	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LaXinDataController.class);
	
	@Resource
	private LaChineService laChineService = null;
	
		@ApiOperation(value = "拉新数据")
	    @RequestMapping(value = "/lachine/list",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String queryInvite(@ApiParam(name = "stime",value="开始时间") @RequestParam(value = "stime", required = true) String stime,
				@ApiParam(name = "etime",value="结束时间") @RequestParam(value = "etime", required = true) String etime,
				@ApiParam(name = "code",value="邀请码") @RequestParam(value = "code", required = true) String code,
				@ApiParam(name = "courrent",value="起始页") @RequestParam(value = "courrent", required = false) Integer courrent,
				@ApiParam(name = "size",value="每页显示条数") @RequestParam(value = "size", required = false) Integer size){
	    	    LOGGER.info("--------------------------------------------lachine/list:"+code+"etime:"+etime+"stime"+stime);
		        String result = StringUtils.EMPTY;
		      
		      
		      try {
		    	  result = laChineService.queryList(stime,etime,courrent,size,code);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
	    	
	    	return result;
	    }
		
	   
	    @ApiOperation(value = "gameCpas")
	    @RequestMapping(value = "/lachine/gameCps",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String gameCpas(@ApiParam(name = "name",value="游戏名字") @RequestParam(value = "name", required = false) String name){
	    	    LOGGER.info("--------------------------------------------lachine/gameCpas:"+name);
		        String result = StringUtils.EMPTY;
		      
		      
		      try {
		    	  result = laChineService.gameCpss(name);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
	    	
	    	return result;
	    }
		
	    
	    
	    @RequestMapping(value = "/lachine/predictList",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String predict(@ApiParam(name = "stime",value="开始时间年月日") @RequestParam(value = "stime", required = false) String stime,
				@ApiParam(name = "etime",value="结束时间") @RequestParam(value = "etime", required = false) String etime,
				@ApiParam(name = "codes",value="邀请码") @RequestParam(value = "codes", required = false) String codes){
	    	    LOGGER.info("--------------------------------------------lachine/predictList:"+codes+"&stime:"+stime+"&etime:"+etime);
		        String result = StringUtils.EMPTY;
		      
		      
		      try {
		    	  result = laChineService.predict(stime,etime,codes);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
	    	    LOGGER.info("--------------------------------------------lachine/predictList 返回参数:"+result);
	    	return result;
	    }
	    @RequestMapping(value = "/lachine/predictDatail",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String predictDatail(@ApiParam(name = "stime",value="开始时间年月日") @RequestParam(value = "stime", required = false) String stime,
				@ApiParam(name = "etime",value="结束时间") @RequestParam(value = "etime", required = false) String etime,
				@ApiParam(name = "codes",value="邀请码") @RequestParam(value = "codes", required = false) String codes){
	    	    LOGGER.info("--------------------------------------------lachine/predictList:"+codes+"&stime:"+stime+"&etime:"+etime);
		        String result = StringUtils.EMPTY;
		      
		        try {
		    	  result = laChineService.predictDatail(stime,etime,codes);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
		      LOGGER.info("--------------------------------------------lachine/predictList 返回参数:"+result);
	    	  return result;
	    }
	    
	    @RequestMapping(value = "/lachine/ETCLachine",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String ETCLachine(@ApiParam(name = "name",value="姓名") @RequestParam(value = "name", required = true) String name,
				@ApiParam(name = "plate",value="车牌号") @RequestParam(value = "plate", required = true) String plate,
				@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = false) String token){
	    	    LOGGER.info("--------------------------------------------lachine/ETCLachine-->name:"+name+"&plate:"+plate);
		        String result = StringUtils.EMPTY;
		      
		        try {
		    	  result = laChineService.ETCLachine(name,plate,token);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
		      LOGGER.info("--------------------------------------------lachine/ETCLachine 返回参数:"+result);
	    	  return result;
	    }
	    
	    @RequestMapping(value = "/lachine/ETCQueryList",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String ETCQueryList(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = false) String token,
				@ApiParam(name = "page",value="起始页 0开始") @RequestParam(value = "page", required = true) Integer page,
				@ApiParam(name = "size",value="每页显示条数") @RequestParam(value = "size", required = true) Integer size){
	    	    LOGGER.info("--------------------------------------------lachine/ETCLachine-->token:"+token);
		        String result = StringUtils.EMPTY;
		      
		        try {
		    	  result = laChineService.ETCQueryList(page,size,token);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
		      LOGGER.info("--------------------------------------------lachine/ETCLachine 返回参数:"+result);
	    	  return result;
	    }
	    
	    @RequestMapping(value = "/lachine/userInfo",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String userInfo(@ApiParam(name = "phone",value="用户phone") @RequestParam(value = "phone", required = true) String phone){
	    	    LOGGER.info("--------------------------------------------lachine/ETCLachine-->phone:"+phone);
		        String result = StringUtils.EMPTY;
		      
		        try {
		    	  result = laChineService.userInfo(phone);
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
		      LOGGER.info("--------------------------------------------lachine/ETCLachine 返回参数:"+result);
	    	  return result;
	    }
	    
		@ApiOperation(value = "拉取积分抽奖")
	    @RequestMapping(value = "/lachine/ral",
	        	method = {RequestMethod.GET,RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
		@ResponseBody
		public String queryInvite(){
		        String result = StringUtils.EMPTY;
		      
		      
		      try {
		    	  result = laChineService.ral();
		    	  
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
	    	
	    	return result;
	    }
}
