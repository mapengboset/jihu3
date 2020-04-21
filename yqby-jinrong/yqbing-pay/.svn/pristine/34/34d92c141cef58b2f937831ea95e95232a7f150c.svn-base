package com.yqbing.servicebing.utils.pay;
import java.math.BigDecimal;

public class DecimalUtils {

	/**
	 * 小数格式化（四舍五入方式）
	 * @param num
	 * @param newScale	小数点后位数
	 * @return
	 */
	public static double decimalFormat(Double num, int newScale){
		
		return decimalFormat(num, newScale, BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * 小数格式化（四舍五入方式）
	 * @param num
	 * @param newScale	小数点后位数
	 * @param roundingMode	小数的保留模式  {@link BigDecimal}.ROUND_XXXX
	 * @return
	 */
	public static double decimalFormat(Double num, int newScale, int roundingMode){

		return decimalFormat(BigDecimal.valueOf(num), newScale, roundingMode).doubleValue();
	}
	
	
	/**
	 * 小数格式化（四舍五入方式）
	 * @param num
	 * @param newScale	小数点后位数
	 * @return
	 */
	public static BigDecimal decimalFormat(BigDecimal num, int newScale){

		return decimalFormat(num, newScale, BigDecimal.ROUND_HALF_UP);  
	}
	
	/**
	 * 小数格式化（四舍五入方式）
	 * @param num
	 * @param newScale	小数点后位数
	 * @param roundingMode	小数的保留模式  {@link BigDecimal}.ROUND_XXXX
	 * @return
	 */
	public static BigDecimal decimalFormat(BigDecimal num, int newScale, int roundingMode){
		
		if(num == null){
			return null;
		}
		if(newScale < 0){
			throw new ArithmeticException("decimal format failed! newScale '" + newScale + "' invalid");
		}		
		return num.setScale(newScale, roundingMode);  
	}
	
	
	public static double add(double v1, double v2){  

        return add(BigDecimal.valueOf(v1), BigDecimal.valueOf(v2)).doubleValue();  
    }
	
	public static BigDecimal add(BigDecimal b1, BigDecimal b2){  

        return b1.add(b2);  
    }
	
	
	public static double subtract(double v1,double v2){
		
        return subtract(BigDecimal.valueOf(v1), BigDecimal.valueOf(v2)).doubleValue();  
    }
	
	public static BigDecimal subtract(BigDecimal b1, BigDecimal b2){  

        return b1.subtract(b2);  
    }
	
	public static double multiply(double v1,double v2){
		
        return multiply(BigDecimal.valueOf(v1), BigDecimal.valueOf(v2)).doubleValue();  
    }
	
	public static BigDecimal multiply(BigDecimal b1, BigDecimal b2){  

        return b1.multiply(b2);  
    }
	
	public static double divide(double v1,double v2){
		
        return divide(BigDecimal.valueOf(v1), BigDecimal.valueOf(v2)).doubleValue();  
    }
	
	public static BigDecimal divide(BigDecimal b1, BigDecimal b2){  

        return divide(b1, b2, 20);  
    }
	
	@Deprecated
	public static BigDecimal divide(BigDecimal b1, int newScale, BigDecimal b2){  

        return divide(b1, b2, newScale);  
    }
	
	public static BigDecimal divide(BigDecimal b1, BigDecimal b2, int newScale){  

        return b1.divide(b2, newScale, BigDecimal.ROUND_HALF_UP);  
    }
	
	public static void main(String[] args){
		
		BigDecimal d = multiply(BigDecimal.valueOf(0.9550000d), new BigDecimal(100));
		System.out.println(DecimalUtils.decimalFormat(0.9550000d, 2));
		System.out.println(d.doubleValue());
	}
}

