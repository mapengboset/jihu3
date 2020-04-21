package com.yqbing.servicebing.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.UserInfoBeanMapper;
import com.yqbing.servicebing.repository.redis.RStoreInfoData;
import com.yqbing.servicebing.repository.redis.StoreInfoBean;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.StoreInfoService;
import com.yqbing.servicebing.utils.HttpRequest;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.utils.SendUtils;


@Service("storeInfoService")
@SuppressWarnings("all")
public class StoreInfoServiceImpl extends CommonService implements StoreInfoService{
	
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(StoreInfoServiceImpl.class);
	
	
	 @Resource
	 private RStoreInfoData  rStoreInfoData = null;
	
	 
	 @Value("${yqbing_Https}")
	 private   String  yqbingHttps;
	 
	 @Value("${charg_service}")
	 private   String  chargHttps;
	
	
	 @Override
	 public String queryInvite(String invite) {
		
		    Map<String,Object> map = new HashMap<String,Object>();
		    StoreInfoBean info = rStoreInfoData.getStoreInfo(invite);
	        if(info != null){
	        	
	        	map.put("storeInfo",info);
	        	return NotifyUtil.success(map);
	        }
	         StoreInfoBean storeInfoBean  = null;
	        
	         Map<String,String> map3 = new HashMap<String, String>();
	         Map<String,String> map4 = new HashMap<String, String>();
			 map3.put("inviteCode", invite);
			 JSONObject data = new JSONObject();
			 
			// String store = SendUtils.doGet(yqbingHttps+"/getStoreInfoByInviteCode.do", data.toString());
	         String param = "data="+""+new Gson().toJson(map3);
	         try {
				
			
	         storeInfoBean = new StoreInfoBean();
			 String sendGet = HttpRequest.sendGet(yqbingHttps+"/getStoreInfoByInviteCode.do", param);
			 
			 JSONObject send = new JSONObject(sendGet);
			 String code1 = send.getString("code");
			 JSONObject body = null;
			 String phone =   null;//门店地址
			 String storename =   null;//门店名称
			 String address =    null;//code
			 String invitationCode =   null;//编号/
			 Integer storeId =  0;//门店ID
			 Integer userid =  0;//网吧用户ID
			 String imgurl =      null;//门店ID
			 String storeCode = null;
			 if(code1.equals("0")){
				  body = send.getJSONObject("body");
				  phone =  body.getString("storeMobile");//门店地址
				  storename =  body.getString("storeName");//门店名称
				  address =  body.getString("storeAdress");//code
				  invitationCode =  body.getString("storeCode");//编号/
				  storeId =  (Integer) body.get("storeId");//门店ID
				  imgurl =   body.getString("storePic");//门店ID
				  storeCode = null;
				  storeInfoBean.setType(0);
			 }else{
		    	
		    //查询 网点信息进行绑定
		    	
		    	     Map<String,String> map2 = new HashMap<String, String>();
					 map2.put("invitationCode", invite);
					 String wangba = SendUtils.doPost(chargHttps+"/kxzs/store/detail", map2);
					 
					 JSONObject JSONOb = new JSONObject(wangba);
					 
					 int code = JSONOb.getInt("code");
					 
					 if(code != 0){
						 
						 return NotifyUtil.error(ErrorCodeEnum.OPERATERROE,JSONOb.getString("msg"));
					 }
					  body = JSONOb.getJSONObject("body");
					  
					    phone =  body.getString("shopkeeperMobile");//手机号
					  
					   address =  body.getString("storeAddress");//门店地址
					   storename =  body.getString("storeName");//门店名称
					   invitationCode =  body.getString("invitationCode");//code
					   imgurl =  body.getString("shopkeeperPhotoUrl");//头像
					   storeCode =  body.getString("storeCode");//编号/
					   storeId =  (Integer) body.get("storeId");//门店ID
					   userid =  (Integer) body.get("storeOwnerId");//门店ID
					   storeInfoBean.setType(1);
					 
		    }
			 
			  storeInfoBean.setStoreAddress(address);
			  storeInfoBean.setStoreName(storename);
			  storeInfoBean.setStorePic(imgurl);
			  storeInfoBean.setStoreCode(storeCode);
			  storeInfoBean.setBack8(phone);
			  storeInfoBean.setStoreId(storeId);
			  storeInfoBean.setUserId(userid);
		      map.put("storeInfo",storeInfoBean);
		      rStoreInfoData.setStoreInfo(invite, storeInfoBean);
			  return NotifyUtil.success(map);
			  
	         } catch (Exception e) {
			   e.printStackTrace();
			   return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
			}
	}


}
