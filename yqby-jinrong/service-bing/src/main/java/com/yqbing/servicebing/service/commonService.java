package com.yqbing.servicebing.service;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.yqbing.servicebing.repository.database.bean.StoreInfoBean;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.repository.database.bean.TbAgentBusinessLog;
import com.yqbing.servicebing.repository.database.bean.TbStoreAgent;
import com.yqbing.servicebing.repository.database.dao.StoreInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.TUserInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.TbAgentBusinessLogMapper;
import com.yqbing.servicebing.repository.database.dao.TbStoreAgentExample;
import com.yqbing.servicebing.repository.database.dao.TbStoreAgentMapper;
import com.yqbing.servicebing.repository.redis.RStoreOrderLog;
import com.yqbing.servicebing.webapp.response.StagesRes;


public class commonService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(commonService.class);
	
	@Autowired
	private TbAgentBusinessLogMapper agentBusinessLogMapper = null;
	@Autowired
	private TbStoreAgentMapper storeAgentMapper = null;
	@Autowired
	private StoreInfoBeanMapper storeInfoBeanMapper = null;
	@Autowired
	private TUserInfoBeanMapper userInfoBeanMapper = null;
	@Autowired
	private RStoreOrderLog rStoreOrderLog = null;
	@Value("${aliPay_3fei}")
	private  String aliPay3fei;
	@Value("${aliPay_6fei}")
	private  String aliPay6fei;
	@Value("${aliPay_12fei}")
	private  String aliPay12fei;
	@Value("${aliPay_24fei}")
	private  String aliPay24fei;
	@Value("${dali_fei_12}")
	private  String daliFei12;
	@Value("${dali_fei_24}")
	private  String daliFei24;

	@Value("${yimei_fei_3}")
	private  String yimeiFei3;
	@Value("${yimei_fei_6}")
	private  String yimeiFei6;
	@Value("${yimei_fei_12}")
	private  String yimeiFei12;
	@Value("${yimei_fei_24}")
	private  String yimeiFei24;
	
	@Value("${zong_fei_12}")
	private  String gongFei12;
	@Value("${zong_fei_24}")
	private  String gongFei24;
	
	@Value("${jihu_12fei}")
	private  String jihu12fei;
	@Value("${jihu_24fei}")
	private  String jihu24fei;
	
	public void dealthAgentBusinessLog(short businessType,int businessPrice,int businessNum,int storeId,int userId){
		//agentBusinessLogService
		TUserInfoBean userInfo = userInfoBeanMapper.selectByPrimaryKey(userId);
		StoreInfoBean storeInfo = storeInfoBeanMapper.selectByPrimaryKey(storeId);
		if(businessType <=0){
			return;
		}
		if(businessNum <=0){
			return;
		}
		if(storeId <=0){
			return;
		}
		if(userId<=0){
			return;
		}
		TbStoreAgent storeAgent = null;
		TbAgentBusinessLog agentLog = new TbAgentBusinessLog();
		agentLog.setUserid(Long.valueOf(userId+""));
		agentLog.setUsername(userInfo.getUserName());
		agentLog.setUserrole(Byte.valueOf(userInfo.getUserRole()+""));
		
		agentLog.setMobile(userInfo.getUserCode());
		agentLog.setStoreid(Long.valueOf(storeId+""));
		agentLog.setStorename(storeInfo.getStoreName());
		agentLog.setBusinesstype(businessType);
		if(businessType == 301){
			agentLog.setBusinesstypename("微众银行");
		}else{
			agentLog.setBusinesstypename("花呗分期");
			
		}
		agentLog.setBusinessprice(businessPrice);
		agentLog.setBusinessnum(businessNum);
		agentLog.setProvinceid(storeInfo.getProvinceId().longValue());
		agentLog.setProvincename(storeInfo.getProvinceName());
		agentLog.setCityid(storeInfo.getCityId().longValue());
		agentLog.setCityname(storeInfo.getCityName());
		agentLog.setCountyid(storeInfo.getAreaId().longValue());
		agentLog.setCountyname(storeInfo.getAreaName());
		agentLog.setCreatetime(new Date());
		//查询代理商信息
		Byte s = 1;
		Byte sta = 0;
		
		TbStoreAgentExample agentExample = new TbStoreAgentExample();
		agentExample.createCriteria().andCityidEqualTo(storeInfo.getCityId().longValue()).andAgenttypeEqualTo(s).andStatusEqualTo(sta);
		List<TbStoreAgent> list = storeAgentMapper.selectByExample(agentExample);
		if(list != null && list.size() > 0){
		storeAgent = list.get(0);
		
		if(storeAgent != null){
			
			s = 2;
			TbStoreAgentExample agentE = new TbStoreAgentExample();
			agentE.createCriteria().andAreaidEqualTo(storeInfo.getAreaId().longValue()).andAgenttypeEqualTo(s).andStatusEqualTo(sta);
			List<TbStoreAgent> list1 = storeAgentMapper.selectByExample(agentE);
			if(list1 != null && list1.size() > 0){
			TbStoreAgent countyAgent = list1.get(0);
			if(countyAgent != null){
				agentLog.setAgentid(countyAgent.getId());
				agentLog.setAgentpid(storeAgent.getId());
				agentLog.setAgentname(countyAgent.getAgentname());
				agentLog.setAgentmobile(countyAgent.getMobile());
			}
		}else{
			agentLog.setAgentname(storeAgent.getAgentname());
			agentLog.setAgentmobile(storeAgent.getMobile());//代理商手机号
			agentLog.setAgentid(storeAgent.getId());
		}
		}
		}
		agentBusinessLogMapper.insertSelective(agentLog);
    }
    public void setList(List<StagesRes> stages,String totalAmount){
    	StagesRes stage = null;
    	int[] arr = {3,6,12,24};
    	for (int i : arr) {
    		stage =  new StagesRes();
    		stage.setId(i);
    		if(i == 3 || i == 6){
    		  stage.setAlifenqi(getfeilv(totalAmount, i,1));//花呗总手续费
    		  stage.setFenqi("0");//机呼手续费
    		  stage.setPrinAndFee(getfeilv(totalAmount, i,2));//每期
    		  stage.setZonghe(totalAmount);//实付
    		}else{
    			stage.setAlifenqi(getfeilv(getZongHe(totalAmount,i), i,1));//花呗总手续费
    			stage.setFenqi(getFenqi(totalAmount,i));//机呼总手续费
    			stage.setPrinAndFee(getfeilv(getZongHe(totalAmount,i), i,2));//每期
    			stage.setZonghe(getZongHe(totalAmount,i));//实付
    		}
    		stages.add(stage);
		}
    }
	public   String  getfeilv(String total,Integer fqNum,Integer type) {
		    double  fei = 0;
		    switch (fqNum) {
				case 3:
					fei = Double.valueOf(aliPay3fei);
					break;
				case 6:
					fei = Double.valueOf(aliPay6fei);
					break;
				case 12:
					fei = Double.valueOf(aliPay12fei);
					break;
				case 24:
					fei = Double.valueOf(aliPay24fei);
					break;
				default:
					break;
			}
		    
		    BigDecimal dtotal = new BigDecimal(total);
		    
			BigDecimal dtotal1 = BigDecimal.valueOf(100).multiply(dtotal);
			
			long longValue = dtotal1.longValue();
			
			BigDecimal eachPrin = BigDecimal.valueOf(longValue).divide(new BigDecimal(fqNum), BigDecimal.ROUND_DOWN);
			
			 BigDecimal totalFeeInDecimal = BigDecimal.valueOf(longValue).multiply(new BigDecimal(fei));
			    
			    
			    long totalFeeInLong = totalFeeInDecimal.setScale(0, BigDecimal.ROUND_HALF_EVEN).longValue();//总费用
			    
			     BigDecimal eachFee = BigDecimal.valueOf(totalFeeInLong).divide(new BigDecimal(fqNum), BigDecimal.ROUND_DOWN);
			    
			     BigDecimal add = eachPrin.add(eachFee);//每期总费用(本金+手续费)
			    if(type == 1){//fen
				
				 BigDecimal fen = new BigDecimal(totalFeeInLong).divide(new BigDecimal(100),2,BigDecimal.ROUND_DOWN);//手续费
				 return fen.toString();
				
			    }else if(type == 2){//每期费用
				 BigDecimal fenqi = add.divide(new BigDecimal(100),2,BigDecimal.ROUND_DOWN);//分期费用  33.93/期
				 return fenqi.toString();
				
			    }else if(type == 3){
				//总费用
				 BigDecimal zong =  new BigDecimal(totalFeeInLong+longValue).divide(new BigDecimal(100),2,BigDecimal.ROUND_DOWN);//顾客实付费用
				 return zong.toString();
			    }
			    return "0";
	 }
	
	
	
	 //通过实付金额算出分账金额(只有12 ,24期)null
     public String getAmo(String funNum,String amount, String outTradeNo){//总金额
    	 LOGGER.info("-----------------------------antcredit/分账期数="+funNum+"总金额:"+amount);
		if(StringUtils.isBlank(funNum)){
			    	return "0";
		}
		  //医美分账
		  double  fei = 0;
		  if(outTradeNo.startsWith("y", 0)){
			  
			switch (funNum) {
			    
			    case "3":
					    fei = Double.valueOf(yimeiFei3);
					    break;
				case "6":
						fei = Double.valueOf(yimeiFei6);
						break;
				case "12":
						fei = Double.valueOf(yimeiFei12);
						break;
				case "24":
						fei = Double.valueOf(yimeiFei24);
						break;
				default:
						break;
				}
			  
		    }else{
		    	if(funNum.equals("12")){
		    		
		    		fei = Double.valueOf(daliFei12);
		    	}
                if(funNum.equals("24")){
		    		
		    		fei = Double.valueOf(daliFei24);
		    	}
		    }
				
		
			try {
				
					BigDecimal decimal = new BigDecimal(fei);
					BigDecimal decimal2 = new BigDecimal(amount);
					BigDecimal amo = decimal2.multiply(decimal);
					 //#.00 表示两位小数 #.0000四位小数  
					amo.setScale(2, BigDecimal.ROUND_UP);
				    DecimalFormat df2 =new DecimalFormat("0.00");  
				    String str2 =df2.format(amo);  
				    LOGGER.info("-----------------------------antcredit/分账金额="+str2);
					return str2;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "0";
		}
		public String getOutOrder(){
			String out = rStoreOrderLog.increment(new Date().getTime())+"";
			String outTradeNo = "";
			if(StringUtils.isNotBlank(out)){
				
				if(out.indexOf("-") != -1){
					
					outTradeNo = out.substring(5);
				}else{
					outTradeNo = out;
				}
			}
			return outTradeNo;
		}
	
	public String getZongHe(String total,Integer fqNum){
		
		
		double  fei = 0;
	    switch (fqNum) {
		
			case 12:
				fei = Double.valueOf(jihu12fei);
				break;
			case 24:
				fei = Double.valueOf(jihu24fei);
				break;
			default:
				break;
		}
		BigDecimal dtotal = new BigDecimal(total);
	    
		BigDecimal dtotal1 = BigDecimal.valueOf(100).multiply(dtotal);
		
		long longValue = dtotal1.longValue();
		
		
		BigDecimal totalFeeInDecimal = BigDecimal.valueOf(longValue).multiply(new BigDecimal(fei));
		    
		    
		long totalFeeInLong = totalFeeInDecimal.setScale(0, BigDecimal.ROUND_HALF_EVEN).longValue();//总费用
		    
		    
		
	    //总费用
	    BigDecimal zong =  new BigDecimal(totalFeeInLong+longValue).divide(new BigDecimal(100),2,BigDecimal.ROUND_DOWN);//顾客实付费用
		
	    return zong.toString();
	}
	public String getFenqi(String total,Integer fqNum){
		
		
		double  fei = 0;
		switch (fqNum) {
		
			case 12:
				fei = Double.valueOf(jihu12fei);
				break;
			case 24:
				fei = Double.valueOf(jihu24fei);
				break;
			default:
				break;
		
		}
		  BigDecimal dtotal = new BigDecimal(total);
		    
			BigDecimal dtotal1 = BigDecimal.valueOf(100).multiply(dtotal);
			
			long longValue = dtotal1.longValue();
			
			
			 BigDecimal totalFeeInDecimal = BigDecimal.valueOf(longValue).multiply(new BigDecimal(fei));
			    
			    
			    long totalFeeInLong = totalFeeInDecimal.setScale(0, BigDecimal.ROUND_HALF_EVEN).longValue();//总费用
			    
			    
				
				BigDecimal fen = new BigDecimal(totalFeeInLong).divide(new BigDecimal(100),2,BigDecimal.ROUND_DOWN);//手续费
				return fen.toString();
	}
	
}
