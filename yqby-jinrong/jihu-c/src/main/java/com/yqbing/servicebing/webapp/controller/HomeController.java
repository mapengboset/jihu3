package com.yqbing.servicebing.webapp.controller;

import java.io.IOException;

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
import com.yqbing.servicebing.service.GameService;
import com.yqbing.servicebing.service.HomePageService;
import com.yqbing.servicebing.utils.HttpUtils;
import com.yqbing.servicebing.utils.NotifyUtil;


@RestController
@Api(tags = "新首页接口")
@SuppressWarnings("all")
public class HomeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	
	@Resource
	private HomePageService homePageService = null;
	@Resource
	private GameService gameService = null;
	
	@RequestMapping(value = "/home/homeNew",
        	method = {RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value = "首页")
	public String homePage(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
			@ApiParam(name="device",value = "设备mac") @RequestParam(value = "device", required = true) String device){
		
		LOGGER.info("--------------------------------------------home/homePage:"+token);
		String result = StringUtils.EMPTY;
		 try {
		
		   if(!StringUtils.isNotBlank(token)){
	        	
       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
   			
   			return result;
          }
		  result = homePageService.homeNew(token,device);
		  
	 } catch (Exception e) {
		 e.printStackTrace();
		 result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,"操作失败");
 
        
     }
		return result;
	}
	
	@RequestMapping(value = "/game/gameNew",
        	method = {RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value = "游戏首页")
	public String gameNew(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
			@ApiParam(name = "type",value="名称类型") @RequestParam(value = "type", required = false) String type){
		LOGGER.info("--------------------------------------------game/gamePage:"+type);
		
		String result = StringUtils.EMPTY;
		 try {

		   if(!StringUtils.isNotBlank(token)){
	        	
       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
   			
   		   return result;
          }  
		  result = gameService.gameNew(token,type);
	 } catch (Exception e) {
     	e.printStackTrace();
     	LOGGER.error("系统异常" + e.getLocalizedMessage());
     	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
        
     }
		return result;
	}
	 @ApiOperation(value = "推荐应用")
		@RequestMapping(value = "/home/recommendNewApps",
			        	method = {RequestMethod.GET,RequestMethod.POST})
		public String recommendApps(
				@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
				@ApiParam(name = "type",value="类型1.本机-应用推荐 2.热门搜索 3.一键下载") @RequestParam(value = "type", required = false) Integer type){
				 
			 LOGGER.info("--------------------------------------------home/recommendApps:"+type);
				    String result = StringUtils.EMPTY;
			        
			        try {
			        	 if(!StringUtils.isNotBlank(token)){
					        	
				        	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token必须填写");
				    			
				    			return result;
				        }
				        
				        result =  homePageService.recommendNewApps(token,type);
			         
			        } catch (Exception e) {
			        	
			        	LOGGER.error("系统异常" + e.getLocalizedMessage());
			        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
			           
			        }
			       
				    return result;
			 }
	
	
	
	 //模块下更多应用
	 @ApiOperation(value = "模块下更多应用")
	 @RequestMapping(value = "/home/moreModelApp",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		public String moreModelApp(@ApiParam(name = "token",value="用户toke") @RequestParam(value = "token", required = true)String token,
				@ApiParam(name = "page",value="起始页 0开始") @RequestParam(value = "page", required = true) Integer page,
				@ApiParam(name = "size",value="每页显示条数") @RequestParam(value = "size", required = true) Integer size,
				@ApiParam(name = "id",value="模块下的ID") @RequestParam(value = "id", required = true) Integer id){
		 LOGGER.info("--------------------------------------------home/moreModelApp:"+id);	 
		 String result = StringUtils.EMPTY;
			  try {
		    	  
				  if(!StringUtils.isNotBlank(token)){
			        	
			       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
			   			
			   			return result;
			          }
					  result = homePageService.moreModelApp(token,page,size,id);
		        } catch (Exception e) {
		        	
		        	LOGGER.error("系统异常" + e.getLocalizedMessage());
		        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		           
		        }
			  
			return result;
		}
	
	 //游戏排行应用
	 @ApiOperation(value = "游戏排行应用")
	 @RequestMapping(value = "/game/gameRank",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		public String gameRank(@ApiParam(name = "token",value="用户toke") @RequestParam(value = "token", required = true)String token,
				@ApiParam(name = "page",value="起始页 0开始") @RequestParam(value = "page", required = true) Integer page,
				@ApiParam(name = "size",value="每页显示条数") @RequestParam(value = "size", required = true) Integer size,
				@ApiParam(name = "type",value="排行下竞技类型") @RequestParam(value = "type", required = true) String type){
		 LOGGER.info("--------------------------------------------game/gameRank:"+type);
		 String result = StringUtils.EMPTY;
			  try {
		    	  
				  if(!StringUtils.isNotBlank(token)){
			        	
			       	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
			   			
			   			return result;
			          }
					  result = homePageService.gameRank(token,page,size,type);
		        } catch (Exception e) {
		        	
		        	LOGGER.error("系统异常" + e.getLocalizedMessage());
		        	result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
		           
		        }
			  
			return result;
		}
	 
	 
	 /*@RequestMapping(value = "/home/http",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "首页")
		public String http(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token){
			
			LOGGER.info("--------------------------------------------home/http:"+token);
			 String result = StringUtils.EMPTY;
			 
			 try {
			//	String sendPost = HttpUtils.sendPost("http://jinrongt.jihustore.com/yqbing-sso/app/user/api/reg?data={/"sign/":/"fe49ac16ebc3dfa951c5ab7db963aada/",/"+appChannel/":/"21/",/"device/":/"/",/"version/":/"/",/"mobile/":/"cesh001000030/"}/", /"/");
			//	LOGGER.info("--------------------------------------------home/http:"+sendPost);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			return result;
		}*/
	 
	 
	 
}
