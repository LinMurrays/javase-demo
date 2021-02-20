package com.javase.API.EightType.integer;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = Integer.valueOf(5);//创建对象，缓存对象
        Integer c = Integer.valueOf(5);
        //[-127,-128]在此范围直接返回，不然就直接创建对象。返回值对象
        System.out.println("--");
        System.out.println(a == b);//false
        System.out.println(b == c);//true
        System.out.println(a.equals(b));//true，
        //Integer类重写了equals方法

        //取值,以byte类型返回a的值,返回值是值
        System.out.println(a.byteValue());//5
        System.out.println(a.shortValue());//5
        System.out.println(a.intValue());//5
        System.out.println(a.longValue());//5
        System.out.println(a.floatValue());//5
        System.out.println(a.doubleValue());//5

        System.out.println(Integer.parseInt("255"));//255
        System.out.println(Integer.parseInt("11111111", 2));//255
        System.out.println(Integer.parseInt("377", 8));//255
        System.out.println(Integer.parseInt("ff", 16));//255
        //提取字符串16进制变成10进制

        System.out.println(Integer.toBinaryString(255));//11111111
        System.out.println(Integer.toOctalString(255));//377
        System.out.println(Integer.toHexString(255));//ff
        //此方法返回int变量的二进制表示的字符串，八进制，十六进制
    }
}
