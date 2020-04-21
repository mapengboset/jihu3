package com.yqbing.servicebing.webapp.controller;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.service.TUserInfoBeanService;
import com.yqbing.servicebing.service.YiMeiPayService;
import com.yqbing.servicebing.utils.NotifyUtil;


@RestController
@CrossOrigin
public class YiMeiAntCreditPayController extends BaseController{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(YiMeiAntCreditPayController.class);
	
	
	
	@Resource(name = "yiMeiPayService")
	private YiMeiPayService yiMeiPayService;
	
	 //伊美花呗分期
    //通过总金额 返回分期数(期数 总费用 + 每期的手续费)
    @RequestMapping(value = "/yimeipay/preparePay",
        	method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "通过总金额 返回分期数(期数 总费用 + 每期的手续费)")
	public String preparePay(@ApiParam(value = "totalAmount") @RequestParam(value = "totalAmount", required = true) String totalAmount){
    	
    	 LOGGER.info("/yimeipay/preparePay:----------------------------------通过总金额 返回分期数"+ totalAmount);
    	 String resultModel = StringUtils.EMPTY;
    	  try {
	
    	      if(!StringUtils.isNotBlank(totalAmount)){
    		    
    	    	  resultModel = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"金额 不能为空");
    		 
    		    return resultModel;
    	    }
 	    	
  			
  			//----------计算总金额totalAmount);outTradeNo
  		
  			resultModel = yiMeiPayService.preparePay(totalAmount);
  			
  			
  		} catch (Exception e) {
  			 resultModel = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"系统问题");
  			 e.printStackTrace();
  		}
  	    return resultModel;
    }
	//返回收款码
    @RequestMapping(value = "/yimeipay/qrCode",
        	method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "返回收款码")
	public String qrCode(@ApiParam(value = "outTradeNo") @RequestParam(value = "outTradeNo", required = true) String outTradeNo,
			@ApiParam(value = "fqNum") @RequestParam(value = "fqNum", required = true) String fqNum,
			@ApiParam(value = "type") @RequestParam(value = "type", required = true) String type){
    	 LOGGER.error("/yimeipay/qrCode:----------------------------------获取收款码:"+ outTradeNo);
    	 String resultModel = StringUtils.EMPTY;
    	  try {
	          
    	      if(!StringUtils.isNotBlank(outTradeNo)){
    	    	  
    		     resultModel = NotifyUtil.error(ErrorCodeEnum.NULLPARAM,"订单号 不能为空");
    		 
    		     return resultModel;
    	    }
  			//----------计算总金额totalAmount);outTradeNo
  		
  			resultModel = yiMeiPayService.qrCode(outTradeNo,fqNum,type);
  			LOGGER.info("yimeipay/qrCode--------------------------------------返回集合"+resultModel);
  			
  		} catch (Exception e) {
  			e.printStackTrace();
  			resultModel = NotifyUtil.error(ErrorCodeEnum.NULLUSER,"参数有问题");
  		}
  	    return resultModel;
    }
	//交易查询
	
    @RequestMapping(value = "/yimeipay/queryPay",
        	method = {RequestMethod.GET,RequestMethod.POST})
	public String queryPay(@ApiParam(value = "outTradeNo") @RequestParam(value = "outTradeNo", required = true) String outTradeNo){
    	LOGGER.error("/yimeipay/queryPay:----------------------------------交易查询:"+ outTradeNo);
    	 String resultModel = StringUtils.EMPTY;
    	  try {
	           
   			//----------计算总金额totalAmount);outTradeNo
   		
   			resultModel = yiMeiPayService.queryPay(outTradeNo);
   			LOGGER.info("yimeipay/queryPay--------------------------------------返回集合"+resultModel);
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   			resultModel = NotifyUtil.error(ErrorCodeEnum.NULLUSER,"参数有问题");
   		}
    	 return resultModel;
    }
	
}
