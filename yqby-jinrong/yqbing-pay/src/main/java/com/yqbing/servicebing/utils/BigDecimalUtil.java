package com.yqbing.servicebing.utils;

import java.math.BigDecimal;

/**
 * 提供（相对）精确的除法运算工具类
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

	public static BigDecimal roundDown(int inputValue1, int inputValue2, int scale) {

		// 除数为零的时候，0返回
		if (0 == inputValue2) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(inputValue1).divide(new BigDecimal(inputValue2), scale, BigDecimal.ROUND_DOWN);
	}
	
	public static BigDecimal roundDown(double inputValue1, int inputValue2, int scale) {

		// 除数为零的时候，0返回
		if (0 == inputValue2) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(inputValue1).divide(new BigDecimal(inputValue2), scale, BigDecimal.ROUND_DOWN);
	}
	
	public static BigDecimal round(double inputValue, int scale) {
		BigDecimal value = new BigDecimal(inputValue);
		BigDecimal rtn = value.setScale(scale, BigDecimal.ROUND_HALF_UP);
		return rtn;
	}
	
	public static void main(String[] args) {
		double d = 3.42544;
		System.out.println(round(d, 2));
		System.out.println(roundDown(3457 , 100, 1));
	}
}
