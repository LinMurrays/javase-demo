package demo.javase.API.EightType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) {

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

    void test2() throws ParseException {
        //形如“2015-08-31 21:08:06”等格式化string类型转换成java.util.Date类型
        String str = "2015-08-31 21:08:06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = (Date) sdf.parse(str);
        System.out.println(date.getTime());
    }

    void test3() throws ParseException {
        String str = "Wed Sep 16 11:26:23 CST 2009";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = (Date) sdf.parse(str);

    }
}
