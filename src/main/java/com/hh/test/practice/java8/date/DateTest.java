package com.hh.test.practice.java8.date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/31 15:24
 */
public class DateTest {

    public static void main(String[] args) {
        // 先简单测试
        // simpleTest();
        // 测试localDate
        // testLocalDate();
        // 测试localDateTime
        // testLocalDateTime();
        // 测试工具类
        // testUtils();
        // 解析和格式化
        // testFormat();
        // Date转换为LocalDateTime
        dateToLocalDateTime();
        // LocalDateTime 转成Date
        localDateTimeToDate();

    }

    public static void localDateTimeToDate(){
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);

        Date date = Date.from(zdt.toInstant());
        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Date = " + date);
    }

    public static void dateToLocalDateTime(){
        Date date = new Date();
        Instant instant = date.toInstant();

        System.out.println("instant = " + instant);
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println("Date = " + date);
        System.out.println("LocalDateTime = " + localDateTime);

    }

    public static void testFormat(){
        // Format examples
        LocalDate date = LocalDate.now();
        // default format
        System.out.println("Default format of LocalDate=" + date);

        // 格式化Date
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        // 20190731
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        // 格式化日期和时间
        LocalDateTime dateTime = LocalDateTime.now();
        // default format
        System.out.println("Default format of LocalDateTime=" + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        // 解析
        LocalDateTime dateTime2 = LocalDateTime.parse("2017-05-21 12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Default format after parsing = " + dateTime2);

    }

    public static void testUtils(){
        LocalDate today = LocalDate.now();

        // Get the Year, check if it's leap year
        System.out.println("year = " + today.getYear() + "is leap Year? " + today.isLeapYear());

        // Compare two LocalDate for before and after
        System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015,1,1)));

        // Create LocalDateTime from LocalDate
        System.out.println("Current Time=" + today.atTime(LocalTime.now()));

        // 加减操作
        System.out.println("40 days after today will be " + today.plusDays(40));
        System.out.println("3 weeks after today will be " + today.plusWeeks(3));
        System.out.println("20 months after today will be " + today.plusMonths(20));

        System.out.println("40 days before today will be " + today.minusDays(40));
    }

    public static void testLocalDateTime(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime=" + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime=" + today);

    }

    public static void testLocalDate(){
        // 通过传入的参数创建LocalDate对象
        LocalDate firstDayOf2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("指定日期=" + firstDayOf2014);
        // 获取不同时区的日期 "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolKata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("当前印度标准日期=" + todayKolKata);
        // 从基准日期获取日期  例如： 01/01/1970
        LocalDate dataFromBase = LocalDate.ofEpochDay(365);
        System.out.println("基准日期的第365天= " + dataFromBase);
        // 2014年的第100天
        LocalDate hundredDay = LocalDate.ofYearDay(2014, 100);
        System.out.println("2014年的第一百天=" + hundredDay);
    }

    public static void simpleTest() {
        // 时间戳
        Instant instant = Instant.now();
        System.out.println(" instant表示 " + instant);
        // 日期
        LocalDate localDate = LocalDate.now();
        System.out.println(" localDate " + localDate);
        // 时间
        LocalTime localTime = LocalTime.now();
        System.out.println(" localTime " + localTime);
        // 日期和时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(" localDateTime " + localDateTime);

    }
}
