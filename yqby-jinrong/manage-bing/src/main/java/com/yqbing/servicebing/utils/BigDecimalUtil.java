package com.yqbing.servicebing.utils;

import java.math.BigDecimal;

/**
 * 提供（相对）精确的除法运算工具类
 * @author  jdgj_guozhancheng
 */
public class BigDecimalUtil {

	/**
	 * 提供精确的小数位四舍五入处理
	 * 
	 * @param inputValue1           被除数
	 * @param inputValue2           除数
	 * @param scale    保留小数位数
	 * @return 两个参数的商
	 */
	public static BigDecimal roundHalfUp(int inputValue1, int inputValue2, int scale) {

		// 除数为零的时候，0返回
		if (0 == inputValue2) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(inputValue1).divide(new BigDecimal(inputValue2), scale, BigDecimal.ROUND_HALF_UP);
	}
	public static BigDecimal roundHalfUp(long inputValue1, int inputValue2, int scale) {
		
		// 除数为零的时候，0返回
		if (0 == inputValue2) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(inputValue1).divide(new BigDecimal(inputValue2), scale, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 提供精确的小数位四舍五入处理
	 * 
	 * @param inputValue1           被除数
	 * @param inputValue2           除数
	 * @param scale    保留小数位数
	 * @return 两个参数的商
	 */
	public static BigDecimal roundHalfUp(BigDecimal inputValue1, BigDecimal inputValue2, int scale) {

		// 除数为零的时候，0返回
		if (inputValue2.compareTo(BigDecimal.ZERO) == 0) {
			return BigDecimal.ZERO;
		}
		return inputValue1.divide(inputValue2, scale, BigDecimal.ROUND_HALF_UP);
	}


}
