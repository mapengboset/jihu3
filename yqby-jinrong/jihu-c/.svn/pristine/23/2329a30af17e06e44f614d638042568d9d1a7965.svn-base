package com.yqbing.servicebing.utils;

import java.math.BigDecimal;
/**
 * 数据格式化工具类
 * @author mapb
 *
 */
public class DataFormatUntil {
	/**
	 * 对double数据进行四舍五入，保留指定有效位数小数
	 * @param val 待格式化的double数字
	 * @param newScale 指定保留有效位数
	 * @return 格式化后的值
	 */
	public static Double roundDouble(double val, int newScale) {
        // System.out.println(val);
        if (val == 0) {
            return 0.0;
        }
        BigDecimal bec = new BigDecimal(val);
        double nval = bec.setScale(newScale, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
        return nval;
    }
	  /**
     * 计算功率因素.
     * 
     * @param faq
     *            正向有功
     * @param frq
     *            正向无功
     * @param arg
     *            保留小数位数
     * @return 功率因素
     */
    public static double getPF(Double faq, Double frq, int arg) {
        double pf = 0.0D;
        if ((faq != null) && (frq != null) && (Math.hypot(faq.doubleValue(), frq.doubleValue()) != 0.0D)) {
            pf = roundDouble(
                    Math.abs(faq.doubleValue()) / Math.hypot(faq.doubleValue(), frq.doubleValue()), arg);
        }
        return pf;
    }

	
}
