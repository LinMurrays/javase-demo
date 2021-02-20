package com.javase.API.EightType.date;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        //getInstance()不仅能获取当前的时间，还能指定需要获取的时间点
        Calendar c = Calendar.getInstance();
        System.out.println(c);
          /*java.util.GregorianCalendar
         [time=1520515224108,areFieldsSet=true,areAllFieldsSet=true,
         lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
         offset=28800000,dstSavings=0,useDaylight=false,transitions=19,
         lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
         YEAR=2018,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,
         DAY_OF_YEAR=67,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,
         HOUR_OF_DAY=21,MINUTE=20,SECOND=24,MILLISECOND=108,ZONE_OFFSET=28800000,
         DST_OFFSET=0]*/
        //Calendar的getInstance 方法返回一个 Calendar 对象
        //getTime方法返回一个Date对象，它表示此Calendar的时间值
        System.out.println(c.getTime());
        //Tue Feb 02 14:57:55 CST 2021
        System.out.println(c.get(Calendar.MONTH));
        /*calendar.get(Calendar.MONTH)月份是从0开始.设置是12 其实系统以为是1月,所以用0来表示1月，
        你如果想表示12月那就应该设置calendar.set(2011,11,31); 这样就会读出来是数字12
        年：calendar.get(Calendar.YEAR)
        月：calendar.get(Calendar.MONTH)+1
        日：calendar.get(Calendar.DAY_OF_MONTH)
        星期：calendar.get(Calendar.DAY_OF_WEEK)-1*/

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        //一周中的第几天
        System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
