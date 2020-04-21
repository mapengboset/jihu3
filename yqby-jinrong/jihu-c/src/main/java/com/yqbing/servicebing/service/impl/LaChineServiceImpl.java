package com.yqbing.servicebing.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.docx4j.model.datastorage.XPathEnhancerParser.main_return;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.GameCpsDataDayDetail;
import com.yqbing.servicebing.repository.database.bean.StoreHouse;
import com.yqbing.servicebing.repository.database.bean.SysDict;
import com.yqbing.servicebing.repository.database.bean.UserDownDataDayDetail;
import com.yqbing.servicebing.repository.database.dao.GameCpsDataDayDetailMapper;
import com.yqbing.servicebing.repository.database.dao.StoreHouseExample;
import com.yqbing.servicebing.repository.database.dao.StoreHouseExample.Criteria;
import com.yqbing.servicebing.repository.database.dao.StoreHouseMapper;
import com.yqbing.servicebing.repository.database.dao.SysDictExample;
import com.yqbing.servicebing.repository.database.dao.SysDictMapper;
import com.yqbing.servicebing.repository.database.dao.UserDownDataDayDetailMapper;
import com.yqbing.servicebing.service.LaChineService;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.webapp.response.LaChineVORes;



@Service("laChineService")
@SuppressWarnings("all")
public class LaChineServiceImpl implements LaChineService{

	@Resource
	UserDownDataDayDetailMapper userDownDataDayDetailMapper=null;
	@Resource
	GameCpsDataDayDetailMapper gameCpsDataDayDetailMapper=null;
	 @Autowired
	 private StoreHouseMapper storeHouseMapper= null;
	 @Resource
		private SysDictMapper sysDictMapper = null;
	 
	 private static final Logger LOGGER = LoggerFactory.getLogger(LaChineServiceImpl.class);
	@Override
	public String queryList(String stime, String etime, Integer courrent,
			Integer size,String code ) {
		
		List<LaChineVORes> las = new ArrayList<LaChineVORes>();
		List<LaChineVORes> klas = new ArrayList<LaChineVORes>();
		if(StringUtils.isNotBlank(code)){
		
		  String[] split = code.split(",");
		  List<UserDownDataDayDetail>	udds =   userDownDataDayDetailMapper.queryInvite(split,stime,etime+" :24:00",courrent,size);
		  Integer to = 0;
		  for (UserDownDataDayDetail u : udds) {
			  LaChineVORes voRes = new LaChineVORes();
			    if(u.getSelf() == 1){//快下
			    	 voRes.setIcon("http://p2a60yqmm.bkt.clouddn.com/kuaixiaLogo.png");
			    	 voRes.setName("快下其它");
			    	 
			    	 voRes.setTotal(to+=Integer.valueOf(u.getTotal().setScale(0, BigDecimal.ROUND_HALF_UP).toString()) );
			    	 klas.add(voRes);
			    }
			    
			    
		  }
		  if(klas.size() == 0){
			      LaChineVORes voRes = new LaChineVORes();
			      voRes.setIcon("http://p2a60yqmm.bkt.clouddn.com/kuaixiaLogo.png");
		    	  voRes.setName("快下其它");
		    	
		    	  klas.add(voRes);
		  }
		  
		  Map<String, Object> map = new HashMap<String, Object>();
		  for (UserDownDataDayDetail u : udds) {
			  LaChineVORes voRes = new LaChineVORes();
				
				    if(u.getSelf() == 2){
				   
				    	
				    	voRes.setName(u.getName());
				        voRes.setIcon(u.getImg());
						voRes.setTotal(Integer.valueOf(u.getTotal().setScale(0, BigDecimal.ROUND_HALF_UP).toString()));
						map.put(u.getName(), voRes);
						las.add(voRes);
				    }
		}
		  StoreHouseExample houseExample = new StoreHouseExample();
		  houseExample.createCriteria().andStatusEqualTo(0).andIsSelfEqualTo(2);
		  List<StoreHouse> list = storeHouseMapper.selectByExample(houseExample);
		 
		  for (StoreHouse s : list) {
			  if(map.containsKey(s.getAppName())){//true
				  
			  }else{
				  LaChineVORes voRes = new LaChineVORes();
				    	voRes.setName(s.getAppName());
				        voRes.setIcon(s.getAppUrlImg());
						voRes.setTotal(0);
						 las.add(voRes);
			  }
			  
			  
		  }
		  
		  if(klas.size() > 0){
			  
			  LaChineVORes laChineVORes = klas.get(0);
			  laChineVORes.setTotal(to);
			  las.add(laChineVORes);
		  }
	
			
		}
		
		return NotifyUtil.success(las);
	}
	
	
	
	@Override
	public String gameCpss(String name) {
	   
		StoreHouseExample example = new StoreHouseExample();
		Criteria criteria = example.createCriteria();
		if(!StringUtils.isBlank(name)){
			criteria.andAppNameLike(name);
		}
		criteria.andStatusEqualTo(0).andIsSelfEqualTo(3);
		List<StoreHouse> list = storeHouseMapper.selectByExample(example);
		
		return  NotifyUtil.success(list);
	}


	

	@Override
	public String predict(String stime, String etime, String codes) {
		
		String[] code = null;
		
		if(!StringUtils.isBlank(codes)){
			
			 code = codes.split(",");
		}
		 
		GameCpsDataDayDetail tomunt = gameCpsDataDayDetailMapper.predict(stime+" 00:00:00",etime+" 23:59:59",code);
		
		List<GameCpsDataDayDetail> games =  gameCpsDataDayDetailMapper.predictList(stime,etime,code);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(tomunt != null){
			map.put("tomunt", tomunt.getPredictAmount());
		}else{
			map.put("tomunt", 0);
		}
		map.put("data", games);
		
		return NotifyUtil.success(map);
	}



	@Override
	public String predictDatail(String stime, String etime, String codes) {
        
		String[] code = null;
		
		if(!StringUtils.isBlank(codes)){
			
			 code = codes.split(",");
		}
		 
		
		List<GameCpsDataDayDetail> games =  gameCpsDataDayDetailMapper.predictDatail(stime+" 00:00:00",etime+" 23:59:59",code);
		
		
		
		return NotifyUtil.success(games);
	}



	@Override
	public String ETCLachine(String name, String plate, String token) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String ETCQueryList(Integer page, Integer size, String token) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String userInfo(String phone) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String ral() {
		
		SysDictExample dictExample = new SysDictExample();
		dictExample.createCriteria().andParentKeyEqualTo("luckdraw_configure");
		List<SysDict> list2 = sysDictMapper.selectByExample(dictExample);
		return NotifyUtil.success(list2);
	}
	

}
