package com.yqbing.servicebing.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.ThirdQRcode;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.ThirdQRcodeMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.ThirdQRcodeService;
import com.yqbing.servicebing.utils.MeituanCreateLinkUtil;
import com.yqbing.servicebing.utils.MeituanSign;
import com.yqbing.servicebing.utils.NotifyUtil;


@Service("thirdQRcodeService")
@SuppressWarnings("all")
public class ThirdQRcodeServiceImpl extends CommonService  implements ThirdQRcodeService{

	public static final String serverUrl = "https://openapi.waimai.meituan.com/tspopenapi/union/buildPartnerUrls";
	 @Resource
	 private ThirdQRcodeMapper  thirdQRcodeMapper;
	@Override
	public String thirdQRcodeBack(String token, Integer type) {
		
		
		try {
			UserInfoBean infoBean = queryTokenByUser(token);
			if( null ==infoBean){
				return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户没有登录");
			}
			
			if(type == 0){//美团
			//先判断是否存在 链接
			ThirdQRcode thirdQRcode	=thirdQRcodeMapper.queryByType(infoBean.getId(),type);
			if(thirdQRcode != null){//存在
			//	thirdQRcode.getUrl();
				return NotifyUtil.success(thirdQRcode.getUrl());
			}
			//-------------不存在
			long timestamp = System.currentTimeMillis();
			String bodyJson = "{\"userRole\":\"firstLevelPartner\",\"partnerAppId\":\"3615585995031466\",\"activityId\":\"\",\"auTraceKey\":\"45AEDD665B374D73\",\"createCount\":\"1\"}";
			String sign = StringUtils.EMPTY;
			String str = "/tspopenapi/union/buildPartnerUrls?{\"userRole\":\"firstLevelPartner\",\"partnerAppId\":\"3615585995031466\",\"activityId\":\"\",\"auTraceKey\":\"45AEDD665B374D73\",\"createCount\":\"1\"}"+timestamp+"bdcb5e82edf04f528cc6b193ece784a2";
		//	System.out.println("**************Start***************");
		//	System.out.println("签名入参：" + str);
			sign = MeituanSign.string2SHA256StrJava(str);
		//	System.out.println("签名结果：" + sign);
		//	System.out.println( );
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("TSP-Ca-Type", StringUtils.EMPTY);
			headers.put("TSP-Ca-PartnerId", "3615585995031466");
			headers.put("TSP-Ca-Signature", sign);
			headers.put("TSP-Ca-Timestamp", String.valueOf(timestamp));
			String body = MeituanCreateLinkUtil.createMeituanLink(serverUrl, bodyJson, headers);
			//System.out.println(body);
			 if(body != null){
					JSONObject JSONObject = new JSONObject(body);
					Integer code = (Integer) JSONObject.get("code");
					if(code == 0) {
						
						 JSONObject data = JSONObject.getJSONObject("data");
						 
						 if(data != null){
							 JSONArray url = data.getJSONArray("urlList");
							 ThirdQRcode qRcode = new ThirdQRcode();
							 qRcode.setCreateTime(new Date());
							 qRcode.setUrl( url.getString(0));
							 qRcode.setUserId(infoBean.getId());
							 qRcode.setType(0);
							 thirdQRcodeMapper.insertSelective(qRcode);
							 return NotifyUtil.success(url.getString(0));
						 }
					}/*else{
						return NotifyUtil.success("https://activityunion-marketing.meituan.com/unioncoupon/index.html?auTraceKey=342CB758F8E9449F");
					}*/
				}
			}
		} catch (Exception e) {
			
		   e.printStackTrace();
		}
		return NotifyUtil.error(ErrorCodeEnum.NOTGAMECODE, "没有了,谢谢");
	}

	
	
	
	
}
