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
import com.yqbing.servicebing.service.LaChineService;
import com.yqbing.servicebing.service.LocalService;
import com.yqbing.servicebing.utils.NotifyUtil;


@RestController
@Api(tags = "本地服务")
@SuppressWarnings("all")
public class LocalServiceController extends BaseController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LocalServiceController.class);
	
	@Resource
	private LocalService localService = null;
    
	
	//首页
	@RequestMapping(value = "/local/localPage",
        	method = {RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value = "本地服务首页")
	public String localPage(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
			@ApiParam(name="device",value = "设备mac") @RequestParam(value = "device", required = false) String device,
			@ApiParam(name="cityCode",value = "城市编码") @RequestParam(value = "cityCode", required = false) String cityCode){
		
		LOGGER.info("--------------------------------------------local/localPage:"+token);
		String result = StringUtils.EMPTY;
		 try {
		
		   if(!StringUtils.isNotBlank(token)){
	        	
       	   result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
   			
   			return result;
          }
		  result = localService.localPage(token,device,cityCode);
		  
	 } catch (Exception e) {
		 e.printStackTrace();
		 result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
 
        
     }
		return result;
	}
	
	
	//推荐
	
	
	//附近的  经纬度算出 距离(1000米以内)
	@RequestMapping(value = "/local/localNear",
        	method = {RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value = "附近")
	public String localNear(@ApiParam(name = "type",value="类型,美食,景区") @RequestParam(value = "type", required = true) String type,
							@ApiParam(name="longitude",value = "经度") @RequestParam(value = "longitude", required = true) String longitude,
							@ApiParam(name="latitude",value = "维度") @RequestParam(value = "latitude", required = true) String latitude,
							@ApiParam(name="cityCode",value = "城市编码") @RequestParam(value = "cityCode", required = true) String cityCode,
							@ApiParam(name="id",value = "id") @RequestParam(value = "id", required = true) Long id){
						
		LOGGER.info("--------------------------------------------local/localNear:"+longitude);
		String result = StringUtils.EMPTY;
		result = localService.localNear(type,longitude,latitude,cityCode,id);
		  
		return result;
	}
	
	
	
	//详情
		@RequestMapping(value = "/local/localDatail",
	        	method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "店铺详情")
		public String localDatail(@ApiParam(name = "token",value="用户token") @RequestParam(value = "token", required = true) String token,
				@ApiParam(name="id",value = "店 id") @RequestParam(value = "id", required = true) Long id,
				@ApiParam(name="cityCode",value = "城市 cityCode") @RequestParam(value = "cityCode", required = true) String cityCode,
				@ApiParam(name="moduleType",value = "商品类型") @RequestParam(value = "moduleType", required = true) String moduleType
				){
			
			LOGGER.info("--------------------------------------------local/localDatail:"+id);
			String result = StringUtils.EMPTY;
			
			 try {
			
			   if(!StringUtils.isNotBlank(token)){
		        	
	       	    result = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"token 信息必须填写");
	   			
	   			return result;
	          }
			    result = localService.localDatail(moduleType,id,token,cityCode);
			  
		 } catch (Exception e) {
			 
			    e.printStackTrace();
			    
			    result = NotifyUtil.error(ErrorCodeEnum.OPERATERROE,e.getLocalizedMessage());
	     }
			return result;
	}
	    //搜索
		@RequestMapping(value = "/local/localSearch",method = {RequestMethod.GET,RequestMethod.POST})
		@ApiOperation(value = "搜索")
		public String localSearch(@ApiParam(name = "keywords",value="类型,美食,景区") @RequestParam(value = "keywords", required = true) String keywords,
				                  @ApiParam(name = "cityCode",value="城市cityCode") @RequestParam(value = "cityCode", required = true) String cityCode){
			
			LOGGER.info("--------------------------------------------local/localSearch:"+keywords);
			String result = StringUtils.EMPTY;
			result = localService.localSearch(keywords,cityCode);
			  
			return result;
		}
	
}
