package com.yqbing.servicebing.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.yqbing.servicebing.exception.BingException;
import com.yqbing.servicebing.repository.database.abstracts.WeBankBeanExample;
import com.yqbing.servicebing.repository.database.abstracts.WebankTaskRuleBeanExample;
import com.yqbing.servicebing.repository.database.bean.StoreInfoBean;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;
import com.yqbing.servicebing.repository.database.bean.WebankTaskRuleBean;
import com.yqbing.servicebing.repository.database.dao.StoreInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.TUserInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.WeBankBeanMapper;
import com.yqbing.servicebing.repository.database.dao.WebankTaskRuleBeanMapper;
import com.yqbing.servicebing.repository.redis.RWeBankBean;
import com.yqbing.servicebing.repository.redis.RWeBankBeanLog;
import com.yqbing.servicebing.service.WeBankService;
import com.yqbing.servicebing.utils.DateUtil;
import com.yqbing.servicebing.utils.StrUtils;
import com.yqbing.servicebing.webapp.response.weBankResponse;

@Service("weBankService")
public class WeBankServiceImpl implements WeBankService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(WeBankServiceImpl.class);
	@Autowired
	private WeBankBeanMapper weBankBeanMapper = null;
	@Autowired
	private TUserInfoBeanMapper userInfoBeanMapper = null;
	@Autowired
	private WebankTaskRuleBeanMapper webankTaskRuleBeanMapper = null;
	@Autowired
	private StoreInfoBeanMapper storeInfoBeanMapper = null;
	@Autowired
	private RWeBankBeanLog rWeBankBeanLog = null;

	public weBankResponse queryList(TUserInfoBean validToken, String version,
			int page, int size, String startTime, String endTime)
			throws BingException {
		Integer successsize = null;
		Integer failssize = null;
		Date parsestartTime = null;
		Date parseendTime = null;
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (!StrUtils.isNullOrBlank(startTime)
				&& !StrUtils.isNullOrBlank(endTime)) {
			try {
				parsestartTime = DateUtil.parse(startTime);
				parseendTime = DateUtil.parse(endTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        if(validToken.getUserRole() ==3 ){
        	
        	map.put("token", validToken.getStoreId());
        }else{
        	map.put("token", validToken.getUserId());
        }
		map.put("startTime", parsestartTime);
		map.put("endTime", parseendTime);
		map.put("role", validToken.getUserRole());
		successsize = weBankBeanMapper.querysucccount(map);
		failssize = weBankBeanMapper.queryfailcount(map);
		PageHelper.startPage(page, size);

		List<WeBankBean> wes = weBankBeanMapper.query(map);
		/*if (null != wes && wes.size() != 0) {
			failssize = wes.size() - successsize;
		} else {
			failssize = 0;
		}*/
		if(validToken.getUserRole() == 1){
			successsize = 0;
			failssize = 0;
		}
		PageInfo<WeBankBean> pageInfo = new PageInfo<WeBankBean>(wes);
		weBankResponse response = new weBankResponse();
		response.setSuccessCount(successsize);
		response.setFailCount(failssize);
		response.setData(pageInfo);
		// TODO Auto-generated method stub
		return response;
	}

	public int webanksub(TUserInfoBean user, String picUrl, String name,
			String version) throws BingException {
		WeBankBeanExample weBankBeanExample = new WeBankBeanExample();
		weBankBeanExample.createCriteria().andBeInvitedEqualTo(name).andIsSuccessfulNotEqualTo("2");
		List<WeBankBean> list = weBankBeanMapper.selectByExample(weBankBeanExample);
		
		if(null != list && list.size() > 0){
			return 0;
		}
		WeBankBean weBankBean = new WeBankBean();
		weBankBean.setCreateTime(new Date());
		weBankBean.setInvitedToken(user.gettToken());
		weBankBean.setUserId(user.getUserId());
		weBankBean.setPicUrl(picUrl);
		weBankBean.setBeInvitedTime(new Date());
		weBankBean.setBeInvited(name);
		StoreInfoBean storeInfoBean = storeInfoBeanMapper.selectByPrimaryKey(user.getStoreId());
		weBankBean.setStoreId(user.getStoreId());
		if(storeInfoBean != null){
			weBankBean.setStoreCode(storeInfoBean.getStoreCode());
			weBankBean.setStoreName(storeInfoBean.getStoreName());
		}
		weBankBean.setStoreUsername(user.getUserName());
	    weBankBean.setInvitedName(storeInfoBean != null ? storeInfoBean.getStoreName():null);
		weBankBean.setPhone(user.getUserPhone());
		weBankBean.setExistence("0");
		weBankBean.setIsSuccessful("3");
		weBankBean.setCreateTime(new Date());
		int i = weBankBeanMapper.insertSelective(weBankBean);
		
		Long id = weBankBean.getId();
		if(i > 0){//缓存
			
			rWeBankBeanLog.set(user.getUserId(), name, weBankBean);
			
		}
		
		
		//
		LOGGER.info("laxin/webanksub{}-------------------------"
				+ weBankBean.toString());
		return i;
	}

	@Override
	public JSONObject webankOff(String token, String version) {
		// TODO Auto-generated method stub
		WebankTaskRuleBeanExample ruleBeanExample = new WebankTaskRuleBeanExample();
		ruleBeanExample.createCriteria().andTaskisopenIsNotNull();
		List<WebankTaskRuleBean> selectByExample = webankTaskRuleBeanMapper.selectByExample(ruleBeanExample);
		

		if(selectByExample.size() > 0){
			
			JSONObject body = new JSONObject();
			body.put("code", 0);
			body.put("msg", "success");
			body.put("body", selectByExample.get(0));
					return body; 
		}
		return null;
	}
	
	 
	
}
