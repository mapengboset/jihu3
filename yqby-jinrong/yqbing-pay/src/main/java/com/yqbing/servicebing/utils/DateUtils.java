package com.yqbing.servicebing.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Title:DateUtils.java
 * Description:
 * @author alexaz
 * 2019年4月27日
 */
public class DateUtils {

	/**
	 * Get the date string by format.
	 * 
	 * @param date
	 *            The date need to be changed.
	 * @param style
	 *            Format type string.
	 * @return String of this date.
	 */
	public static synchronized String getDateStr(Date date, String style) {
		String dateStr = "";
		try {
			SimpleDateFormat format = getSDF(style);
			dateStr = format.format(date);
		} catch (Exception e) {
		}
		return dateStr;
	}

	/**
	 * Get the date object by the format and date string.
	 * 
	 * @param dateStr
	 *            Date string.
	 * @param style
	 *            String format.
	 * @return Date object.
	 */
	public static synchronized Date getDate(String dateStr, String style) {
		try {
			if (dateStr.equals(""))
				return null;
			// SimpleDateFormat format =(SimpleDateFormat)getSDF(style).clone();
			SimpleDateFormat format = getSDF(style);
			Date date = format.parse(dateStr);
			/*
			 * //要验证的日期 Calendar calenderThis = Calendar.getInstance();
			 * calenderThis.setTime(date);
			 * 
			 * //验证日期合法性，如0231非法 // if(!verifyDate(dateStr)) return null;
			 * 
			 * //十年以前的今天 Calendar calender10Before = Calendar.getInstance();
			 * calender10Before.add(Calendar.YEAR, -10);
			 * 
			 * //十年以后的今天 Calendar calender10After = Calendar.getInstance();
			 * calender10After.add(Calendar.YEAR, 10);
			 * 
			 * //验证日期在前后10年内 if (calenderThis.after(calender10After) ||
			 * calenderThis.before(calender10Before)) return null; else
			 */
			return date;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Get the yesterdate or tomorrow or other date
	 * 
	 * @param now
	 *            The date object
	 * @param offset
	 *            1 is tomorrow, -1 is yesterday.
	 * @return The calculated date by offset.
	 */
	public static Date getOtherDate(Date now, int offset) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(now.getTime());
		calendar.add(Calendar.DATE, offset);
		return calendar.getTime();
	}

	public static Date getOtherMonth(Date now, int offset) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.MONTH, offset);
		return calendar.getTime();
	}

	/**
	 * Get the date without hours, ministe or seconeds
	 * 
	 * @param date
	 *            The date object
	 * @return The date object
	 */
	@SuppressWarnings("deprecation")
	public static Date getDay(Date date) {
		Date tempDate = date;
		tempDate.setHours(0);
		tempDate.setMinutes(0);
		tempDate.setSeconds(0);
		return tempDate;
	}

//	@SuppressWarnings("unchecked")
	public static SimpleDateFormat getSDF(String style) {
//		Object obj = hsSDF.get(style);
//		if (obj != null)
//			return (SimpleDateFormat) obj;
		SimpleDateFormat sdf = new SimpleDateFormat(style);
		sdf.setLenient(false);
//		hsSDF.put(style, sdf);
		return sdf;
	}

	public static boolean verifyDate(String dateStr) {
		boolean result = false;
		int year = 0;
		int month = 0;
		int day = 0;
		try {
			year = Integer.parseInt(dateStr.substring(0, 4));
			month = Integer.parseInt(dateStr.substring(4, 6));
			day = Integer.parseInt(dateStr.substring(6, 8));
		} catch (Exception e) {
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 0 && day < 32)
				result = true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 0 && day < 31)
				result = true;
			break;
		case 2:
			if (day > 0 && day < 29 || (day == 29 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0))) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * String 转换成 Dagte
	 * 
	 * 2005-12-01
	 * 
	 * @param startDayStr
	 * @return
	 * @author gangma
	 */
	public static Date splitString2Date(String startDayStr) {

		// 转换格式 2006-02-13
		if (startDayStr.length() == 10) {
			String[] day3 = new String[3];
			String[] item1 = startDayStr.split("-");

			day3[0] = item1[0];
			day3[1] = item1[1];
			day3[2] = item1[2];
			Calendar createTime = new GregorianCalendar(Integer.parseInt(day3[0].trim()), Integer.parseInt(day3[1].trim()) - 1,
					Integer.parseInt(day3[2].trim()));
			return createTime.getTime();
		} else {
			String[] day = new String[6];
			// 转换格式 20060213125631
			if (startDayStr.length() == 14) {

				day[0] = startDayStr.substring(0, 4);
				day[1] = startDayStr.substring(4, 6);
				day[2] = startDayStr.substring(6, 8);
				day[3] = startDayStr.substring(8, 10);
				day[4] = startDayStr.substring(10, 12);
				day[5] = startDayStr.substring(12, 14);

				// 转换格式2006-02-13 12:56:31
			} else if (startDayStr.length() == 19) {

				String[] item = startDayStr.trim().split(" ");
				String[] item1 = item[0].split("-");
				String[] item2 = item[1].split(":");
				day[0] = item1[0];
				day[1] = item1[1];
				day[2] = item1[2];
				day[3] = item2[0];
				day[4] = item2[1];
				day[5] = item2[2];
				// 2006-02-14 12:37:43.0
			} else if (startDayStr.length() == 21) {
				String[] item = startDayStr.trim().split(" ");
				String[] item1 = item[0].split("-");
				String[] item2 = item[1].split(":");
				day[0] = item1[0];
				day[1] = item1[1];
				day[2] = item1[2];
				day[3] = item2[0];
				day[4] = item2[1];

				day[5] = item2[2];
			} else {
				throw new IllegalArgumentException("DayStr format is not right.");

			}

			Calendar createTime = new GregorianCalendar(Integer.parseInt(day[0].trim()), Integer.parseInt(day[1].trim()) - 1, Integer.parseInt(day[2].trim()),
					Integer.parseInt(day[3].trim()), Integer.parseInt(day[4].trim()), new Double(day[5].trim()).intValue());
			return createTime.getTime();
		}

	}

	/**
	 * 判断日期是不是今天
	 * 
	 * @param d
	 * @return
	 */

	public static boolean isToday(Date d) {
		long t1 = System.nanoTime();
		Calendar aCalendar = Calendar.getInstance();
		int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
		int year1 = aCalendar.get(Calendar.YEAR);
		aCalendar.setTime(d);
		int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
		int year2 = aCalendar.get(Calendar.YEAR);
		long t2 = System.nanoTime();
		return (year2 == year1 && day1 == day2);
	}

	/* ------------------------------ FIELDS -------------------------------- */
	/* --------------------------- CONSTRUTORS ------------------------------ */
	/* ----------------------------- METHODS -------------------------------- */
	public static long hour(long mil) {
		return mil / (1000 * 60 * 60);
	}

	public static long day(long mil) {
		return (long) Math.ceil(mil / (1000 * 60 * 60 * 24.0));
	}

	public static Date addDay(Date d, int day) {
		if (d == null)
			return null;
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.add(Calendar.DAY_OF_MONTH, day);
		return now.getTime();
	}

	public static Date addMonth(Date d, int hour) {
		if (d == null)
			return null;
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.add(Calendar.MONTH, hour);
		return now.getTime();
	}

	public static Date addHour(Date d, int day) {
		if (d == null)
			return null;
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.add(Calendar.HOUR, day);
		return now.getTime();
	}

	public static Date stringToDate(String dateStr, String formatStr) {
		if (dateStr == null || dateStr.trim().length() <= 0 || formatStr == null || formatStr.trim().length() <= 0) {
			return null;
		}
		DateFormat format = null;
		Date result = null;
		try {
			format = new SimpleDateFormat(formatStr);
			result = format.parse(dateStr);
		} catch (Exception e) {
			return null;
		}
		return result;
	}

	public static String dateToString(Date d, String formatStr) {
		if (d == null || formatStr.trim().length() <= 0) {
			return null;
		}
		DateFormat format = null;
		String result = null;
		try {
			format = new SimpleDateFormat(formatStr);
			result = format.format(d);
		} catch (Exception e) {
			return null;
		}
		return result;
	}

	public static boolean isFormated(String d, String formatStr) {
		if (d == null || d.trim().length() <= 0 || formatStr == null || formatStr.trim().length() <= 0) {
			return false;
		}
		DateFormat format = null;
		try {
			format = new SimpleDateFormat(formatStr);
			Date result = format.parse(d);
			if (result == null)
				return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/*
	 * @author Johnbin Wang
	 */
	public static long DayCountFrom1970(Date d) {
		if (d == null)
			return 0L;
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long l = c.getTimeInMillis();
		long dayinMiliSecond = 24 * 3600 * 1000;
		l = l / dayinMiliSecond;
		return l;
	}

	/*
	 * 返回今天的日期
	 */
	public static Date getNowDate() {
		Date d = new Date();
		String str = dateToString(d, "yyyy-MM-dd");
		if (str != null && str.length() > 0) {
			d = stringToDate(str, "yyyy-MM-dd");
		}
		return d;
	}

	public static Date longToDate(Long time) {
		if (time != null) {
			Date date = new Date();
			date.setTime(time);

			return date;
		} else {
			return null;
		}
	}

	public static String longToString(Long time, String pattern) {
		if (time != null) {
			return dateToString(longToDate(time), pattern);
		} else {
			return null;
		}
	}

	public static Long dateToLong(Date date) {
		if (date != null) {
			return date.getTime();
		} else {
			return null;
		}
	}

	public static int getCurrentMonthMaxDay(String yyyyMM) throws java.text.ParseException {
		String strDate = yyyyMM;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = new GregorianCalendar();
		Date date = sdf.parse(strDate);
		calendar.setTime(date);
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}
	
	/**
	 * 获取前几天的日期字符串
	 * 
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public static String getPriorDayDateStr(int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DATE, date.get(Calendar.DATE) - num);
		String beforeDate = dft.format(date.getTime());
		return beforeDate;
	}

	public static String getPriorDayDateStr(String cDate, int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		try {
			date.setTime(getFormatDateOnDay(cDate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		date.set(Calendar.DATE, date.get(Calendar.DATE) - num);
		String beforeDate = dft.format(date.getTime());
		return beforeDate;
	}
	
	/**
	 * 转换字符串为日期
	 * 
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public static Date getFormatDateOnDay(String s) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.parse(s);
	}

	/**
	 * 转换字符串为日期,精确到时分秒
	 * 
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public static Date getFormatDateOnDay(String s, String format) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.parse(s);
	}

	/*
	 * 转换为中文日期
	 */
	public static String getFormatZHDay(String s) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat sf = new SimpleDateFormat();
		sf.applyPattern("yyyy\u5E74MM\u6708dd\u65E5");
		return sf.format(date);
	}

	/**
	 * 转换字符串为日期和时间
	 * 
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public static Date getFormatDateOnDayAndTime(String s) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return simpleDateFormat.parse(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 转换时间字符串为日期和时间
	 * 
	 * @param s
	 * @return
	 */
	public static Date getFormatTime(String s) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
			return simpleDateFormat.parse(s);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取前几天的日期
	 * 
	 * @param num
	 * @return
	 */
	public static Date getPriorDayDate(int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DATE, date.get(Calendar.DATE) - num);
		String beforeDate = dft.format(date.getTime()) + " 00:00:00";
		Date fdate = null;
		try {
			fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(beforeDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fdate;
	}

	public static Date getPriorDayLastTime(int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DATE, date.get(Calendar.DATE) - num);
		String beforeDate = dft.format(date.getTime()) + " 23:59:59";
		Date fdate = null;
		try {
			fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(beforeDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fdate;
	}

	/**
	 * 获取后几天的日期
	 * 
	 * @param num
	 * @return
	 */
	public static Date getNextSecondDate(int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar date = Calendar.getInstance();
		date.set(Calendar.SECOND, date.get(Calendar.SECOND) + num);
		Date ndate = null;
		try {
			ndate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(dft.format(date.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ndate;
	}

	/**
	 * 获取后几天的日期
	 * 
	 * @param num
	 * @return
	 */
	public static Date getNextDayDate(int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DATE, date.get(Calendar.DATE) + num);
		String nextDate = dft.format(date.getTime()) + " 00:00:00";
		Date ndate = null;
		try {
			ndate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(nextDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ndate;
	}

	/**
	 * 获取后几天的日期
	 * 
	 * @param num
	 * @return
	 */
	public static Date getNextDayDate(Date cDate, int num) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		try {
			date.setTime(cDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		date.set(Calendar.DATE, date.get(Calendar.DATE) + num);
		String nextDate = dft.format(date.getTime()) + " 00:00:00";
		Date ndate = null;
		try {
			ndate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(nextDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ndate;
	}

	/**
	 * 获取今年第一天的日期
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Date getCurYearFristDate() throws Exception {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar date = Calendar.getInstance();
		String beforeDate = date.get(Calendar.YEAR) + "-01-01 00:00:00";
		return dft.parse(beforeDate);
	}

	public static void main(String[] args) {
//		System.out.println(isFormated("1987-1s1-02", "yyyy-MM-dd"));
//		System.out.println(System.currentTimeMillis());
		System.out.println(dateToString(new Date(1416567210885L), "yyyy-MM-dd HH:mm:ss"));
	}

}