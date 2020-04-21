package com.yqbing.servicebing.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeCloseResponse;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.google.gson.Gson;
import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.abstracts.StoreOrderBeanExample;
import com.yqbing.servicebing.repository.database.abstracts.ZanclickLogBeanExample;
import com.yqbing.servicebing.repository.database.bean.StoreInfoBean;
import com.yqbing.servicebing.repository.database.bean.StoreOrderBean;
import com.yqbing.servicebing.repository.database.bean.StoreUserBean;
import com.yqbing.servicebing.repository.database.bean.ZanclickLogBean;
import com.yqbing.servicebing.repository.database.dao.StoreInfoBeanMapper;
import com.yqbing.servicebing.repository.database.dao.StoreOrderBeanMapper;
import com.yqbing.servicebing.repository.database.dao.ZanclickLogBeanMapper;
import com.yqbing.servicebing.repository.redis.RAntClickDatailLog;
import com.yqbing.servicebing.repository.redis.RStoreOrderLog;
import com.yqbing.servicebing.service.YiMeiPayService;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.webapp.response.StagesListRes;
import com.yqbing.servicebing.webapp.response.StagesRes;


@Service("yiMeiPayService")
@SuppressWarnings("all")
public class YiMeiPayServiceImpl implements YiMeiPayService{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(YiMeiPayServiceImpl.class);
	@Autowired
	private ZanclickLogBeanMapper zanclickLogBeanMapper = null;
	@Autowired
	private RStoreOrderLog rStoreOrderLog = null;
	@Autowired
	private RAntClickDatailLog rAntClickDatailLog = null;
	@Autowired
	private StoreOrderBeanMapper storeOrderBeanMapper = null;
	@Autowired
	private StoreInfoBeanMapper storeInfoBeanMapper = null;
	@Value("${ali_pid}")
	private  String aliPid;
	@Value("${your_Private}")
	private  String your_Private;
	@Value("${alipay_public_key}")
	private  String alipayPublicKey;
	@Value("${yimei_userId}")
	private  String yimeiUserId;
	@Value("${ant_https}")
	private  String ant_https;
	@Value("${aliPay_3fei}")
	private  String aliPay3fei;
	@Value("${aliPay_6fei}")
	private  String aliPay6fei;
	@Value("${aliPay_12fei}")
	private  String aliPay12fei;
	@Value("${aliPay_24fei}")
	private  String aliPay24fei;
	
	@Value("${yimei_fei_3}")
	private  String yimeifei3;
	@Value("${yimei_fei_6}")
	private  String yimeifei6;
	@Value("${yimei_fei_12}")
	private  String yimeifei12;
	@Value("${yimei_fei_24}")
	private  String yimeifei24;
	
	@Value("${jihu_12fei}")
	private  String jihu12fei;
	@Value("${jihu_24fei}")
	private  String jihu24fei;
	
	@Value("${seller_no}")
	private  String sellerNO;
	@Value("${merchant_id}")
	private  String merchantId;
	@Value("${store_id}")
	private  String storeId;
	
	@Override
	public String preparePay(String totalAmount) {
		StagesListRes res = null;
	    try {
	    	
	    	//-----------------生成订单号
	    	res = new StagesListRes();
			String outTradeNo = getOutOrder();
			//返回商家名字
			String body= "医美收款";
			String payType= "1";
			Double s = 0.00;
			//-----------计算分期数-----------------------------3期  6期  12期 24 金额+手续费   = 总费用
			List<StagesRes> stages = new ArrayList<StagesRes>();
			if(StringUtils.isNotBlank(totalAmount)){
				try {
					
					Double  parseDouble = Double.parseDouble(totalAmount);
					s = parseDouble*100;
					//if(parseDouble >= 100){
					setList(stages, totalAmount);
				} catch (Exception e) {
					  return  NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"金额有误");
				}
				//}
			res.setOut_trade_no(outTradeNo);
			res.setStages(stages);
			res.setTotalAmount(totalAmount);
			res.setTrade_no_content(body);
			
			ZanclickLogBean zanclickLogBean = new ZanclickLogBean();
			zanclickLogBean.setUserId(Integer.valueOf(yimeiUserId));
			zanclickLogBean.setOutTradeNo(outTradeNo);
			zanclickLogBean.setTotalAmount(s.intValue());
			zanclickLogBean.setGmtCreate(new Date());
			
			StoreInfoBean infoBean = storeInfoBeanMapper.selectByPrimaryKey(Integer.valueOf(storeId));
			
			zanclickLogBean.setStoreName(infoBean.getStoreName());
			zanclickLogBeanMapper.insertSelective(zanclickLogBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return NotifyUtil.success(res);
	}

	
	public void setList(List<StagesRes> stages,String totalAmount){
    	StagesRes stage = null;
    	int[] arr = {3,6,12,24};
    	for (int i : arr) {
    		stage =  new StagesRes();
    		stage.setId(i);
    			stage.setAlifenqi(getfeilv(getZongHe(totalAmount,i), i,1));//花呗总手续费
    			stage.setFenqi(getFenqi(totalAmount,i));//机总手续费
    			stage.setPrinAndFee(getfeilv(getZongHe(totalAmount,i), i,2));//每期
    			stage.setZonghe(getZongHe(totalAmount,i));//实付
    		
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
	
public String getZongHe(String total,Integer fqNum){
		
		
		double  fei = 0;
	    switch (fqNum) {
	    case 3:
			fei = Double.valueOf(yimeifei3);
			break;
		case 6:
				fei = Double.valueOf(yimeifei6);
				break;
			case 12:
				fei = Double.valueOf(yimeifei12);
				break;
			case 24:
				fei = Double.valueOf(yimeifei24);
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
		case 3:
			    fei = Double.valueOf(yimeifei3);
			    break;
		case 6:
				fei = Double.valueOf(yimeifei6);
				break;
		case 12:
			    fei = Double.valueOf(yimeifei12);
			    break;
		case 24:
			    fei = Double.valueOf(yimeifei24);
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
	public String getOutOrder(){
		
		String out = rStoreOrderLog.incrementyimei(new Date().getTime())+"";
		return out;
	}


	
	
	
	@Override
	public String qrCode(String outTradeNo, String fqNum, String type) {
		String success = StringUtils.EMPTY;
		ZanclickLogBean logBean = null;
		ZanclickLogBeanExample zanclickLogBeanExample = new ZanclickLogBeanExample();
		zanclickLogBeanExample.createCriteria().andOutTradeNoEqualTo(outTradeNo);
		List<ZanclickLogBean> list1 = zanclickLogBeanMapper.selectByExample(zanclickLogBeanExample);
		if(null == list1 || list1.size() == 0){
			
			   return  NotifyUtil.error(ErrorCodeEnum.DISACCORD,"商家不存在");
		}
	    if(StringUtils.isBlank(fqNum)){
	    	 return  NotifyUtil.error(ErrorCodeEnum.DISACCORD,"分期数不存在");
	    }
	    ZanclickLogBean bean = list1.get(0);
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
		AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
		BigDecimal totPirce =BigDecimal.valueOf(bean.getTotalAmount()).divide(new BigDecimal(100));
		//支付宝
		/*	request.setNotifyUrl(ant_https+"/antcredit/NewnotifyOrderNo");
			LOGGER.info("-------------------------------------走支付宝+");
			    request.setBizContent("{" +
					"\"out_trade_no\":\""+outTradeNo+"\"," +
					"\"scene\":\"bar_code\"," +
					"\"timeout_express\":\"2m\"," +
					"\"product_code\":\"FACE_TO_FACE_PAYMENT\"," +
					"\"auth_code\":\""+authCode+"\"," +
					"\"sys_service_provider_id\":\"2088421473041853\"," +
					"\"subject\":\""+orderBean.getStoreName()+"收款\"," +
					"\"total_amount\":\""+totPirce+"\"," +
					"\"trans_currency\":\"CNY\"," +
					"\"sub_merchant\":{" +
					"\"merchant_id\":\""+orderBean.getMerchantId()+"\"" +
					"}," +
					"\"settle_info\": {"+
			    	"\"settle_detail_infos\": ["+
			               "{" +
			                    "\"amount\":\""+totPirce+"\","+ 
			                    "\"trans_in_type\": \"loginName\","+ 
			                    "\"trans_in\": \""+orderBean.getSellerNo()+"\"" +
			                "}"+
			            "]"+
			        "}" +
					"}");*/
		String zongHe = getZongHe(totPirce+"", Integer.valueOf(fqNum));
		if("1".equals(type)){
			    request.setNotifyUrl(ant_https+"/antcredit/NewnotifyOrderNo?funNum="+fqNum);
			    LOGGER.info("-------------------------------------走花呗分期+");
				request.setBizContent("{" +
				"\"out_trade_no\":\""+outTradeNo+"\"," +
                "\"sub_merchant\": {"+
		            "\"merchant_id\": \""+merchantId+"\""+
		        "},"+
				"\"timeout_express\":\"2m\"," +
				"\"total_amount\":\""+zongHe+"\"," +
				"\"subject\":\"医美收款\"," +
				"\"trans_currency\":\"CNY\"," +
				"\"body\":\"商户收款\"," +
				"\"enable_pay_channels\":\"pcreditpayInstallment\"," +
				"\"qr_code_timeout_express\":\"2m\"," +
				"\"extend_params\":{" +
				"\"hb_fq_num\":\""+fqNum+"\"," +
				"\"hb_fq_seller_percent\":\"0\"" +
				"}," +
				
				"\"settle_info\": {"+
		    	"\"settle_detail_infos\": ["+
		               "{" +
		                    "\"amount\":\""+zongHe+"\","+ 
		                    "\"trans_in_type\": \"loginName\","+ 
		                    "\"trans_in\": \""+sellerNO+"\"" +
		                "}"+
		            "]"+
		        "}" +
				"}");
		}
		
		
		AlipayTradePrecreateResponse  response = null;
		try {
			response = alipayClient.execute(request);
		
		    if(response.isSuccess()){
			
			LOGGER.info("-----------------------------yimeipay/backPay:SubMsg"+response.getSubMsg()+"&MSG:"+response.getMsg());
			if(response.getCode().equals("10000")){
				Map<String, Object> ma = new HashMap<String, Object>();
				ma.put("qrCode", response.getQrCode());
				
				rAntClickDatailLog.setQrCode(outTradeNo, response.getQrCode());
				bean.setFqNum(Integer.valueOf(fqNum));
				Double  parseDouble = Double.parseDouble(zongHe);
				Double s = parseDouble*100;
				bean.setBuyerPayAmount(s.intValue());
				bean.setStoreId(Integer.valueOf(storeId));
				zanclickLogBeanMapper.updateByPrimaryKey(bean);
				
				success= NotifyUtil.success(ma);
		    }else{
				success= NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, response.getSubMsg());
			}
			
		
		    String outTradeNo2 = response.getOutTradeNo();
		
		LOGGER.info("-----------------------------yimeipay/backPay.getOut_trade_no="+outTradeNo2);
		LOGGER.info("-----------------------------yimeipay/backPay list"+new Gson().toJson(list1));
		}else{
			success= NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, response.getSubMsg());
		}
		} catch (AlipayApiException e) {
			 e.printStackTrace();
			 return NotifyUtil.error(ErrorCodeEnum.ALIPAY_FAIL, "付款失败");
		}
		
		
		return success;
	}


	@Override
	public String queryPay(String outTradeNo) {
		// TODO Auto-generated method stub
		String success = StringUtils.EMPTY;
		ZanclickLogBean logBean = null;
		ZanclickLogBeanExample zanclickLogBeanExample = new ZanclickLogBeanExample();
		zanclickLogBeanExample.createCriteria().andOutTradeNoEqualTo(outTradeNo);
		List<ZanclickLogBean> list = zanclickLogBeanMapper.selectByExample(zanclickLogBeanExample);
		/**
		 *  交易目前所处的状态,
		 *  WAIT_BUYER_PAY 交易创建，等待买家付款
		 *  TRADE_CLOSED 未付款交易超时关闭，或支付完成后全额退款
		 *  TRADE_SUCCESS 交易支付成功
		 *  TRADE_FINISHED 交易结束，不可退款
		 */
		if(null == list || list.size() == 0){
		   return success = NotifyUtil.error(ErrorCodeEnum.OPERATERROE, "订单不存在");
		}
		logBean = list.get(0);
			AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
			AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
			request.setBizContent("{" +
					"\"out_trade_no\":\""+logBean.getOutTradeNo()+"\"" +
					"  }");
			AlipayTradeQueryResponse  response = null;
					try {
						response = alipayClient.execute(request);
						String qrcode = rAntClickDatailLog.getQrCode(logBean.getOutTradeNo());
						if(qrcode == null){
							return NotifyUtil.error(ErrorCodeEnum.ALIPAY_CLOSED, "交易关闭");
						}
						if(!response.isSuccess()){
							return NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, "等待扫码");
						}
							if(response.getCode().equals("40004")){
								return NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, "等待扫码");
							}
								
								LOGGER.info("-----------------------------yimeipay/queryPay---------------------交易查询支付宝"+response.getCode());
						        String tradeNo = response.getTradeNo();
								String outTradeNo2 = response.getOutTradeNo();
								String buyerLogonId = response.getBuyerLogonId();
								String totalAmount = response.getTotalAmount();
								String receiptAmount = response.getReceiptAmount();
								List<TradeFundBill> fundBillList = response.getFundBillList();
								String tradeStatus = response.getTradeStatus();
								String buyerUserId = response.getBuyerUserId();
								String storeName = response.getStoreName();
								LOGGER.info("--------------交易收款的商家:"+storeName);
								String invoiceAmount = response.getInvoiceAmount();
								String buyerPayAmount = response.getBuyerPayAmount();
								LOGGER.info("-----------------------------交易查询yimeipay/queryPay.getOut_trade_no="+outTradeNo2+"tradeStatus="+tradeStatus);
									int insertSelective = 0;
									logBean.setUserId(Integer.valueOf(yimeiUserId));
									logBean.setStoreName(logBean.getStoreName());
									logBean.setStoreId(logBean.getStoreId());
									
									logBean.setNotifyTime(new Date());
									logBean.setTradeNo(tradeNo);
									logBean.setAliTradeNo(tradeNo);
									logBean.setAppId(aliPid);
									logBean.setOutTradeNo(outTradeNo2);
									logBean.setBuyerId(buyerUserId);
									logBean.setBuyerLogonId(buyerLogonId);
									if(!StringUtils.isBlank(receiptAmount)){//交易成功
											Double  parseDouble = Double.parseDouble(receiptAmount);
											Double s = parseDouble*100;
											logBean.setReceiptAmount(s.intValue());
									}
									if(StringUtils.isBlank(tradeStatus)){
										aliPayClosed(logBean);
										return  NotifyUtil.error(ErrorCodeEnum.ALIPAY_FAIL, "请等待客户扫码");
									}
									if(StringUtils.isNotBlank(invoiceAmount)){
										Double  parseDouble = Double.parseDouble(invoiceAmount);
										Double s = parseDouble*100;
										logBean.setInvoiceAmount(s.intValue()); 
									}
									if(StringUtils.isNotBlank(buyerPayAmount)){
										Double  parseDouble = Double.parseDouble(buyerPayAmount);
										Double s = parseDouble*100;
										logBean.setBuyerPayAmount(s.intValue());
									}
									if(tradeStatus.equals("WAIT_BUYER_PAY")){
								    	
										 
										success =  NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, "等待顾客付款");
										
									}else if(tradeStatus.equals("TRADE_CLOSED")){
										
										 success = NotifyUtil.error(ErrorCodeEnum.ALIPAY_CLOSED, "交易超时关闭,请从新输入金额");
									}else if(tradeStatus.equals("TRADE_SUCCESS") || tradeStatus.equals("TRADE_FINISHED")){
										logBean.setTradeStatus(tradeStatus);
										logBean.setFundBillList(new Gson().toJson(fundBillList));
										logBean.setGmtCreate(new Date());
										LOGGER.info("-----------------------------yimeipay/queryPay logBean"+logBean);
										//	rAntClickDatailLog.setlist(new Gson().toJson(logBean));
										insertSelective = zanclickLogBeanMapper.updateByPrimaryKey(logBean);
										success = NotifyUtil.success();
									}else{
										success =  NotifyUtil.error(ErrorCodeEnum.ALIPAY_INPROCESS, "等待顾客付款");
									}
								
								    return success;
						
					} catch (AlipayApiException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						aliPayClosed(logBean);
						return success = NotifyUtil.error(ErrorCodeEnum.ALIPAY_FAIL, "交易有误,请从新输入金额");
					}
					
		
	}
	
	//交易关闭页面
		public void  aliPayClosed(ZanclickLogBean logBean){
			AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",aliPid,your_Private,"json","UTF-8",alipayPublicKey,"RSA2");
			AlipayTradeCloseRequest  request = new AlipayTradeCloseRequest ();
			request.setBizContent("{" +
					"\"trade_no\":\""+logBean.getTradeNo()+"\"," +
					"\"out_trade_no\":\""+logBean.getOutTradeNo()+"\"" +
					"  }");
			AlipayTradeCloseResponse   response = null;
					
						try {
							response = alipayClient.execute(request);
							if(response.isSuccess()){
								if(response.getCode().equals("10000")){
									logBean.setTradeNo(response.getTradeNo());
									logBean.setTradeStatus("TRADE_CLOSED");
									zanclickLogBeanMapper.updateByPrimaryKey(logBean);
									}
								}
							
						} catch (AlipayApiException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
	
	
}
