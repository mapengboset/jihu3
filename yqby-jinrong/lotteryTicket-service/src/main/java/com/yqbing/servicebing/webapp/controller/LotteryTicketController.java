package com.yqbing.servicebing.webapp.controller;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.service.ILotteryTicketService;
import com.yqbing.servicebing.service.impl.LotteryTicketServiceImpl;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.utils.StringUtil;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(tags = "彩票")
@SuppressWarnings("all")
@RequestMapping("/lottery")
public class LotteryTicketController {

    private static final Logger log = LoggerFactory.getLogger(LotteryTicketController.class);

    @Resource
    private ILotteryTicketService lotteryTicketService;

    /**
     * 跳转到彩票首页
     * @param response
     * @param device
     * @param channel
     * @throws Exception
     */
    @GetMapping("/ticket/index")
    void toLotteryIndex(HttpServletResponse response,String deviceNo,String channel) throws Exception{
        StringBuilder resultLotteryHtml = new StringBuilder("http://jinrongt.jihustore.com/yqbing-payment/weixin/pay/oauth?appChanl=91&url=");
        if(StringUtil.isEmpty(deviceNo)){
            resultLotteryHtml.append("设备号为空");
        }
        if(StringUtil.isEmpty(channel)){
            resultLotteryHtml.append("渠道ID为空");
        }
        String result = lotteryTicketService.queryLotteryTicketNameByDevice(deviceNo);
        if(StringUtil.isNotEmpty(result)){
            StringBuilder resultStr = new StringBuilder("http://jhtest.yqbing.com/page/mobilePage/html/lottery/lotteryBuy.html?"+result);
            String callback = StringUtil.stringToUnicode(resultStr.toString());
            //resultLotteryHtml.append(callback);
            resultLotteryHtml.append(resultStr);
            String str = StringUtil.unicodeToString(callback);
            log.info(str);
        }
        response.sendRedirect(resultLotteryHtml.toString());
    }

    /**
     * 查询彩票详情
     * @param device
     * @return
     */
    @GetMapping("/ticket/info")
    @CrossOrigin
    String lotteryTicketInfo(String deviceNo){
        if(StringUtil.isEmpty(deviceNo)){
            return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_DEVICE_NULL_ERROR);
        }
        return lotteryTicketService.queryLotteryTicketInfoByDevice(deviceNo);
    }

    /**
     * 彩票下单
     * @param device
     * @return
     */
    @GetMapping("/ticket/build/order")
    @CrossOrigin
    String buildOrder(String deviceNo, String openId, String lotteryNum){
        if(StringUtil.isEmpty(deviceNo)){
            return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_DEVICE_NULL_ERROR);
        }
        if(StringUtil.isEmpty(openId)){
            return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_OPENID_NULL_ERROR);
        }
        return lotteryTicketService.buildOrder(deviceNo, openId, lotteryNum);
    }

    /**
     * 查询订单详情
     * @param orderNo
     * @return
     */
    @GetMapping("/ticket/orderInfo")
    String getOrderInfoByOrderNo(String orderNo){
        if(StringUtil.isEmpty(orderNo)){
            return NotifyUtil.error(ErrorCodeEnum.LOTTERY_TICKET_ORDER_NO_ERROR);
        }
        return lotteryTicketService.getOrderInfo(orderNo);
    }

    /**
     * 打印彩票
     * @param device
     * @param openId
     * @param orderNo
     * @return
     */
    @GetMapping("/ticket/printTicket")
    @CrossOrigin
    String printTicket(String deviceNo, String openId, String orderNo){
        return lotteryTicketService.printTicket(deviceNo, openId, orderNo);
    }
}
