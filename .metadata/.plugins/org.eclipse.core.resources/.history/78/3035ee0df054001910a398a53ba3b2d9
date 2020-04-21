package com.yqbing.servicebing.utils;

import java.text.MessageFormat;

import org.apache.commons.lang.StringUtils;

public class PushContentUtil {

	private static String ACTIVITY_GET_WEALTH = "尊敬的小伙伴，您通过{0}活动获取了{1}点财富值。";
	
	private static String ACTIVITY_GET_WEALTH_STORE = "尊敬的掌柜，您成功邀请粉丝，获取{0}财富";
	
	private static String ACTIVITY_GET_WEALTH_STORE_BY_PLAN = "尊敬的掌柜，您的粉丝{0}完成任务，您获取{1}财富";
	
	private static String USER_JOIN_STORE_FOR_STORE = "恭喜您，{0}用户已加入您的{1}门店";
	
	private static String USER_JOIN_STORE_FOR_USER = "恭喜您，成功添加{0}门店";

	private static String ACTIVITY_CHECK_IN = "尊敬的小伙伴，您通过签到获取了{0}点财富值。";
	
	private static String ACTIVITY_GET_WEALTH_QUESTION = "尊敬的小伙伴，您通过答题获取了{0}点财富值";

	private static String ACTIVITY_DOWNLOAD_APP = "尊敬的小伙伴，您通过{0} APP获取了{1}点财富值";

	private static String ACTIVITY_STORE_REQUEST = "尊敬的掌柜，{0}通过扫描二维码/账号查找/ID/手机号查找成为您的店小二";

	private static String ACTIVITY_STORE_DELETE = "您已将{0}清除出门店，{0}不再是您的店小二。";

	private static String ACTIVITY_STORE_JOIN = "尊敬的小伙伴，您已成功成为{0}门店的店小二";

	private static String ACTIVITY_STORE_KICK = "您已被清除出{0}门店，不再是{0}门店的店小二。";

	private static String WEALTH_EXCHANGE_WEALTH = "尊敬的小伙伴，您发起了一笔提现，提现金额为{0}点财富值，将会获得现金{1}元";

	private static String WEALTH_EXCHANGE_SUCCESS = "尊敬的小伙伴，您的提现已经审批成功，提现金额为{0}点财富值，获得现金{1}元";

	private static String ACTIVITY_USER_SON = "恭喜小伙伴，{0}成为您的第{1}粉丝";

	private static String WEALTH_DOWNLOAD_APPS = "尊敬的小伙伴，您通过下载{0}应用获取 了{1}财富值";

	private static String WEALTH_NEW_FANS = "恭喜小伙伴，{0}成为您的第{1}个粉丝";

	private static String WEALTH_STORE_LOCK = "您所在店铺涉及违规操作现已冻结，请联系店主核实解决";

	private static String WEALTH_TIME_LIMIT = "提现失败，可提现时间为每日9:00-19:00";

	private static String WEALTH_FREE_PAL = "恭喜小伙伴，{0}成为您的第{1}粉丝。（成为店小二后，收粉丝可获得{2}财富。）";

	private static String WEALTH_MOBILE_IMEL = "尊敬的用户，您通过闪电换机获取{0}财富";
	private static String WEALTH_MOBILE_IMEL_ENCOURAGE = "【换机奖励】恭喜您，新用户前{0}次换机，机呼给您额外奖励，您本次换机额外获得{1}财富！";
	
	private static String WEALTH_MOBILE_IMEL_STORE = "尊敬的掌柜，店小二{0}完成闪电换机任务，您获取{1}财富";
	private static String WEALTH_MOBILE_IMEL_STORE_ENCOURAGE = "【换机奖励】尊敬的掌柜，店小二{0}完成闪电换机，机呼给您额外奖励，您本次换机额外获得{1}财富！";
	
	private static String WEALTH_MOBILE_GOLD = "尊敬的用户，您通过挖金矿获取{0}财富";
	
	private static String WEALTH_RECOMMEND_STORE = "尊敬的用户，您通过海报奖励获取{0}财富";
	private static String WEALTH_ELECTRONICCREDIT_STORE = "尊敬的掌柜，您门店的{0}成功办理电子信用卡您获取{1}财富";
	private static String WEALTH_360FINANCE_STORE = "尊敬的掌柜，您门店的{0}成功办理360金融业务您获取{1}财富";
	private static String RECOMMEND_STORE_REFUSE = "您推荐的门店由于{0}原因申请被拒，请核实提交信息";
	
	private static String STORE_REFUSE = "您提交的店铺申请被拒，请核实申请信息";
	private static String STORE_APPLY = "您已提交门店注册申请，预计审核时间为24小时，请耐心等待";
	private static String STORE_SUCCESS = "恭喜您，成功注册{0}，并成为门店掌柜";
	private static String DXR_REFUSE = "门店{0}未通过您加入门店的申请";
	private static String DXR_APPLY = "{0}申请成为您店铺的店小二，请及时审核信息";
	public static String getWealth(String activity, int wealth) {
		return MessageFormat.format(ACTIVITY_GET_WEALTH, activity, wealth);
	}

	public static String downApps(String activity, int wealth) {
		return MessageFormat.format(WEALTH_DOWNLOAD_APPS, activity, wealth);
	}

	public static String checkIn(int wealth) {
		return MessageFormat.format(ACTIVITY_CHECK_IN, wealth);
	}

	public static String downApp(String appName, int wealth) {
		return MessageFormat.format(ACTIVITY_DOWNLOAD_APP, appName, wealth);
	}

	public static String storeRequest(String userName) {
		return MessageFormat.format(ACTIVITY_STORE_REQUEST, userName);
	}

	public static String storeDelete(String userName) {
		return MessageFormat.format(ACTIVITY_STORE_DELETE, userName);
	}

	public static String storeJoin(String storeName) {
		return MessageFormat.format(ACTIVITY_STORE_JOIN, storeName);
	}

	public static String userSon(String userName, int wealth) {
		return MessageFormat.format(ACTIVITY_USER_SON, userName, wealth + "");
	}

	public static String storeKick(String storeName) {
		return MessageFormat.format(ACTIVITY_STORE_KICK, storeName);
	}

	public static String exchangeWealth(int wealth, int cash) {
		return MessageFormat.format(WEALTH_EXCHANGE_WEALTH, wealth, cash);
	}

	public static String exchangeSuccess(int wealth, int cash) {
		return MessageFormat.format(WEALTH_EXCHANGE_SUCCESS, wealth, cash);
	}

	public static String palSon(String userName, int count, int wealth) {
		return MessageFormat.format(WEALTH_FREE_PAL, userName, count, wealth);
	}
	
	public static String applyStoreSuccess(String storeName){
		return MessageFormat.format(STORE_SUCCESS, storeName);
	}
	
	public static String storeActiveWealth(String wealth){
		return MessageFormat.format(ACTIVITY_GET_WEALTH_STORE,wealth);
	}
	
	public static String userJoinStoreForStore(String userName,String storeName){
		return MessageFormat.format(USER_JOIN_STORE_FOR_STORE,userName,storeName);
	}
	
	public static String userJoinStoreForUser(String storeName){
		return MessageFormat.format(USER_JOIN_STORE_FOR_USER,storeName);
	}
	
	public static String storeUserFinishPlan(String userName,int wealth){
		return MessageFormat.format(ACTIVITY_GET_WEALTH_STORE_BY_PLAN,userName,wealth);
	}
	
	public static String userFinishAnswer(int wealth){
		return MessageFormat.format(ACTIVITY_GET_WEALTH_QUESTION,wealth);
	}
	
	public static String mobileImelGetWealth(int wealth){
		return MessageFormat.format(WEALTH_MOBILE_IMEL, wealth);
	}
	
	public static String mobileImelEncourageGetWealth(int encourageNum,int wealth){
		return MessageFormat.format(WEALTH_MOBILE_IMEL_ENCOURAGE,encourageNum,wealth);
	}
	
	public static String mobileImelForStoreWealth(String userName,int wealth){
		return MessageFormat.format(WEALTH_MOBILE_IMEL_STORE,userName,wealth);
	}
	
	public static String mobileImelEncourageForStoreWealth(String userName,int wealth){
		return MessageFormat.format(WEALTH_MOBILE_IMEL_STORE_ENCOURAGE, userName,wealth);
	}
	
	public static String mobileGoldGetWealth(int wealth){
		return MessageFormat.format(WEALTH_MOBILE_GOLD, wealth);
	}
	
	public static String recommendStoreGetWealth(int wealth){
		return MessageFormat.format(WEALTH_RECOMMEND_STORE, wealth);
	}
	
	public static String electronicCreditGetWealth(String userName,int wealth){
		return MessageFormat.format(WEALTH_ELECTRONICCREDIT_STORE,userName,wealth);
	}
	
	public static String financeChnnelGetWealth(String userName,int wealth){
		return MessageFormat.format(WEALTH_360FINANCE_STORE,userName,wealth);
	}
	
	public static String storeLock() {
		return WEALTH_STORE_LOCK;
	}

	public static String wealthLimit() {
		return WEALTH_TIME_LIMIT;
	}

	public static String storeRefuse() {
		return STORE_REFUSE;
	}
	
	public static String storeApply(){
		return STORE_APPLY;
	}
	
	public static String recommendStoreRefuse(String refuseReason){
		return MessageFormat.format(RECOMMEND_STORE_REFUSE, refuseReason);
	}
	public static String dxrRefuse(String storeName){
		return MessageFormat.format(DXR_REFUSE, storeName);
	}
	public static String dxrApply(String userName){
		return MessageFormat.format(DXR_APPLY, userName);
	}
	
	/**
	 * main函数.
	 * 
	 * @param args
	 *            启动参数
	 * @throws Exception
	 *             Exception
	 */
//	public static void main(String... args) throws Exception {
//		String aString = MessageFormat.format(ACTIVITY_GET_WEALTH, "新手任务", "10");
//
//		System.out.println(userSon("及时宝", 10));
//	}

	/**
	 * Method description
	 * 
	 * @param mapper
	 *            消息查询Dao
	 * @param pushKey
	 *            推送key
	 * @param userId
	 *            用户id
	 * @param type
	 *            类型:1.
	 * @param content
	 * @param title
	 * @return
	 */
	public static boolean pushContent(int appChannel,String pushKey,String content, String title) {
		boolean bool = false;
		try {
//			UserMessage userMessage = new UserMessage();
//			userMessage.setUserId(userId);
//			userMessage.setMessageTitle(title);
//			userMessage.setMessageType(type);
//			userMessage.setMessageText(content);
//			userMessage.setCreateTime(DateUtil.getIntStampTime());
//			userMessage.setMessageState((short) 1);
//			userMessage.setPushKey(pushKey);
			if (!StringUtils.isEmpty(pushKey)) {
				if(appChannel == 1){
					JiHupushClientUtil.sendToRegistrationId(pushKey, content, title, content, null);
				}else if(appChannel == 2){
					JiHuStorepushClientUtil.sendToRegistrationId(pushKey, content, title, content, null);
				}
//				if (JiHupushClientUtil.sendToRegistrationId(pushKey, appChannel, title, content, null) == 1) {
//					//userMessage.setBack1((short) 1);
//					//userMessage.setGetTime(DateUtil.getIntStampTime());
//					bool = true;
//				} else {
//					//userMessage.setBack1((short) -1);
//				}
			}
			//mapper.insertSelective(userMessage);
		}
		catch (

		Exception e) {
			e.printStackTrace();

		}

		return bool;

	}
	//
	public static void main(String[] args) {
		pushContent(2,"1507bfd3f7ccd09e9b3","测试推送消息","测试推送消息");
	}

}
