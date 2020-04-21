package com.yqbing.servicebing.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.*;
import com.yqbing.servicebing.repository.database.dao.StoreMachineNumberMapper;
import com.yqbing.servicebing.repository.database.dao.TicketUserOrderMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.ILotteryTicketService;
import com.yqbing.servicebing.utils.*;
import com.yqbing.servicebing.utils.ticket.regopimc.ThirdLotteryTicketRequestUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("lotteryTicketService")
@SuppressWarnings("all")
public class LotteryTicketServiceImpl  extends CommonService implements ILotteryTicketService {

    private static final Logger log = LoggerFactory.getLogger(LotteryTicketServiceImpl.class);

    @Resource
    private StoreMachineNumberMapper storeMachineNumberMapper;

    @Resource
    private TicketUserOrderMapper ticketUserOrderMapper;


    @Value("${lottery_ticket.third.regopimc.query_lottery_info.url}")
    public String regopimcQueryLotteryInfoUrl;

    @Value("${lottery_ticket.third.regopimc.build_order.url}")
    public String regopimcBuildOrderUrl;

    @Value("${lottery_ticket.third.regopimc.pay_result.url}")
    public String regopimcPayResultUrl;

    /**
     * 根据设备号查询彩票信息
     * @param deviceNo
     * @return
     */
    @Override
    public String queryLotteryTicketNameByDevice(String deviceNo){
        StringBuilder result = new StringBuilder();
        try {
            StoreMachineNumber storeMachineNumber = storeMachineNumberMapper.queryStoreMachineNumberByDevice(deviceNo);
            if(null != storeMachineNumber){
                result.append("deviceNo="+storeMachineNumber.getMachineNumber());
                result.append("&storeId="+storeMachineNumber.getStoreId());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    /**
     * 根据设备号查询彩票详情
     * @param deviceNo
     * @return
     */
    @Override
    public String queryLotteryTicketInfoByDevice(String deviceNo){
        try {
            String resultThirdLotteryTicket = ThirdLotteryTicketRequestUtil.getLotteryTicketInfo(regopimcQueryLotteryInfoUrl,deviceNo);
            JSONObject thirdLotteryTicketJSONObject = JSON.parseObject(resultThirdLotteryTicket);
            if(null != thirdLotteryTicketJSONObject){
                return NotifyUtil.success(thirdLotteryTicketJSONObject.getJSONObject("body"));
            } else {
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_QUERY_INFO_ERROR);
            }
        } catch (Exception e){
            e.printStackTrace();
            return NotifyUtil.error(ErrorCodeEnum.SYSTEMERROR);
        }
    }

    /**
     * 根据设备号下单
     * @param deviceNo
     * @return
     */
    @Override
    public String buildOrder(String deviceNo, String openId, String lotteryNum){
        try {
            StoreMachineNumber storeMachineNumber = storeMachineNumberMapper.queryStoreMachineNumberByDevice(deviceNo);
            if(null == storeMachineNumber || storeMachineNumber.getStoreId() <= 0){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_DEVICE_BINDING_ERROR);
            }
            String lotteryTicketInfo = ThirdLotteryTicketRequestUtil.getLotteryTicketInfo(regopimcQueryLotteryInfoUrl,deviceNo);

            JSONObject lotteryTicketJSONObject = JSON.parseObject(lotteryTicketInfo);
            if(null == lotteryTicketJSONObject){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_QUERY_INFO_ERROR);
            }

            JSONObject headJSONObject = lotteryTicketJSONObject.getJSONObject("head");
            if(!headJSONObject.getString("hostCode").equals("0000")){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_QUERY_INFO_ERROR);
            }

            JSONObject bodyJSONObject = lotteryTicketJSONObject.getJSONObject("body");

            String priceStr = bodyJSONObject.getString("price");
            BigDecimal priceBig = new BigDecimal(priceStr);
            BigDecimal standbyTicketBig = new BigDecimal(lotteryNum);
            BigDecimal totalPrice = priceBig.multiply(standbyTicketBig);

            TicketUserOrder ticketUserOrder = new TicketUserOrder();
            String orderNo = "regopimc"+RandomUtils.getRandomNumDay();
            ticketUserOrder.setOrderNo(orderNo);
            ticketUserOrder.setOpenId(openId);
            ticketUserOrder.setDeviceNo(deviceNo);
            ticketUserOrder.setStoreId(String.valueOf(storeMachineNumber.getStoreId()));
            ticketUserOrder.setPrice(priceBig.longValue());
            ticketUserOrder.setAmount(totalPrice.longValue());
            ticketUserOrder.setGoogsNum(standbyTicketBig.intValue());
            ticketUserOrder.setOrderTime(LocalDateTimeUtil.localDateTimeToDate(LocalDateTime.now()));
            ticketUserOrder.setPayType(2L);
            ticketUserOrder.setPlatform("ticket");
            ticketUserOrder.setChannel("ticket_user");
            int result = ticketUserOrderMapper.insert(ticketUserOrder);
            if(result > 0){
                return NotifyUtil.success(orderNo);
            } else {
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_BUILD_ORDER_ERROR);
            }
        } catch (Exception e){
            e.printStackTrace();
            return NotifyUtil.error(ErrorCodeEnum.ERRORCODE);
        }
    }

    /**
     * 根据订单编号查询订单详情
     * @param orderNo
     * @return
     */
    @Override
    public String getOrderInfo(String orderNo){
        TicketUserOrder ticketUserOrder = ticketUserOrderMapper.getTicketUserOrderByOrderON(orderNo);
        return NotifyUtil.success(ticketUserOrder.getAmount());
    }

    /**
     * 打印彩票
     * @param device
     * @param openId
     * @param orderNo
     * @return
     */
    @Override
    public String printTicket(String deviceNo, String openId, String orderNo){
        try {
            // 验证订单信息
            TicketUserOrder ticketUserOrder = ticketUserOrderMapper.getTicketUserOrderByOrderON(orderNo);
            if(null == ticketUserOrder || ticketUserOrder.getId() <=0){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_DEVICE_BINDING_ERROR);
            }

            // 验证设备和门店绑定关系
            StoreMachineNumber storeMachineNumber = storeMachineNumberMapper.queryStoreMachineNumberByDevice(deviceNo);
            if(null == storeMachineNumber || storeMachineNumber.getStoreId() <= 0){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_DEVICE_BINDING_ERROR);
            }

            // 验证设备是否正常
            String lotteryTicketInfo = ThirdLotteryTicketRequestUtil.getLotteryTicketInfo(regopimcQueryLotteryInfoUrl,deviceNo);

            JSONObject lotteryTicketJSONObject = JSON.parseObject(lotteryTicketInfo);
            if(null == lotteryTicketJSONObject){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_QUERY_INFO_ERROR);
            }

            JSONObject headJSONObject = lotteryTicketJSONObject.getJSONObject("head");
            if(!headJSONObject.getString("hostCode").equals("0000")){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_QUERY_INFO_ERROR);
            }

            // 分佣


            // 提交第三方彩票订单
            Map<String,Object> lotteryTicketMap = lotteryTicketJSONObject.getJSONObject("body");
            lotteryTicketMap.put("deviceNo",deviceNo);
            lotteryTicketMap.put("standbyTicket",ticketUserOrder.getGoogsNum());
            String orderResponse = ThirdLotteryTicketRequestUtil.buildOrder(regopimcBuildOrderUrl,lotteryTicketMap);
            JSONObject orderInfoJSONObject = JSON.parseObject(orderResponse);
            JSONObject orderHeadJSONObject = orderInfoJSONObject.getJSONObject("head");
            if(!orderHeadJSONObject.getString("hostCode").equals("0000")){
                return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_THIRD_BUILD_ORDER_ERROR);
            }
            JSONObject orderResponseJSONObject = orderInfoJSONObject.getJSONObject("body");
            String thridOrderNo = orderResponseJSONObject.getString("orderNo");

            // 第三方支付通知
            String payResultResponse = ThirdLotteryTicketRequestUtil.payResult(regopimcPayResultUrl,thridOrderNo,ticketUserOrder.getAmount());

            return NotifyUtil.success();
        } catch (Exception e){
            e.printStackTrace();
            return NotifyUtil.error(ErrorCodeEnum.ERRORCODE);
        }
    }



}
