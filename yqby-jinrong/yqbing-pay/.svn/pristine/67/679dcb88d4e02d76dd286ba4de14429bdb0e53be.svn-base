package com.yqbing.servicebing.utils;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.yqbing.servicebing.exception.BingException;



/**
 * 时间辅助类
 * 
 * @author mapb
 *
 */
public class TimeHelper {

	/** 年格式 */
	private final static SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy");
	/** 月份格式 */
	private final static SimpleDateFormat MONTH_FORMAT = new SimpleDateFormat("yyyyMM");
	/** 日期格式 */
	private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	/** 简单日期格式 */
	private final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
	/** 时间格式 */
	private final static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	/** 时间格式 */
	private final static SimpleDateFormat TIME_HH_MM_FORMAT = new SimpleDateFormat("HH:mm");
	/** 时间戳格式 */
	private final static SimpleDateFormat TIMESTAMP_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/** 年月日 **/
	private final static SimpleDateFormat DATE_FORMAT_CN = new SimpleDateFormat("yyyy年MM月dd日");
	/** 月日 **/
	private final static SimpleDateFormat MONTH_DAY_FORMAT_CN = new SimpleDateFormat("MM月dd日");
	/** 月日星期 **/
	private final static SimpleDateFormat MONTH_DAY_WEEK_FORMAT_CN = new SimpleDateFormat("MM月dd日 EE");

	/** 年月格式 */
	private final static SimpleDateFormat DATE_FORMAT_Year_MONTH = new SimpleDateFormat("yyyy-MM");
	/**
	 * 获取当前日期
	 * 
	 * @return 当前日期字符串 yyyy-MM-dd
	 */
	public static String getDate() {
		return DATE_FORMAT.format(new java.util.Date());
	}
	
	/**
	 * 获取当前日期
	 * 
	 * @return 当前日期字符串 yyyy年MM月dd日
	 */
	public static String getDateCn() {
		return DATE_FORMAT_CN.format(new java.util.Date());
	}
	
	/**
	 * 获取当前日期
	 * 
	 * @return 当前日期字符串 MM月dd日
	 */
	public static String getMonthDayCn() {
		return MONTH_DAY_FORMAT_CN.format(new java.util.Date());
	}
	
	/**
	 * 获取当前日期
	 * 
	 * @return 当前日期字符串  MM月dd日 EE
	 */
	public static String getMonthDayWeekCn() {
		return MONTH_DAY_WEEK_FORMAT_CN.format(new java.util.Date());
	}

	/**
	 * 获取指定日期
	 * 
	 * @param date 指定日期
	 * @return 指定日期字符串
	 */
	public static String getDate(Date date) {
		// 检查空值
		if (date == null) {
			return null;
		}

		// 转化日期
		return DATE_FORMAT.format(date);
	}

	/**
	 * 获取指定日期
	 * 
	 * @param date 指定日期字符串
	 * @return 指定日期
	 * @throws BingException 健身馆异常
	 */
	public static Date getDate(String date) throws BingException {
		// 检查空值
		if (date == null) {
			return null;
		}

		// 转化日期
		try {
			return new Date(DATE_FORMAT.parse(date).getTime());
		}
		catch (ParseException e) {
			throw new BingException("日期(" + date + ")格式异常");
		}
	}
	/**
	 * 格式化日期
	 * @param date 日期参数
	 * @return 日期
	 * @throws BingException
	 */
	public static java.util.Date formatDate(String date) throws BingException {
		// 检查空值
		if (date == null) {
			return null;
		}

		// 转化日期
		try {
			return DATE_FORMAT.parse(date);
		}
		catch (ParseException e) {
			throw new BingException("日期(" + date + ")格式异常");
		}
	}
	/**
	 * 获取指定日期
	 * 
	 * @param date 指定日期字符串  yyyyMMdd
	 * @return 指定日期
	 * @throws BingException 健身馆异常
	 */
	public static java.util.Date getDateByYMD(String date) throws BingException {
		// 检查空值
		if (date == null) {
			return null;
		}
		
		// 转化日期
		try {
			return new java.util.Date(SIMPLE_DATE_FORMAT.parse(date).getTime());
		}
		catch (ParseException e) {
			throw new BingException("日期(" + date + ")格式异常");
		}
	}
	
	/**
	 * 获取指定时间
	 * 
	 * @param date 指定时间字符串
	 * @return 指定时间
	 * @throws BingException 健身馆异常
	 */
	public static java.util.Date getDateTime(String time) throws BingException {
		// 检查空值
		if (time == null) {
			return null;
		}

		// 转化日期
		try {
			return TIMESTAMP_FORMAT.parse(time);
		}
		catch (ParseException e) {
			throw new BingException("时间(" + time + ")格式异常");
		}
	}
	
	/**
	 * 获取加减日期
	 * 
	 * @param date 指定日期字符串
	 * @param days 指定加减天数
	 * @return 加减日期
	 * @throws BingException 健身馆异常
	 */
	public static String getDate(String date, Integer days) throws BingException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.DATE, days);
		return DATE_FORMAT.format(calendar.getTime());
	}

	/**
	 * 获取昨日日期
	 * 
	 * @return 昨日日期
	 */
	public static Date getYesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Date(calendar.getTimeInMillis());
	}
	/**
	 * 取得指定时间的昨天
	 * @param date 当前时间
	 * @return
	 */
	public static java.util.Date getYesterday(java.util.Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Date(calendar.getTimeInMillis());
	}

	/**
	 * 获取当前时间戳
	 * 
	 * @return 当前时间戳字符串
	 */
	public static String getTimestamp() {
		return TIMESTAMP_FORMAT.format(new java.util.Date());
	}

	/**
	 * 获取指定时间戳
	 * 
	 * @param timestamp 指定时间戳
	 * @return 指定时间戳字符串
	 */
	public static String getTimestamp(Timestamp timestamp) {
		// 检查空值
		if (timestamp == null) {
			return null;
		}

		// 转化时间
		return TIMESTAMP_FORMAT.format(new java.util.Date(timestamp.getTime()));
	}

	/**
	 * 获取指定时间戳
	 * 
	 * @param timestamp 指定时间戳字符串
	 * @return 指定时间戳
	 * @throws BingException 健身馆异常
	 */
	public static Timestamp getTimestamp(String timestamp) throws BingException {
		// 检查空值
		if (timestamp == null) {
			return null;
		}

		// 转化时间
		try {
			return new Timestamp(TIMESTAMP_FORMAT.parse(timestamp).getTime());
		}
		catch (ParseException e) {
			throw new BingException("时间戳(" + timestamp + ")格式异常");
		}
	}

	/**
	 * 获取加减时间戳
	 * 
	 * @param timestamp 指定时间戳字符串
	 * @param minutes 指定加减小时
	 * @return 加减时间戳
	 * @throws BingException 健身馆异常
	 */
	public static String getTimestamp(String timestamp, Integer minutes) throws BingException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getTimestamp(timestamp));
		calendar.add(Calendar.MINUTE, minutes);
		return TIMESTAMP_FORMAT.format(calendar.getTime());
	}

	/**
	 * 获取加减时间戳
	 * 
	 * @return 加减时间戳
	 * @throws BingException 健身馆异常
	 */
	public static String getTimestamp(Integer minutes) throws BingException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, minutes);
		return TIMESTAMP_FORMAT.format(calendar.getTime());
	}

	/**
	 * 获取指定时间戳
	 * 
	 * @param timestamp 指定时间戳
	 * @param time 指定时间
	 * @return 指定时间戳字符串
	 * @throws BingException 健身馆异常
	 */
	public static Timestamp getTimestamp(Timestamp timestamp, Time time) throws BingException {
		// 检查空值
		if (time == null) {
			return null;
		}

		// 转化时间
		return getTimestamp(getDate(new Date(timestamp.getTime())) + " " + getTime(time));
	}

	/**
	 * 获取显示时间
	 * 
	 * @param timestamp 指定时间戳
	 * @return
	 */
	public static String getDisplayTimestamp(Timestamp timestamp) {
		// 检查空值
		if (timestamp == null) {
			return "";
		}

		// 初始化
		StringBuilder sb = new StringBuilder();
		Calendar today = Calendar.getInstance();
		Calendar scday = Calendar.getInstance();

		// 设置时间
		// 设置时间: 今天时间
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		// 设置时间: 计划时间
		scday.setTime(timestamp);
		scday.set(Calendar.HOUR_OF_DAY, 0);
		scday.set(Calendar.MINUTE, 0);
		scday.set(Calendar.SECOND, 0);
		scday.set(Calendar.MILLISECOND, 0);

		// 获取日期
		long period = (scday.getTimeInMillis() - today.getTimeInMillis()) / 86400000;
		if (period == -2) {
			sb.append("前天");
		}
		else if (period == -1) {
			sb.append("昨天");
		}
		else if (period == 0) {
			sb.append("今天");
		}
		else if (period == 1) {
			sb.append("明天");
		}
		else if (period == 2) {
			sb.append("后天");
		}
		else {
			sb.append(scday.get(Calendar.DAY_OF_MONTH) + "日");
		}

		// 获取时间
		sb.append(new SimpleDateFormat("HH:mm").format(timestamp));

		// 返回数据
		return sb.toString();
	}

	/**
	 * 获取当前时间
	 * 
	 * @return 当前时间字符串
	 */
	public static String getTime() {
		return TIME_FORMAT.format(new java.util.Date());
	}

	/**
	 * 获取指定时间
	 * 
	 * @param time 指定时间
	 * @return 指定时间字符串
	 */
	public static String getTime(Time time) {
		// 检查空值
		if (time == null) {
			return null;
		}

		// 转化时间
		return TIME_FORMAT.format(new java.util.Date(time.getTime()));
	}

	/**
	 * 获取指定时间
	 * 
	 * @param time 指定时间字符串
	 * @return 指定时间
	 * @throws BingException 健身馆异常
	 */
	public static Time getTime(String time) throws BingException {
		// 检查空值
		if (time == null) {
			return null;
		}

		// 转化时间
		try {
			return new Time(TIME_FORMAT.parse(time).getTime());
		}
		catch (ParseException e) {
			throw new BingException("时间(" + time + ")格式异常");
		}
	}

	/**
	 * 获取时间字符串 HH:mm
	 * 
	 * @param timestamp 时间戳
	 * @return 时间字符串 HH:mm
	 * @throws BingException
	 */
	public static String getTime(Timestamp timestamp) throws BingException {
		// 检查空值
		if (timestamp == null) {
			return null;
		}

		// 转化时间
		return TIME_HH_MM_FORMAT.format(timestamp);
	}

	/**
	 * 格式化时间字符串 HH:mm
	 * 
	 * @param timestamp 时间戳
	 * @return 时间字符串 HH:mm
	 * @throws BingException
	 */
	public static String formatTime(String timestamp) throws BingException {
		// 检查空值
		if (timestamp == null) {
			return null;
		}

		// 转化时间
		return TIME_HH_MM_FORMAT.format(getTimestamp(timestamp));
	}
	
	/**
	 * 格式化时间字符串 HH:mm
	 * 
	 * @param timestamp 时间戳
	 * @return 时间字符串 HH:mm:ss
	 * @throws BingException
	 */
	public static String formatHMS(String timestamp) throws BingException {
		// 检查空值
		if (timestamp == null) {
			return null;
		}

		// 转化时间
		return TIME_FORMAT.format(getTimestamp(timestamp));
	}

	/**
	 * 获取一周某天
	 * 
	 * @param timestamp 时间戳
	 * @return 一周某天
	 */
	public static int getDayOfWeek(Timestamp timestamp) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(timestamp.getTime());
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * 获取一月某天
	 * 
	 * @param timestamp 时间戳
	 * @return 一月某天
	 */
	public static int getDayOfMonth(Timestamp timestamp) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(timestamp.getTime());
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 获取上月月份
	 * 
	 * @return 上月月份
	 */
	public static String getLastMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return MONTH_FORMAT.format(calendar.getTime());
	}

	/**
	 * 获取上月开始时间
	 * 
	 * @return 上月开始时间
	 */
	public static Timestamp getLastMonthBeginTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Timestamp(calendar.getTimeInMillis());
	}
	
	/**
	 * 获取指定月份开始时间
	 * @param i
	 * @return
	 * @throws ParseException 
	 */
	public static java.util.Date getMonthBeginTime(java.util.Date statDate,int i) throws ParseException{
		Calendar calendar = Calendar.getInstance();
		if(null!=statDate)
			calendar.setTime(statDate);
		calendar.add(Calendar.MONTH, i);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(calendar.getTimeInMillis())));
//		return new Timestamp(calendar.getTimeInMillis());
	}
	/**
	 * 返回当前月的上一个月
	 * @param date 当前日期
	 * @return yyyy-MM-DD
	 */
	public static String getLastMonthBeginTime(java.util.Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);  
		return DATE_FORMAT.format(calendar.getTime());
	}
	/**
	 * 获取上月结束时间
	 * 
	 * @return 上月结束时间
	 */
	public static Timestamp getLastMonthEndTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return new Timestamp(calendar.getTimeInMillis());
	}
	
	/**
	 * 获取指定月份的结束时间
	 * @param i
	 * @return
	 * @throws ParseException 
	 */
	public static java.util.Date getMonthEndTime(java.util.Date date,int i) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		if(null!=date)
			calendar.setTime(date);
		calendar.add(Calendar.MONTH, i);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(calendar.getTimeInMillis())));
//		return new Timestamp(calendar.getTimeInMillis());
	}

	/**
	 * 获取当前为周几(1,周一 2,周二...7,周日)
	 * 
	 * @return 周几(1,周一 2,周二...7,周日)
	 */
	public static Integer getCurrentWeekday() {
		Calendar systemCalendar = Calendar.getInstance();
		Integer weekDay = systemCalendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (weekDay == 0) {
			weekDay = 7;
		}
		return weekDay;
	}

	/**
	 * 获取周几名称
	 * 
	 * @return 周几(1,周一 2,周二...7,周日)
	 */
	public static String getWeekdayByValue(short weekday) {
		if (weekday == 1) {
			return "周一";
		}
		if (weekday == 2) {
			return "周二";
		}
		if (weekday == 3) {
			return "周三";
		}
		if (weekday == 4) {
			return "周四";
		}
		if (weekday == 5) {
			return "周五";
		}
		if (weekday == 6) {
			return "周六";
		}
		if (weekday == 7) {
			return "周日";
		}
		return "未知";
	}

	/**
	 * 获取年份
	 * 
	 * @param beforeYears 往前推的年数
	 * @return 年份
	 */
	public static Integer getYear(Integer beforeYears) {
		Calendar systemCalendar = Calendar.getInstance();
		Integer year = systemCalendar.get(Calendar.YEAR) - beforeYears;
		return year;
	}

	/**
	 * 转换时间戳格式为时间格式
	 * 
	 * @param timestamp 时间戳
	 * @return 时间
	 * @throws BingException 健身馆异常
	 */
	public static Time getTimeFromTimestamp(String timestamp) throws BingException {
		Timestamp stamp = getTimestamp(timestamp);
		String strTime = TIME_FORMAT.format(stamp);
		return getTime(strTime);
	}

	/**
	 * 当天日期连接指定时间
	 * 
	 * @param time 时间
	 * @return 当天日期时间
	 * @throws BingException 健身馆异常
	 */
	public static Timestamp getTodayTime(Time time) throws BingException {
		String strToday = getDate();
		String strTime = getTime(time);
		String strDateTime = strToday + " " + strTime;
		return getTimestamp(strDateTime);
	}

	/**
	 * 连接日期和时间
	 * 
	 * @param date 指定日期
	 * @param time 指定时间
	 * @return 连接后的日期时间
	 * @throws BingException 健身馆异常
	 */
	public static Timestamp getDateTime(long date, Time time) throws BingException {
		Date dDate = new Date(date);
		String strDate = getDate(dDate);
		String strTime = getTime(time);
		String strDateTime = strDate + " " + strTime;
		return getTimestamp(strDateTime);
	}

	/**
	 * 获取时期日期列表(逆序)
	 * 
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return 日期列表(逆序)
	 */
	public static List<String> getPeriodDateList(java.util.Date beginTime, java.util.Date endTime) {
		// 初始化
		List<String> dateList = new ArrayList<String>();

		// 获取日期
		String beginDate = SIMPLE_DATE_FORMAT.format(beginTime);
		String endDate = SIMPLE_DATE_FORMAT.format(endTime);

		// 交换大小
		if (beginDate.compareTo(endDate) > 0) {
			String tempMonth = beginDate;
			beginDate = endDate;
			endDate = tempMonth;
			java.util.Date tempDate = beginTime;
			beginTime = endTime;
			endTime = tempDate;
		}

		// 添加日期
		dateList.add(endDate);
		if (!beginDate.equals(endDate)) {
			// 初始日历
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(endTime);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);

			// 依次添加
			String currDate = endDate;
			while (!currDate.equals(beginDate)) {
				// 递增月份
				calendar.add(Calendar.DATE, -1);
				currDate = SIMPLE_DATE_FORMAT.format(calendar.getTime());

				// 添加月份
				dateList.add(currDate);
			}
		}

		// 返回列表
		return dateList;
	}
	
	/**
	 * 获取时期日期列表(逆序)
	 * 
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return 日期列表(逆序)
	 */
	public static List<String> getDateList(java.util.Date beginTime, java.util.Date endTime) {
		// 初始化
		List<String> dateList = new ArrayList<String>();

		// 获取日期
		String beginDate = DATE_FORMAT.format(beginTime);
		String endDate = DATE_FORMAT.format(endTime);

		// 交换大小
		if (beginDate.compareTo(endDate) > 0) {
			String tempMonth = beginDate;
			beginDate = endDate;
			endDate = tempMonth;
			java.util.Date tempDate = beginTime;
			beginTime = endTime;
			endTime = tempDate;
		}

		// 添加日期
		dateList.add(endDate);
		if (!beginDate.equals(endDate)) {
			// 初始日历
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(endTime);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);

			// 依次添加
			String currDate = endDate;
			while (!currDate.equals(beginDate)) {
				// 递增月份
				calendar.add(Calendar.DATE, -1);
				currDate = DATE_FORMAT.format(calendar.getTime());

				// 添加月份
				dateList.add(currDate);
			}
		}

		// 返回列表
		return dateList;
	}
	

	/**
	 * 获取周   日期列表
	 * @param num  0 为本周   1为下周   -1为上周  依次类推
	 * @return yyyy-MM-dd
	 */
	public static List<String> getWeekList(int num) {
		List<String> data = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		//n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
		String monday;
		cal.add(Calendar.DATE, num*7);
		//想周几，这里就传几Calendar.MONDAY（TUESDAY...）
		cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		for (int i = 0; i < 7; i++) {
			monday = DATE_FORMAT.format(cal.getTime());
			data.add(monday);
			cal.add(Calendar.DATE, 1);
	    }
		return data;
	}

	/**
	 * 获取月初日期
	 * 
	 * @param date 指定日期
	 * @return 月初日期
	 * @throws CommunityException 社区异常
	 */
	public static String getMonthFirstDay(String date) throws BingException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return DATE_FORMAT.format(calendar.getTime());
	}

	/**
	 * 获取月底日期
	 * 
	 * @param date 指定日期
	 * @return 月底日期
	 * @throws CommunityException 社区异常
	 */
	public static String getMonthEndDay(String date) throws BingException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return DATE_FORMAT.format(calendar.getTime());
	}

	/**
	 * 计算两个日期相差天数
	 * 
	 * @param beginDate 开始时间
	 * @param endDate 结束时间
	 * @return 相差天数
	 */
	public static Integer getCompareDays(String beginDate, String endDate) throws BingException {
		Integer days = 0;
		try {
			int startYear = Integer.parseInt(beginDate.substring(0, 4));
			int endYear = Integer.parseInt(endDate.substring(0, 4));

			Calendar start = Calendar.getInstance();
			start.setTime(DATE_FORMAT.parse(beginDate.substring(0, 10)));

			Calendar end = Calendar.getInstance();
			end.setTime(DATE_FORMAT.parse(endDate.substring(0, 10)));

			// 两个日期相差的天
			days = end.get(Calendar.DAY_OF_YEAR) - start.get(Calendar.DAY_OF_YEAR);
			for (int i = startYear; i < endYear; i++) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(YEAR_FORMAT.parse(String.valueOf(i)));
				days += calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
			}
		}
		catch (ParseException e) {
			throw new BingException("计算两个日期相差天数异常");
		}
		return days;
	}

	/**
	 * 比较两个日期大小
	 * 
	 * @param date1
	 * @param date2
	 * @return 比较结果：1、0、-1
	 */
	public static Integer compare_date(java.util.Date date1, java.util.Date date2) throws BingException {
		// data1大于data2
		if (date1.getTime() > date2.getTime()) {
			return 1;
		}

		// data1小于data2
		else if (date1.getTime() < date2.getTime()) {
			return -1;
		}

		// data1等于data2
		else {
			return 0;
		}
	}
	
	/**
	 * 获取当前日期所在周的第一天的日期
	 * 每周第一天按 周一计算
	 * @param time
	 * @return 周一日期
	 * @throws BingException
	 */
	public static String getWeekBeginByDate(Date time)  throws BingException {  
	    Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
	    return DATE_FORMAT.format(cal.getTime());
	} 
	
	/**
	 * 获取当前日期所在周的第一天日期时间
	 * @param time
	 * @return
	 * @throws BingException
	 * @throws ParseException 
	 */
	public static java.util.Date getWeekBeginByDate(java.util.Date time)  throws BingException, ParseException {  
	    Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
	    cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
	    return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(cal.getTimeInMillis())));
	}
	
	
	/**
	 * 获取当前日期所在周的第一天日期时间
	 * @param time
	 * @param i
	 * @return
	 * @throws BingException
	 * @throws ParseException
	 */
	public static java.util.Date getWeekBeginByDate(java.util.Date time,int i)  throws BingException, ParseException {  
	    Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
	    cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
	    if(-1==i)
	    	cal.add(Calendar.DAY_OF_WEEK, -7);
	    if(1==i)
	    	cal.add(Calendar.DAY_OF_WEEK, 7);
	    return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(cal.getTimeInMillis())));
	}	
	
	/**
	 * 获取当前日期所在周的最后一天的日期
	 * 每周最后一天按
	 * @param time
	 * @return 周日日期
	 * @throws BingException
	 */
	public static String getWeekEndByDate(Date time) throws BingException {
		Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
	    cal.add(Calendar.DATE, 6);  
	    return DATE_FORMAT.format(cal.getTime());
	}

	/**
	 * 获取当前日期所在周最后一天的日期时间
	 * @param time
	 * @return
	 * @throws BingException
	 * @throws ParseException 
	 */
	public static java.util.Date getWeekEndByDate(java.util.Date time) throws BingException, ParseException {
		Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
	    cal.add(Calendar.DATE, 6); 
	    cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
	    return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(cal.getTimeInMillis())));
	}
	
	/**
	 * 获取当前日期所在周最后一天的日期时间
	 * @param time
	 * @return
	 * @throws BingException
	 * @throws ParseException 
	 */
	public static java.util.Date getWeekEndByDate(java.util.Date time,int i) throws BingException, ParseException {
		Calendar cal = Calendar.getInstance();  
	    cal.setTime(time);  
	    //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
	    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    if(1 == dayWeek) {  
	        cal.add(Calendar.DAY_OF_MONTH, -1);  
	    }  
	    cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
	    int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
	    cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
	    cal.add(Calendar.DATE, 6); 
	    cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		if(-1==i)
	    	cal.add(Calendar.DAY_OF_WEEK, -7);
	    if(1==i)
	    	cal.add(Calendar.DAY_OF_WEEK, 7);
	    return TIMESTAMP_FORMAT.parse(TIMESTAMP_FORMAT.format(new Date(cal.getTimeInMillis())));
	}
	
	/**
	 * 格式化时间
	 * @param date
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String formatTime(java.util.Date date){
		// 检查空值
		if (date == null) {
			return null;
		}
		// 转化时间
		return TIMESTAMP_FORMAT.format(date);
	}
	
	/**
	 * 格式化日期
	 * @param date
	 * @return yyyy-MM-dd
	 */
	public static String formatDate(java.util.Date date){
		// 检查空值
		if (date == null) {
			return null;
		}
		// 转化日期
		return DATE_FORMAT.format(date);
	}
	/**
	 * 取得当前时间
	 * @return
	 */
	public static java.util.Date getCurrentTime(){
		return Calendar.getInstance().getTime(); 
	}
	/**
	 * 取得当前时间戳
	 * @return
	 */
	public static Timestamp getCurrentTimestamp(){
		return new Timestamp(Calendar.getInstance().getTimeInMillis());
	}
	
	/**
	 * 格式化日期  年月日
	 * 
	 * @param date 日期  yyyy-MM-dd
	 * @return 时间字符串 yyyy年MM月dd日
	 * @throws BingException
	 */
	public static String formatDateCn(String date) throws BingException {
		// 检查空值
		if (date == null) {
			return null;
		}
		// 转化时间
		try {
			return DATE_FORMAT_CN.format(DATE_FORMAT.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new BingException("日期(" + date + ")格式异常");
		}
	}
	
	/**
	 * 获取月初日期
	 * @param date
	 * @param num 0为本月  1为下个月   -1为上个月  依次类推
	 * @return
	 */
	public static java.util.Date getMonthStart(java.util.Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, num);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (1 - index));
        return calendar.getTime();
    }
	 
    /**
     * 获取月末日期
     * @param date
     * @param num 0为本月  1为下个月   -1为上个月  依次类推
     * @return
     */
    public static java.util.Date getMonthEnd(java.util.Date date, int num) {
    	num+=1;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, num);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (-index));
        return calendar.getTime();
    }
	 
    /**
     * 获取当前日期的下一天
     * @param date
     * @return
     */
    public static java.util.Date getNext(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }
    /**
	 * 获取年初日期
	 * @param date
	 * @param num 0为本年  1为下一年   -1为上一年  依次类推
	 * @return
	 */
	public static java.util.Date getYearStart(java.util.Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, num);
        int index = calendar.get(Calendar.DAY_OF_YEAR);
        calendar.add(Calendar.DATE, (1 - index));
        return calendar.getTime();
    }
    /**
     * 当前时间（前）后的第i天的日期
     * @param date 当前时间
     * @param i 正数：当前时间后的第几天、负数：当前时间前的第几天
     * @return 日期
     */
    public static java.util.Date getNext(java.util.Date date,int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, i);
        return calendar.getTime();
    }
    /**
	 * 获取月   日期列表
	 * @param num  0 为本周   1为下周   -1为上周  依次类推
	 * @return yyyy-MM-dd
	 */
    public static List<String> getMonthList(int num) {
    	List<String> monthList = new ArrayList<String>();
		java.util.Date date = new  java.util.Date();
        java.util.Date monthStart = getMonthStart(date, num);
        java.util.Date monthEnd = getMonthEnd(date, num);
        while (!monthStart.after(monthEnd)) {
        	String dateStr = DATE_FORMAT.format(monthStart);
        	monthList.add(dateStr);
        	monthStart = getNext(monthStart);
        }
        return monthList;
	}
    
    /**
	 * 获取日期显示时间
	 * 
	 * @param timestamp 指定时间戳
	 * @return
	 */
	public static String getDisplayDate(java.util.Date date) {
		// 检查空值
		if (date == null) {
			return "";
		}

		// 初始化
		StringBuilder sb = new StringBuilder();
		Calendar today = Calendar.getInstance();
		Calendar scday = Calendar.getInstance();

		// 设置时间
		// 设置时间: 今天时间
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		// 设置时间: 计划时间
		scday.setTime(date);
		scday.set(Calendar.HOUR_OF_DAY, 0);
		scday.set(Calendar.MINUTE, 0);
		scday.set(Calendar.SECOND, 0);
		scday.set(Calendar.MILLISECOND, 0);

		// 获取日期
		long period = (scday.getTimeInMillis() - today.getTimeInMillis()) / 86400000;
		int tYear = today.get(Calendar.YEAR);      //年
		int sYear = scday.get(Calendar.YEAR);
		
//		if (period == -2) {
//			sb.append("前天");
//		}else 
			if (period == -1) {
			sb.append("昨天");
		}else if (period == 0) {
			sb.append("今天");
		}else if (period == 1) {
			sb.append("明天");
		}
//		else if (period == 2) {
//			sb.append("后天");
//		}
		else if (tYear == sYear) {
			sb.append(MONTH_DAY_FORMAT_CN.format(date));
		}else if (tYear != sYear){
			sb.append(DATE_FORMAT_CN.format(date));
		}

		// 返回数据
		return sb.toString();
	}
	
	/**
	 * 获取周日期显示时间 
	 * @param start 周第一天
	 * @param end 周最后一天
	 * @return
	 */
	public static String getDisplayWeek(java.util.Date start, java.util.Date end) {
		
		// 初始化
		StringBuilder sb = new StringBuilder();
		Calendar sday = Calendar.getInstance();//开始
		Calendar eday = Calendar.getInstance();//结束
		Calendar nday = Calendar.getInstance();//今天

		// 设置时间
		// 设置时间: 开始时间
		sday.set(Calendar.HOUR_OF_DAY, 0);
		sday.set(Calendar.MINUTE, 0);
		sday.set(Calendar.SECOND, 0);
		sday.set(Calendar.MILLISECOND, 0);
		sday.setFirstDayOfWeek(Calendar.MONDAY); 
		sday.setTime(start);
		
		// 设置时间: 结束时间
		eday.set(Calendar.HOUR_OF_DAY, 0);
		eday.set(Calendar.MINUTE, 0);
		eday.set(Calendar.SECOND, 0);
		eday.set(Calendar.MILLISECOND, 0);
		eday.setFirstDayOfWeek(Calendar.MONDAY);
		eday.setTime(end);
		
		// 设置时间: 今天时间
		nday.set(Calendar.HOUR_OF_DAY, 0);
		nday.set(Calendar.MINUTE, 0);
		nday.set(Calendar.SECOND, 0);
		nday.set(Calendar.MILLISECOND, 0);
		nday.setFirstDayOfWeek(Calendar.MONDAY);
		
		int sWeek = sday.get(Calendar.WEEK_OF_YEAR);
		int eWeek = eday.get(Calendar.WEEK_OF_YEAR);
		int nWeek = nday.get(Calendar.WEEK_OF_YEAR);

		int nYear = nday.get(Calendar.YEAR);      //年
		int sYear = sday.get(Calendar.YEAR);      //年
		
//		if (sWeek == nWeek) {
//			sb.append("本周");
//		}else if ((nWeek - sWeek) == 1){
//			sb.append("上周");
//		}else 
			if(nYear == sYear){
			sb.append(MONTH_DAY_FORMAT_CN.format(start)+"-"+MONTH_DAY_FORMAT_CN.format(end));
		}else if(nYear != sYear){
			sb.append(DATE_FORMAT_CN.format(start)+"-"+DATE_FORMAT_CN.format(end));
		}

		// 返回数据
		return sb.toString();
	}
	
	/**
	 * 获取月日期显示时间 
	 * @param start 月第一天
	 * @param end 月最后一天
	 * @return
	 */
	public static String getDisplayMonth(java.util.Date start, java.util.Date end) {
		
		// 初始化
		StringBuilder sb = new StringBuilder();
		Calendar sday = Calendar.getInstance();//开始
		Calendar eday = Calendar.getInstance();//结束
		Calendar nday = Calendar.getInstance();//今天

		// 设置时间
		// 设置时间: 开始时间
		sday.set(Calendar.HOUR_OF_DAY, 0);
		sday.set(Calendar.MINUTE, 0);
		sday.set(Calendar.SECOND, 0);
		sday.set(Calendar.MILLISECOND, 0);
		sday.setTime(start);
		
		// 设置时间: 结束时间
		eday.set(Calendar.HOUR_OF_DAY, 0);
		eday.set(Calendar.MINUTE, 0);
		eday.set(Calendar.SECOND, 0);
		eday.set(Calendar.MILLISECOND, 0);
		eday.setTime(end);
		
		// 设置时间: 今天时间
		nday.set(Calendar.HOUR_OF_DAY, 0);
		nday.set(Calendar.MINUTE, 0);
		nday.set(Calendar.SECOND, 0);
		nday.set(Calendar.MILLISECOND, 0);
		
		int sMonth = sday.get(Calendar.MONTH);
		int eMonth = eday.get(Calendar.MONTH);
		int nMonth = nday.get(Calendar.MONTH);

		int nYear = nday.get(Calendar.YEAR);      //年
		int sYear = sday.get(Calendar.YEAR);      //年
		if(nYear == sYear){
//			if (sMonth == nMonth) {
//				sb.append("本月");
//			}else if ((nMonth - sMonth) == 1){
//				sb.append("上月");
//			}else 
				if(nYear == sYear){
				sb.append(MONTH_DAY_FORMAT_CN.format(start)+"-"+MONTH_DAY_FORMAT_CN.format(end));
			}
		}else{
			sb.append(DATE_FORMAT_CN.format(start)+"-"+DATE_FORMAT_CN.format(end));
		}

		// 返回数据
		return sb.toString();
	}
	
	/**
     * 
     * 计算两个日期相差的月份数
     * 
     * @param date1 开始的日期
     * @param date2 结束的日期
     * @param pattern  日期1和日期2的日期格式
     * @return  相差的月份数
     * @throws ParseException
     */
    public static int countMonths(String begin,String end) throws BingException {
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        try {
			c1.setTime(DATE_FORMAT.parse(begin));
			c2.setTime(DATE_FORMAT.parse(end));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new BingException("日期(" + begin +","+ end + ")格式异常");
		}
        int year =c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR);
        //开始日期若小月结束日期
        if(year<0){
            year=-year;
            return year*12+c1.get(Calendar.MONTH)-c2.get(Calendar.MONTH);
        }
        return year*12+c2.get(Calendar.MONTH)-c1.get(Calendar.MONTH);
    }
    /**
     * 时间日期格式化：返回年-月
     * @param date
     * @return
     */
    public static String formatTime2YeerMonth(java.util.Date date){
		// 检查空值
		if (date == null) {
			return null;
		}
		// 转化时间
		return DATE_FORMAT_Year_MONTH.format(date);
	}
    /**
     * 取得传入日期的月的第一天
     * @param date 日期
     * @return 当前月的第一天
     */
    public static String getMonthFirstDay(java.util.Date date){
    	if(date==null)return null;
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.set(Calendar.DAY_OF_MONTH, 1);
    	return DATE_FORMAT.format(calendar.getTime());
    }  
    
    public static String getStandardDate(String timeStr) {

		StringBuffer sb = new StringBuffer();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date dt2 = null;
		try {
			dt2 = sdf.parse(timeStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//继续转换得到秒数的long型
//		long lTime = dt2.getTime() / 1000;
		long t=dt2.getTime() / 1000;  ;
//		long t = Long.parseLong(timeStr);
		long time = System.currentTimeMillis() - (t * 1000);
		long mill = (long) Math.ceil(time / 1000);// 秒前

		long minute = (long) Math.ceil(time / 60 / 1000.0f);// 分钟前

		long hour = (long) Math.ceil(time / 60 / 60 / 1000.0f);// 小时

		long day = (long) Math.ceil(time / 24 / 60 / 60 / 1000.0f);// 天前

		if (day - 1 > 0) {
			sb.append((day-1) + "天");
		} else if (hour - 1 > 0) {
			if (hour >= 24) {
				sb.append("1天");
			} else {
				sb.append((hour-1) + "小时");
			}
		} else if (minute - 1 > 0) {
			if (minute == 60) {
				sb.append("1小时");
			} else {
				sb.append(minute + "分钟");
			}
		} else if (mill - 1 > 0) {
			if (mill == 60) {
				sb.append("1分钟");
			} else {
				sb.append(mill + "秒");
			}
		} else {
			sb.append("刚刚");
		}
		if (!sb.toString().equals("刚刚")) {
			sb.append("前");
		}
		return sb.toString();
	}

    public static void main(String[] args) {
//    	java.util.Date now = new java.util.Date();
//    	System.out.println(TimeHelper.formatDate(now));
//    	java.util.Date yesterDay = TimeHelper.getNext(now,-1);
//    	System.out.println(TimeHelper.formatDate(yesterDay));
    	
    	java.util.Date nowTime = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		java.util.Date statDate;
		try {
//			nowTime = new SimpleDateFormat("yyyy-MM-dd").parse("2017-04-01");
//			statDate = new java.util.Date(sdf.parse(sdf.format(nowTime)).getTime()-24*60*60*1000);
//			System.out.println(sdf.format(statDate));
//			java.util.Date monthStart = TimeHelper.getMonthBeginTime(statDate,0);
//			java.util.Date monthEnd = TimeHelper.getMonthEndTime(statDate,1);
//			System.out.println(sdf.format(monthStart));
//			System.out.println(sdf.format(monthEnd));
			
//			java.util.Date weekStart = TimeHelper.getWeekBeginByDate(statDate);
//			java.util.Date weekEnd = TimeHelper.getWeekEndByDate(statDate);
//			System.out.println(sdf.format(weekStart));
//			System.out.println(sdf.format(weekEnd));
			
//			java.util.Date monthStart1 = getMonthStart(statDate,-1);
//			java.util.Date monthEnd1 =  getMonthEnd(statDate,-1);
//			System.out.println(sdf.format(monthStart1));
//			System.out.println(sdf.format(monthEnd1));
			
			java.util.Date weekStatBefore = getWeekBeginByDate(nowTime,0);
			java.util.Date weekEndBefore = getWeekEndByDate(nowTime,0);
			System.out.println(sdf.format(weekStatBefore));
			System.out.println(sdf.format(weekEndBefore));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
