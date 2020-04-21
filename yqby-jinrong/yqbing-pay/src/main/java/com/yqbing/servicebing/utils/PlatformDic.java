package com.yqbing.servicebing.utils;

import java.util.HashMap;
import java.util.Map;

public class PlatformDic {
	
	public static final int WEBSITE = 0;//官网
	public static final int B_APP = 1;//B端
	public static final int C_APP = 2;//C端
	public static final int XH_APP = 3;//校嗨
	public static final int WB_APP = 4;//网吧
	public static final int WXLM_APP = 5;//网校联盟
	public static final int ZSJH_APP = 6;//掌上机呼
	public static final int B_AGENT_APP = 7;//B端、网吧、快下代理商
	public static final int CAI_PIAO_APP = 8;//彩票
	
	public static final Map<Integer, Integer> appChannelMap = new HashMap<Integer, Integer>();
	static {
		appChannelMap.put(11, WEBSITE);//官网
		appChannelMap.put(1, B_APP);//B端
		appChannelMap.put(2, B_APP);
		appChannelMap.put(21, B_APP);//B端
		appChannelMap.put(22, B_APP);
		appChannelMap.put(24, B_APP);
		appChannelMap.put(31, C_APP);//C端
		appChannelMap.put(32, C_APP);
		appChannelMap.put(34, C_APP);
		appChannelMap.put(41, XH_APP);//校嗨
		appChannelMap.put(42, XH_APP);
		appChannelMap.put(44, XH_APP);
		appChannelMap.put(51, WB_APP);//网吧
		appChannelMap.put(52, WB_APP);
		appChannelMap.put(54, WB_APP);
		appChannelMap.put(61, WXLM_APP);//网校联盟
		appChannelMap.put(62, WXLM_APP);
		appChannelMap.put(64, WXLM_APP);
		appChannelMap.put(71, ZSJH_APP);//掌上机呼
		appChannelMap.put(72, ZSJH_APP);
		appChannelMap.put(74, ZSJH_APP);
		appChannelMap.put(81, B_AGENT_APP);//B端、网吧、快下代理商
		appChannelMap.put(82, B_AGENT_APP);
		appChannelMap.put(84, B_AGENT_APP);
		appChannelMap.put(91, CAI_PIAO_APP);//彩票
		appChannelMap.put(92, CAI_PIAO_APP);
		appChannelMap.put(94, CAI_PIAO_APP);
		
	}

}
