package com.yqbing.servicebing.utils;

import java.util.Random;


/**
 * @author zhangsongpu
 * @date:2015-8-22 下午10:40:20
 */
public class RandomUtils {
	public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String letterChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String numberChar = "0123456789";
	/** 自定义进制（选择你想要的进制数，不能重复且最好不要0、1这些容易混淆的字符） */
    private static final char[] randomChar =new char[]{'q', 'w', 'e', '8', 's', '2', 'd', 'z', 'x', '9', 'c', '7', 'p', '5', 'k', '3', 'm', 'j', 'u', 'f', 'r', '4', 'v', 'y', 't', 'n', '6', 'b', 'g', 'h'};
    /** 进制长度 */
    private static final int binLen = randomChar.length;
	/** 定义一个字符用来补全邀请码长度（该字符前面是计算出来的邀请码，后面是用来补全用的） */
    private static final char random = 'a';

	/**
	 * 返回一个定长的随机字符串(只包含大小写字母、数字)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(allChar.charAt(random.nextInt(allChar.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateMixString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(allChar.charAt(random.nextInt(letterChar.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯大写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateLowerString(int length) {
		return generateMixString(length).toLowerCase();
	}

	/**
	 * 返回一个定长的随机纯小写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateUpperString(int length) {
		return generateMixString(length).toUpperCase();
	}

	/**
	 * 生成一个定长的纯0字符串
	 * 
	 * @param length
	 *            字符串长度
	 * @return 纯0字符串
	 */
	public static String generateZeroString(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append('0');
		}
		return sb.toString();
	}

	/**
	 * 根据数字生成一个定长的字符串，长度不够前面补0
	 * 
	 * @param num
	 *            数字
	 * @param fixdlenth
	 *            字符串长度
	 * @return 定长的字符串
	 */
	public static String toFixdLengthString(long num, int fixdlenth) {
		StringBuffer sb = new StringBuffer();
		String strNum = String.valueOf(num);
		if (fixdlenth - strNum.length() >= 0) {
			sb.append(generateZeroString(fixdlenth - strNum.length()));
		} else {
			throw new RuntimeException("将数字" + num + "转化为长度为" + fixdlenth
					+ "的字符串发生异常！");
		}
		sb.append(strNum);
		return sb.toString();
	}

	/**
	 * 根据数字生成一个定长的字符串，长度不够前面补0
	 * 
	 * @param num
	 *            数字
	 * @param fixdlenth
	 *            字符串长度
	 * @return 定长的字符串
	 */
	public static String toFixdLengthString(int num, int fixdlenth) {
		StringBuffer sb = new StringBuffer();
		String strNum = String.valueOf(num);
		if (fixdlenth - strNum.length() >= 0) {
			sb.append(generateZeroString(fixdlenth - strNum.length()));
		} else {
			throw new RuntimeException("将数字" + num + "转化为长度为" + fixdlenth
					+ "的字符串发生异常！");
		}
		sb.append(strNum);
		return sb.toString();
	}

	public static String getRandomString(int length) {
		String str = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(10);

			sb.append(str.charAt(number));
		}

		return sb.toString();
	}
	
	/**
	 * 生成0-num之间的随机数
	 * @param num
	 * @return
	 */
	public static int generateRandom(int num){
		Random random = new Random();
		return random.nextInt(num);
	}
	
	/**
	 * 生成min到num+min之前的随机数
	 * @param num
	 * @param min
	 * @return
	 */
	public static int generateRandom(int num,int min){
		Random random = new Random();
		return random.nextInt(num)+min;
	}
	/**
	 * 
	 * @Title getRandomNum 
	 * @Description 获取年月日+五位随机数字 
	 * @author Lapaus
	 * @date 2016年2月26日 上午11:17:55
	 * @updateTime 2016年2月26日 上午11:17:55
	 * @udpateAuthor  Lapaus
	 * @return
	 * @return String    返回类型
	 */
	public static String getRandomNum() {
		String date=DataUtils.getDate("yyyyMMdd");
		int n=0;
		n=(int)(Math.random()*100000);
		while(n<10000 || !handle(n)){
		n=(int)(Math.random()*100000);
		}
		String number=date+n;
		System.out.println("n="+number);
		return number;
	}
	public static boolean handle(int n){
		int[] list=new int[5];
		for(int i=0;i<5;i++){
		list[i]=n%10;
		n=n/10;
		}
		for(int i=0;i<5;i++){
		for(int j=i+1;j<5;j++){
		if(list[i]==list[j]) return false;
		}
		}
		return true;
	}
	
	/**
     * 根据ID生成随机码
     * @param id ID
     * @param s 字符串长度
     * @return 随机码
     */
    public static String toSerialCode(int s,long id) {
        char[] buf=new char[32];
        int charPos=32;

        while((id / binLen) > 0) {
            int ind=(int)(id % binLen);
            buf[--charPos]=randomChar[ind];
            id /= binLen;
        }
        buf[--charPos]=randomChar[(int)(id % binLen)];
        String str=new String(buf, charPos, (32 - charPos));
        // 不够长度的自动随机补全
        if(str.length() < s) {
            StringBuilder sb=new StringBuilder();
            sb.append(random);
            Random rnd=new Random();
            for(int i=1; i < s - str.length(); i++) {
            sb.append(randomChar[rnd.nextInt(binLen)]);
            }
            str+=sb.toString();
        }
        return str;
    }

    
    public static long generateRandomNumber(int n){
        if(n<1){
            return 0;
        }
         return (long)(Math.random()*9*Math.pow(10,n-1)) + (long)Math.pow(10,n-1);
    }
   
    
    
    
	public static void main(String[] args) {
//		System.out.println(generateString(6));
//		System.out.println(generateMixString(6));
//		System.out.println(generateLowerString(6));
//		System.out.println(generateUpperString(6));
//		System.out.println(generateZeroString(6));
//		System.out.println(toFixdLengthString(123, 6));
//		System.out.println(toFixdLengthString(123L, 6));
//		System.out.println(getRandomString(1));
//		System.out.println(generateRandom(10));
//		System.out.println(generateRandom(10,10));
		System.out.println(RandomUtils.generateRandom(18, 1));
	}

}
