package com.yqbing.servicebing.service;

import java.io.UnsupportedEncodingException;

import com.yqbing.servicebing.webapp.request.trade.dto.TradeInfo;

public interface ITradeFrontService {

	String getReturnUrl(TradeInfo trade) throws UnsupportedEncodingException;

}
