package com.yqbing.servicebing.service;

public interface ILotteryTicketService {

    /**
     * 根据设备号查询彩票信息
     * @param deviceNo
     * @return
     */
    String queryLotteryTicketNameByDevice(String deviceNo);

    /**
     * 根据设备号查询彩票详情
     * @param deviceNo
     * @return
     */
    String queryLotteryTicketInfoByDevice(String deviceNo);

    /**
     * 根据设备号下单
     * @param deviceNo
     * @param openId
     * @param lotteryNum
     * @return
     */
    String buildOrder(String deviceNo, String openId, String lotteryNum);

    /**
     * 根据订单编号查询订单详情
     * @param orderNo
     * @return
     */
    String getOrderInfo(String orderNo);

    /**
     * 打印彩票
     * @param deviceNo
     * @param openId
     * @param orderNo
     * @return
     */
    String printTicket(String deviceNo, String openId, String orderNo);
}
