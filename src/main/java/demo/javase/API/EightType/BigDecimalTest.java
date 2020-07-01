package demo.javase.API.EightType;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println("输入两个浮点数：");
        double d1 = new Scanner(System.in).nextDouble();
        double d2 = new Scanner(System.in).nextDouble();
        System.out.println(d1 + d2);
        System.out.println(d1 - d2);
        System.out.println(d1 * d2);
        System.out.println(d1 / d2);
        //返回BigDecimal。
        BigDecimal a = BigDecimal.valueOf(d1);
        BigDecimal b = BigDecimal.valueOf(d2);
        BigDecimal c;
        c = a.add(b);
        System.out.println(c.doubleValue());
        //doubleValue()此方法返回此BigDecimal转换为double的值

        c = a.subtract(b);
        System.out.println(c);
        System.out.println(c.doubleValue());

        c = a.multiply(b);
        System.out.println(c.doubleValue());

        //c=a.divide(b);//报错，不支持无限小数，所以在后面要加上50位小数限制

        c = a.divide(b, 50, BigDecimal.ROUND_HALF_UP);
        //保留50位小数，四舍五入

        System.out.println(c.doubleValue());
        //double 小数位最长16位

        System.out.println(c.toString());
        //字符串没有限制
    }
}
