package com.hh.test.practice.java8;

import java.time.*;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 15:51
 */
public class DateTest {

    public static void main(String[] args) {
        DateTest test = new DateTest();
        test.testLocalTime();
        test.testZonedDateTime();

    }

    public void testLocalTime(){
        // 获取当前时间：2019-01-31T15:59:06.943
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        // 获取当前日期：date1: 2019-01-31
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        // 获取月、日、秒
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        // 通过LocalDateTime设置指定的日和年
        LocalDateTime date2 = currentTime.withDayOfMonth(1).withYear(2015);
        System.out.println("date2: " + date2);

        // 通过LocalDate设置日期
        LocalDate date3 = LocalDate.of(2015, Month.DECEMBER, 25);
        System.out.println("date3: " + date3);

        // 通过LocalTime设置时间
        LocalTime date4 = LocalTime.of(13, 20,20);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("16:04:02");
        System.out.println("date5: " + date5);

    }

    public void testZonedDateTime(){
        // 获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);

    }
}
