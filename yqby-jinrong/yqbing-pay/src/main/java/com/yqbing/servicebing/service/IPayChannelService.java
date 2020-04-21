package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.PayAppInfo;
import com.yqbing.servicebing.repository.database.bean.PayChannelInfo;

public interface IPayChannelService {

	PayChannelInfo getPayChannelInfo(String payChannel);
  
	/**
	 * 获取支付组中支付渠道的配置信息
	 * @param payGroupId
	 * @param payProvider
	 * @return
	 */
	PayAppInfo getPayApp(int appChannel, Integer customerId,
			Integer payGroupId, String payProvider);

}
