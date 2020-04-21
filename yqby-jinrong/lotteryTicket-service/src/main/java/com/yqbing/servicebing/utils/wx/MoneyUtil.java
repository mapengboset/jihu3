package com.yqbing.servicebing.utils.wx;

import java.math.BigDecimal;

/**
 * 金额转换工具类
 * 
 * @author SHGU
 *
 */
public class MoneyUtil {

	/** 金额为分的格式 */
	public static final String CURRENCY_FEN_REGEX = "\\-?[0-9]+";

	/**
	 * 验证是否为数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
		java.util.regex.Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;

	}

	/**
	 * 元转换成分
	 * 
	 * @param money
	 * @return
	 */
	public static String changeY2F(String amount) {
		if (amount == null) {
			return "";
		}
		// 金额转化为分为单位
		String currency = amount.replaceAll("\\$|\\￥|\\,", ""); // 处理包含, ￥
																// 或者$的金额
		int index = currency.indexOf(".");
		int length = currency.length();
		Long amLong = 0l;
		if (index == -1) {
			amLong = Long.valueOf(currency + "00");
		} else if (length - index >= 3) {
			amLong = Long.valueOf((currency.substring(0, index + 3)).replace(".", ""));
		} else if (length - index == 2) {
			amLong = Long.valueOf((currency.substring(0, index + 2)).replace(".", "") + 0);
		} else {
			amLong = Long.valueOf((currency.substring(0, index + 1)).replace(".", "") + "00");
		}
		return amLong.toString();
	}

	/**
	 * 分转元
	 * 
	 * @param amount
	 * @return
	 * @throws Exception
	 */
	public static String changeF2Y(String amount) throws Exception {
		if (amount == null) {
			return "";
		}
		if (!amount.matches(CURRENCY_FEN_REGEX)) {
			throw new Exception("金额格式有误");
		}
		return BigDecimal.valueOf(Long.valueOf(amount)).divide(new BigDecimal(100)).toString();
	}
}
