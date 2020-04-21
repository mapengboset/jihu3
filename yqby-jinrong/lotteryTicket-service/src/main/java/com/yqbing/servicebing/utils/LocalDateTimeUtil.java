package com.yqbing.servicebing.utils;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeUtil {

    public static void main(String[] args) {
        LocalDateTime startTime = strToLocalTime("2019-10-20 01:23:12");
        LocalDateTime entTime = strToLocalTime("2019-10-28 01:10:12");
        int dayNumber = dayNumber(startTime,entTime);
        System.out.println(dayNumber);


        System.out.println(LocalDateTime.now().format(df));
    }

    public static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public static DateTimeFormatter dfyMd = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static LocalDateTime strToLocalTime(String dateStr){
        try{
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return LocalDateTime.parse(dateStr,df);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String strToLocalDay(String dateStr){
        try{
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(dateStr,df);
            DateTimeFormatter dfs = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return localDateTime.format(dfs);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public static LocalDateTime strToLocalMinute(String dateStr){
        try{
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            return LocalDateTime.parse(dateStr,df);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 计算两个时间相差天数
     * @param startTime
     * @param endTime
     * @return
     */
    public static int dayNumber(LocalDateTime startTime, LocalDateTime endTime){
        Duration duration = Duration.between(startTime,endTime);
        long days = duration.toDays(); //相差的天数
        return Long.valueOf(days).intValue();
    }

    /**
     * 当前时间减去天数后的日期
     * @param dayNumber
     * @return
     */
    public static LocalDate difference(int dayNumber){
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.getHour();
        return localDateTime.plusDays(dayNumber).toLocalDate();
    }

    /**
     * LocalDateTime转换为Date
     * @param localDateTime
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime){
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        Date date = Date.from(zdt.toInstant());
        return date;
    }

}
