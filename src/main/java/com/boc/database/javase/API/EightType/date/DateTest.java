package com.boc.database.javase.API.EightType.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        test1();
        System.out.println("----");
        test2();
        System.out.println("----");
        test3();
        System.out.println("-------");
        test4();

    }

    static void test1() {
        Date date = new Date();
        System.out.println(date.getTime());
        //获取毫秒值
        long mseconds = date.getTime() / 1000;

        //long类型转换成java.util.Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = new Date(mseconds * 1000);
        String str = sdf.format(date2);
        System.out.println(str);
    }

    static void test2() throws ParseException {
        //形如“2015-08-31 21:08:06”等格式化string类型转换成java.util.Date类型
        String str = "2015-08-31 21:08:06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = (Date) sdf.parse(str);
        System.out.println(date.getTime());
    }

    static void test3() throws ParseException {
        String str = "Wed Sep 16 11:26:23 CST 2009";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = (Date) sdf.parse(str);

    }

    static void test4() {
        Date a = new Date();
        //返回Thu Mar 08 14:40:59 CST 2018
        Date b = new Date(900000000000L);
        System.out.println(a.getTime());
        //1520491259701
        //date.getTime()所返回的是一个long型的毫秒数

        System.out.println(b.getTime());
        //900000000000

        //格林尼治时间
        a.setTime(0);
        System.out.println(a);
        //Thu Jan 01 08:00:00 CST 1970

        //SimpleDateFormat类可以理解为定义一种规范，格式
        SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String s1 = f.format(a);
        System.out.println(s1);
    }
}
