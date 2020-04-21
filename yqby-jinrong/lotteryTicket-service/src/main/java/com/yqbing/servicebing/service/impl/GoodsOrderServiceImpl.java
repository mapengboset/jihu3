package com.yqbing.servicebing.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yqbing.servicebing.utils.*;
import com.yqbing.servicebing.webapp.request.AgentGoodsOrderReq;

import io.swagger.models.auth.In;

import org.apache.commons.lang.StringUtils;
import org.aspectj.weaver.ast.Not;
import org.docx4j.wml.R;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.alipay.api.domain.TicketDetailInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.City;
import com.yqbing.servicebing.repository.database.bean.GoodsOrder;
import com.yqbing.servicebing.repository.database.bean.GoodsOrderRes;
import com.yqbing.servicebing.repository.database.bean.StoreInfo;
import com.yqbing.servicebing.repository.database.bean.StoreUser;
import com.yqbing.servicebing.repository.database.bean.TakeDddress;
import com.yqbing.servicebing.repository.database.bean.TicketGoods;
import com.yqbing.servicebing.repository.database.bean.TicketGoodsStandard;
import com.yqbing.servicebing.repository.database.bean.TicketGoodsWithBLOBs;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.bean.WealthLog;
import com.yqbing.servicebing.repository.database.dao.CityMapper;
import com.yqbing.servicebing.repository.database.dao.GoodsOrderExample;
import com.yqbing.servicebing.repository.database.dao.GoodsOrderMapper;
import com.yqbing.servicebing.repository.database.dao.StoreInfoMapper;
import com.yqbing.servicebing.repository.database.dao.StoreUserMapper;
import com.yqbing.servicebing.repository.database.dao.TakeDddressExample;
import com.yqbing.servicebing.repository.database.dao.TakeDddressMapper;
import com.yqbing.servicebing.repository.database.dao.TicketGoodsExample;
import com.yqbing.servicebing.repository.database.dao.TicketGoodsExample.Criteria;
import com.yqbing.servicebing.repository.database.dao.TicketGoodsMapper;
import com.yqbing.servicebing.repository.database.dao.TicketGoodsStandardExample;
import com.yqbing.servicebing.repository.database.dao.TicketGoodsStandardMapper;
import com.yqbing.servicebing.repository.database.dao.UserInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.WealthLogMapper;
import com.yqbing.servicebing.repository.jihuc.bean.SysDict;
import com.yqbing.servicebing.repository.redis.GoodsOrderLog;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.GoodsOrderService;
import com.yqbing.servicebing.webapp.request.AddressReq;
import com.yqbing.servicebing.webapp.request.AddressRes;
import com.yqbing.servicebing.webapp.request.GoodsOrderReq;
import com.yqbing.servicebing.webapp.request.TUserInfoBean;

import org.springframework.transaction.annotation.Transactional;



@Service("goodsOrderService")
@SuppressWarnings("all")
public class GoodsOrderServiceImpl extends CommonService implements GoodsOrderService{

	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GoodsOrderServiceImpl.class);
	@Resource
	private TicketGoodsMapper ticketGoodsMapper = null;
	@Resource
	private TakeDddressMapper takeDddressMapper = null;
	@Resource
	private GoodsOrderMapper goodsOrderMapper = null;
	@Resource
	private TicketGoodsStandardMapper ticketGoodsStandardMapper = null;
	@Resource
	private UserInfoBeanMapper userInfoBeanMapper = null;
	@Resource
	private WealthLogMapper  wealthLogMapper;
	@Resource
	private StoreUserMapper  storeUserMapper;
	@Resource
	private StoreInfoMapper  storeInfoMapper;
	
	@Resource
	private GoodsOrderLog rgoodsOrderLog = null;
	
	@Resource
	private CityMapper cityMapper = null;
	
	@Value("${user_https}")
	private String user_https = null;
	
	
	@Override
	public String citys(String token) {
		
		List<City> citys =   cityMapper.queryCitys();
		
		
		return NotifyUtil.success(citys);
	}

	@Override
	public String myAddress(String token) {
		
		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		TakeDddressExample tdressExample = new TakeDddressExample();
		
		tdressExample.createCriteria().andUserIdEqualTo(infoBean.getId());
		
		List<TakeDddress> list = takeDddressMapper.selectByExample(tdressExample);
		
		
		return NotifyUtil.success(list);
	}

	@Override
	public String addAddress(AddressReq req) {
		UserInfoBean infoBean = queryTokenByUser(req.getToken());
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		
		String success = null;
		try {
			TakeDddress dddress = new TakeDddress();
			dddress.setUserId(infoBean.getId());
			dddress.setPhone(req.getPhone());
			dddress.setName(req.getName());
			dddress.setDoornum(req.getDoornum());
			dddress.setSex(req.getSex());
			dddress.setAddress(req.getAddress());
			dddress.setLable(req.getLable());
			dddress.setProvince(req.getProvince());
			dddress.setProvinceCode(req.getProvinceCode());
			dddress.setCity(req.getCity());
			dddress.setCityCode(req.getCityCode());
			dddress.setArea(req.getArea());
			dddress.setAreaCode(req.getAreaCode());
			dddress.setCreateTime(new Date());
			takeDddressMapper.insertSelective(dddress);
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
			success = NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		}
		
		return NotifyUtil.success();
	}

	@Override
	public String delAddress(String token, Integer id) {
		
		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		
				String success = null;
				try {
					takeDddressMapper.deleteByPrimaryKey(id);
				} catch (Exception e) {
					
					
					e.printStackTrace();
					
					return	success = NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
				}
		
		return NotifyUtil.success();
	}

	@Override
	public String editAddress(AddressReq req) {
		
		UserInfoBean infoBean = queryTokenByUser(req.getToken());
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		String success = null;
		TakeDddress dddress = takeDddressMapper.selectByPrimaryKey(req.getId());
		if(dddress == null){
			success = NotifyUtil.error(ErrorCodeEnum.EXISTADDRESS);
			return success;
		}
		try {
			
			if(StringUtils.isNotBlank(req.getPhone())){
				dddress.setPhone(req.getPhone());
				
			}
			
			if(StringUtils.isNotBlank(req.getName())){
				dddress.setName(req.getName());
			}
				
			dddress.setDoornum(req.getDoornum());
			
			if(req.getSex()!= null){
				dddress.setSex(req.getSex());
			}
			if(StringUtils.isNotBlank(req.getAddress())){
				dddress.setAddress(req.getAddress());
			}
			if(req.getLable() != null){
				dddress.setLable(req.getLable());
			}
			if(StringUtils.isNotBlank(req.getProvince())){
				dddress.setProvince(req.getProvince());
			}
			if(StringUtils.isNotBlank(req.getProvinceCode())){
				dddress.setProvinceCode(req.getProvinceCode());
			}
			if(StringUtils.isNotBlank(req.getCity())){
				dddress.setCity(req.getCity());
			}
			if(StringUtils.isNotBlank(req.getCityCode())){
				dddress.setCityCode(req.getCityCode());
			}
			if(StringUtils.isNotBlank(req.getArea())){
				dddress.setArea(req.getArea());
			}
			if(StringUtils.isNotBlank(req.getAreaCode())){
				dddress.setAreaCode(req.getAreaCode());
			}
			dddress.setUpdateTime(new Date());
			takeDddressMapper.updateByPrimaryKey(dddress);
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
			return	success = NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		}
		
		return NotifyUtil.success();
	}

	
	
	@Override
	public String queryById(String token, Integer id) {
		
		
		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		
		TakeDddress takeDddress = takeDddressMapper.selectByPrimaryKey(id);
		if(takeDddress == null){
			return NotifyUtil.success();
			
		}
		AddressRes addressRes = new AddressRes();
		addressRes.setAddress(takeDddress.getProvince()+""+takeDddress.getCity()+""+takeDddress.getArea()+""+takeDddress.getAddress()+""+takeDddress.getDoornum());
		addressRes.setName(takeDddress.getName());
		addressRes.setPhone(takeDddress.getPhone());
		addressRes.setId(takeDddress.getId());
		addressRes.setSex(takeDddress.getSex());
		addressRes.setTag(takeDddress.getLable());
		
		return NotifyUtil.success(takeDddress);
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println(Des3.encode("5511372999.00122999.0021573207321000"));
		
	}
	@Override
	@Transactional
	public String order(GoodsOrderReq req) {
		//付款之前查看账户余额是否支持付款
		UserInfoBean infoBean = queryTokenByUser(req.getToken());
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
		}
		//判断验签
		LOGGER.info("---------------------------------入参生成订单验签signbeffer"+req.getSign()+"---------------------------------");
		
		String signAfter = null;
		String sig = ""+req.getAddressId()+req.getGoogsNum()+req.getStandardId()+req.getPrice()+req.getExpress()+req.getAmount()+req.getGoodsId()+req.getTimeStamp();
		try {
			
			 signAfter = Des3.encode(""+req.getAddressId()+req.getGoogsNum()+req.getStandardId()+req.getPrice()+req.getExpress()+req.getAmount()+req.getGoodsId()+req.getTimeStamp());
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LOGGER.info("---------------------------------入参生拼接"+sig+"---------------------------------");
		LOGGER.info("---------------------------------入参生成订单验签signAfter"+signAfter+"---------------------------------");
		if(!signAfter.equals(req.getSign().replace(' ','+'))){
			return NotifyUtil.error(ErrorCodeEnum.SIGNERROR);
		}
		//如果已经存在useriD和timeStamp ,禁止在下订单
		GoodsOrder order = goodsOrderMapper.selectByuserIdAndtime(infoBean.getId()+"", req.getTimeStamp()+"");
		if(order != null){
			return NotifyUtil.error(ErrorCodeEnum.EXISTORDER);
		}
		
		StoreUser storeUser = storeUserMapper.selectByUserId(infoBean.getId());
		if(storeUser == null){
			return NotifyUtil.error(ErrorCodeEnum.NOTSRORE);
		}
		if(storeUser.getUserState() != 1){
			return NotifyUtil.error(ErrorCodeEnum.NOTSRORE);
		}
		Integer wealth =0;
		Integer googsQuantity = null;
		TicketGoods ticketGoods = null;
		BigDecimal Price = null;
		BigDecimal multiply = null;
		Map<String,Object> map = null;
		try {
			wealth = infoBean.getWealth();//当前财富值
			if(wealth == null || wealth == 0){
				return NotifyUtil.error(ErrorCodeEnum.BALANCE);
			}
			googsQuantity = req.getGoogsNum();//购买数量
			//商品单价
			ticketGoods = ticketGoodsMapper.selectByPrimaryKey(req.getGoodsId());
		     if(ticketGoods == null){
		    	 return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
		     }
		     
		     
			/*List<TicketGoodsStandard> goodsStandards = ticketGoodsStandardMapper.selectByGoodsId(req.getGoodsId());
            if(goodsStandards == null && goodsStandards.size() == 0){
            	return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
		     }*/
		     
		    TicketGoodsStandard goodsStandard = ticketGoodsStandardMapper.selectByPrimaryKey(req.getStandardId());
		    
		    if(goodsStandard == null ){
            	return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
		    
		    }
		    if(ticketGoods.getGoodsType().equals("ticket")){
		    	
		    	Price = goodsStandard.getStandardPrice().multiply(getGOODsReat(infoBean.getId()));
		    }else{
		    	Price = goodsStandard.getStandardPrice();
		    }
		    
			
			if(Price == null){
				
				return NotifyUtil.error(ErrorCodeEnum.PRICE);
			
			}
			//快递费用
			BigDecimal ex = req.getExpress();
			multiply = Price.multiply(new BigDecimal(googsQuantity)).add(ex).multiply(new BigDecimal(100));
			if(multiply==null){
				
				multiply = new BigDecimal(0);
			
			}
			if(new BigDecimal(wealth).compareTo(multiply) == -1){//财富值>= 商品单价*商品数量+快递费用
				
				return NotifyUtil.error(ErrorCodeEnum.BALANCE);
			}
		//-----------下订单
		
		GoodsOrder goodsOrder = new GoodsOrder();
		TakeDddress takeDddress = takeDddressMapper.selectByPrimaryKey(req.getAddressId());
		if(takeDddress == null){
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
	    }
		goodsOrder.setAddress(takeDddress.getAddress()+" "+takeDddress.getDoornum());
		goodsOrder.setAddressName(takeDddress.getName());
		goodsOrder.setAddressPhone(takeDddress.getPhone());
		goodsOrder.setProvinceId(Integer.valueOf(takeDddress.getProvinceCode()));
		goodsOrder.setProvinceName(takeDddress.getProvince());
		goodsOrder.setCityId(Integer.valueOf(takeDddress.getCityCode()));
		goodsOrder.setCityName(takeDddress.getCity());
		if(StringUtils.isNotBlank(takeDddress.getAreaCode())){
			
			goodsOrder.setAreaId(Integer.valueOf(takeDddress.getAreaCode()));
		
		}
		goodsOrder.setAreaName(takeDddress.getArea());
		goodsOrder.setAmount(Price.multiply(new BigDecimal(googsQuantity)));
		goodsOrder.setTotalamount(Price.multiply(new BigDecimal(googsQuantity)).add(ex));
		goodsOrder.setGoodsId(req.getGoodsId());
		goodsOrder.setGoogsNum(googsQuantity);
		//生成订单号
		String increment = rgoodsOrderLog.increment(new Date().getTime());
		goodsOrder.setUserName(infoBean.getName());
		goodsOrder.setOrderId(increment);
		goodsOrder.setPrice(Price);
		goodsOrder.setUserId(infoBean.getId());
		goodsOrder.setExpress(req.getExpress());
		goodsOrder.setCreateTime(new Date());
		goodsOrder.setOrderTime(new Date());
		goodsOrder.setPayTime(new Date());
		goodsOrder.setChannel("ticket");
		goodsOrder.setGoodsName(ticketGoods.getName());
		short s = 1;
		goodsOrder.setGoodsImg(ticketGoods.getIcon());
		goodsOrder.setPayType(req.getPayType());
		goodsOrder.setStatus(s);
		goodsOrder.setReason(req.getTimeStamp()+"");
		TicketGoodsStandard standard = ticketGoodsStandardMapper.selectByPrimaryKey(req.getStandardId());
		if(standard != null){
			
			goodsOrder.setStandard(standard.getStandard());
		}
		map = new HashMap<String, Object>();
		map.put("orderId", increment);
		goodsOrderMapper.insertSelective(goodsOrder);
			
		//扣除财富值	
		infoBean.setWealth(wealth-multiply.intValue());
		infoBean.setUpdateTime(new Date());	
		userInfoBeanMapper.updateByPrimaryKey(infoBean);
		//存入到财富日志
		WealthLog weal = new WealthLog();
		
		weal.setUserId(infoBean.getId());
		weal.setUserName(infoBean.getName());
		weal.setWealthBefore(infoBean.getWealth());
		weal.setWealthAfter(infoBean.getWealth()-multiply.intValue());
		weal.setWealthCount(multiply.intValue());
	 
	    short e = 4;
		weal.setLogType(s);
		weal.setWealthState(s);
		weal.setExchangeType(e);
		weal.setCreateTime(new Date());
		weal.setRecTime(new Date());
		wealthLogMapper.insertSelective(weal);
		
		} catch (Exception e) {
			e.printStackTrace();
			return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		}
		
		
		
		return NotifyUtil.success(map);
	}

	@Override
	public String goodsDatail(String token,Integer type) {
		
		TicketGoodsExample goodsExample = new TicketGoodsExample();
		Criteria createCriteria = goodsExample.createCriteria();
		if(type ==1){

			createCriteria.andGoodsTypeEqualTo("ticket");

		}else if(type == 2) {

			createCriteria.andGoodsTypeEqualTo("machine");

		}else if(type == 3){

			createCriteria.andGoodsTypeEqualTo("smoke");

		} else {

			createCriteria.andGoodsTypeEqualTo("smokemachine");

		}

		goodsExample.setOrderByClause(" create_time desc");
		
		List<TicketGoodsWithBLOBs> list = ticketGoodsMapper.selectByExampleWithBLOBs(goodsExample);
		if(list == null || list.size() == 0){
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE, "商品不存在");
		}

		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");

		}

		TicketGoodsWithBLOBs goods = list.get(0);
		
		TicketGoodsStandardExample standardExample = new TicketGoodsStandardExample();
		standardExample.createCriteria().andGoodsIdEqualTo(goods.getId());
		List<TicketGoodsStandard> standards = ticketGoodsStandardMapper.selectByExample(standardExample);
		
		if(standards == null){
			
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE, "商品不存在");
		
		}

		for (TicketGoodsStandard ts : standards) {
				
			if(goods.getGoodsType().equals("ticket")){
					
				ts.setStandardPrice(ts.getStandardPrice().multiply(getGOODsReat(infoBean.getId())));
				
			}

		}
		
		goods.setSellPrice(new BigDecimal(0));//快递
		
		goods.setStandards(standards);

		//goods.setWeight(standards.get(0) ==null ? new BigDecimal(0) :standards.get(0).getWeight());

		return NotifyUtil.success(goods);
	}

	@Override
	public String myOrders(String token, short type, Integer page, Integer size) {
		
		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
		
		List<GoodsOrderRes> goods = goodsOrderMapper.queryList(infoBean.getId(),type ,page*size,size);
		
		return NotifyUtil.success(goods);
	}

	@Override
	public String orderDetail(String token,String id ,String orderId) {
		GoodsOrder goodsOrder = null;
		if(StringUtils.isNotBlank(orderId)){
			 goodsOrder = goodsOrderMapper.selectByOrderId(orderId);
		}else{
			
			 goodsOrder = goodsOrderMapper.selectByPrimaryKey(Integer.valueOf(id));
		}
		
		
		return NotifyUtil.success(goodsOrder);
	}

	@Override
	public String ifOrder(String token,String orderId) {
		
		 GoodsOrder goodsOrder = goodsOrderMapper.selectByOrderId(orderId);
		 try {
			 
			 short s = 3;
			 if(goodsOrder != null){
				 goodsOrder.setStatus(s);
				 goodsOrder.setUpdateTime(new Date());;
			 }
			 goodsOrderMapper.updateByPrimaryKey(goodsOrder);
			 
		} catch (Exception e) {
			e.printStackTrace();
			return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		
		}
		return NotifyUtil.success();
	}

	public BigDecimal getGOODsReat(Long userID){
		StoreUser storeUser = storeUserMapper.selectByUserId(userID);
		if(storeUser == null){
			return null;
		}
		StoreInfo storeInfo = storeInfoMapper.selectByPrimaryKey(storeUser.getStoreId());
        if(storeUser == null){
			return null;
		}
        if(storeInfo.getBuyGoodsRate() == null){
        	return new BigDecimal(1);
        }
        return storeInfo.getBuyGoodsRate().divide(new BigDecimal(100), 2);
	}


	@Override
	public String agentTicketGoodsList() throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		List<TicketGoods> goodsOrders = ticketGoodsMapper.selectAgentTicketGoodsList();
		
		goodsOrders.forEach(g -> g.setIcon(g.getAgentIcon()));
		
		map.put("goodsList",goodsOrders);
		return NotifyUtil.success(map);
	}

	@Override
	public String agentGoodsDatail(String goodsId) {
		
		
        if(!StringUtils.isBlank(goodsId)){
			
        	TicketGoodsWithBLOBs ticketGoodsWithBLOBs = ticketGoodsMapper.selectByPrimaryKey(Integer.valueOf(goodsId));
        	
        	
        	TicketGoodsStandardExample standardExample = new TicketGoodsStandardExample();
        	
        	standardExample.createCriteria().andGoodsIdEqualTo(Integer.valueOf(goodsId));
        	
        	List<TicketGoodsStandard> standards = ticketGoodsStandardMapper.selectByExample(standardExample);
        	
        	ticketGoodsWithBLOBs.setStandards(standards);
            if(ticketGoodsWithBLOBs.getGoodsType().equals("ticket")){
            	DecimalFormat df2 =new DecimalFormat("#.00");
            	standards.get(0).setStandardPrice((new BigDecimal(df2.format(standards.get(0).getStandardPrice().multiply(new BigDecimal(0.98))))));
        	}
        	return NotifyUtil.success(ticketGoodsWithBLOBs);
		}
        return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
	}

	@Transactional
	public String agentAddOrder(AgentGoodsOrderReq req, HttpServletRequest request) throws UnsupportedEncodingException {
	
		//	String s1 = new String(req.getAddressName().getBytes("iso-8859-1"), "utf-8");

        String signBefore = req.getSign();
		if(StringUtils.isBlank(signBefore)){
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"验签不能为空");
		}
	
		
	/*	String sendPost;
		TUserInfoBean user = null;
		try {
			 Map<String,Object> map = new HashMap<String, Object>();
			 map.put("userId", req.get)
			 sendPost = HttpUtil.sendPost(user_https+"/user/getUser", map.toString());
			 JSONObject JSONObject = new JSONObject(sendPost);
			 int code = JSONObject.getInt("code");
			 if(code != 0){
				 
				
			 }
			 Object object = JSONObject.get("body");
			
			 user= new Gson().fromJson(object.toString(), new TypeToken<TUserInfoBean>() {}.getType());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		Map<String,Object> maps = new HashMap<>();
		maps.put("payType",req.getPayType());
		maps.put("address",req.getAddress());
		maps.put("addressName",req.getAddressName());
		maps.put("addressPhone",req.getAddressPhone());
		maps.put("provinceId",req.getProvinceId());
		maps.put("provinceName",req.getProvinceName());
		maps.put("cityId",req.getCityId());
		maps.put("cityName",req.getCityName());
		maps.put("areaId",req.getAreaId());
		maps.put("areaName",req.getAreaName());
		maps.put("goodsId",req.getGoodsId());
		maps.put("googsNum",req.getGoogsNum());
		maps.put("price",req.getPrice());
		maps.put("express",req.getExpress());
		maps.put("amount",req.getAmount());
		maps.put("standard",req.getStandard());
		maps.put("channel","agent");
		maps.put("agentUserId",req.getAgentUserId());
		maps.put("totalamount",req.getTotalamount());
		maps.put("timeStamp",req.getTimeStamp());
		maps.put("timeStamp",req.getTimeStamp());
		maps.put("username",req.getUsername());
		maps.put("userphone",req.getUserphone());
		
		String signAfter = SignUtils.getSign(maps);
		LOGGER.info("---------------------------------入参生成订单验签signAfter"+signAfter+"---------------------------------");
		if(!StringUtils.equals(signBefore,signAfter)){
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"验签未通过");
		}
        //如果已经存在useriD和timeStamp ,禁止在下订单
		GoodsOrder good = goodsOrderMapper.selectByuserIdAndtime(req.getAgentUserId(),req.getTimeStamp());
		if(good != null){
			return NotifyUtil.error(ErrorCodeEnum.EXISTORDER);
		}
		
		if(null == req || Long.valueOf(req.getAgentUserId()) <= 0){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户信息不存在");
		}

		//购买数量
		String googsQuantity = null;
		//商品
		TicketGoods ticketGoods = null;
		//单价
		BigDecimal price = null;
		Map<String,Object> map = null;
		try {

			//购买数量
			googsQuantity = req.getGoogsNum();
			//商品
			ticketGoods = ticketGoodsMapper.selectByPrimaryKey(Integer.valueOf(req.getGoodsId()));
			if(ticketGoods == null){
				return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
			}

			TicketGoodsStandard goodsStandard = ticketGoodsStandardMapper.selectByPrimaryKey(Integer.valueOf(req.getStandard()));

			if(goodsStandard == null ){
				return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);

			}

			if(req.getPrice() == null){

				return NotifyUtil.error(ErrorCodeEnum.PRICE);

			}

			//-----------下订单

			GoodsOrder goodsOrder = new GoodsOrder();

			goodsOrder.setAddress(req.getAddress());
			goodsOrder.setAddressName(req.getAddressName());
			goodsOrder.setAddressPhone(req.getAddressPhone());
			goodsOrder.setProvinceId(Integer.valueOf(req.getProvinceId()));
			goodsOrder.setProvinceName(req.getProvinceName());
			goodsOrder.setCityId(Integer.valueOf(req.getCityId()));
			goodsOrder.setCityName(req.getCityName());
			if(Integer.valueOf(req.getAreaId())>0){

				goodsOrder.setAreaId(Integer.valueOf(req.getAreaId()));

			}
			goodsOrder.setAreaName(req.getAreaName());
		   
			//商品的金额
			goodsOrder.setAmount(new BigDecimal(req.getAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
			//订单总金额
			goodsOrder.setTotalamount(new BigDecimal(req.getTotalamount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
			goodsOrder.setGoodsId(Integer.valueOf(req.getGoodsId()));
			//购买数量
			goodsOrder.setGoogsNum(Integer.valueOf(googsQuantity));
			//生成订单号
			String increment = rgoodsOrderLog.increment(new Date().getTime());

			goodsOrder.setOrderId(increment);
			goodsOrder.setPrice(new BigDecimal(req.getPrice()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
			goodsOrder.setUserId(Long.valueOf(req.getAgentUserId()));
			goodsOrder.setUserName(req.getUsername());
			goodsOrder.setUserPhone(req.getUserphone());
			goodsOrder.setExpress(new BigDecimal(req.getExpress()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
			goodsOrder.setCreateTime(new Date());
			goodsOrder.setOrderTime(new Date());
			goodsOrder.setPayTime(new Date());


			goodsOrder.setChannel(req.getChannel());
			goodsOrder.setGoodsName(ticketGoods.getName());
			short s = 1;
			goodsOrder.setGoodsImg(ticketGoods.getIcon());
			goodsOrder.setPayType(Short.parseShort(req.getPayType()));
			goodsOrder.setStatus(s);
			TicketGoodsStandard standard = ticketGoodsStandardMapper.selectByPrimaryKey(Integer.valueOf(req.getStandard()));
			if(standard != null){

				goodsOrder.setStandard(standard.getStandard());
			}
			goodsOrder.setReason(req.getTimeStamp());
			map = new HashMap<String, Object>();
			map.put("orderId", increment);
			goodsOrderMapper.insertSelective(goodsOrder);

		} catch (Exception e) {
			e.printStackTrace();
			return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		}

		return NotifyUtil.success(map);
	}

	
	

	@Override
	public String agentEditOrder(String orderId, Short status) {
		
		GoodsOrder goods = goodsOrderMapper.selectByOrderId(orderId);
		
		if(goods == null){
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"暂无订单");
		}
		goods.setStatus(status);
		goods.setUpdateTime(new Date());
		try {
			goodsOrderMapper.updateByPrimaryKeySelective(goods);
			
		} catch (Exception e) {
		    e.printStackTrace();
		    return NotifyUtil.error(ErrorCodeEnum.OPERATERROE);
		}
		
		return NotifyUtil.success();
	}

	
	@Override
	public String agentGoodOrderList(String agentUserId, String status) {
		
		if(StringUtils.isBlank(agentUserId)){
		
			return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"用户不存在");
		
		}
		try {
			
			GoodsOrderExample goodsOrderExample = new GoodsOrderExample();
			com.yqbing.servicebing.repository.database.dao.GoodsOrderExample.Criteria criteria = goodsOrderExample.createCriteria();
			criteria.andUserIdEqualTo(Long.valueOf(agentUserId));
		    if(status != null){
		    	if(status.equals("3")){
		    		status = "4";
		    	}
		    	criteria.andStatusEqualTo(Short.valueOf(status));
			}
			goodsOrderExample.setOrderByClause(" create_time desc");
			List<GoodsOrder> goodsOrders = goodsOrderMapper.selectByExample(goodsOrderExample);
			
			if(null == goodsOrders || goodsOrders.size() <= 0){
			
				return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"暂无订单");
			
			}
		
			return NotifyUtil.success(goodsOrders);
		} catch (Exception e) {
	    
			e.printStackTrace();
		
		}
		return null;
		
}

  
	@Override
	public String agentOrderDatail(String orderId) {
		
			GoodsOrder selectByOrderId = goodsOrderMapper.selectByOrderId(orderId);
			return NotifyUtil.success(selectByOrderId);
	
	}
	
}
