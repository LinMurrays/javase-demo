package com.javase.API.EightType.String;

public class StringTest {
    //对于string类，==比较地址值，equals比较内容
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        String s1 = new String(a);//堆内存分配空间
        String s2 = "hello";//常量池
        String s3 = "hello";//常量池，与s2相同，不重复创建

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s2 == s3);//true
        System.out.println(s2.equals(s3));//true
//        1.对于基础数据类型，使用“=="比较值是否相等；
//        2.对于复合数据类型（类），使用equals()和“==”效果是一样的，地址值两者比较的都是对象在内存中的存放地址（确切的说，是堆内存地址）。

//        3.对于String、Integer、Date等覆盖了equals()方法的类型，“==”比较的是存放的内存地址。而equals()的结果则由覆盖后的代码决定。

//        4.string类型中，equals()比较的是两字符串内容是否相同

//        基本类型与引用类类型在内存中存储的的方式是不同的；
//        基本类型类型在栈中存储的是值；
//        引用类类型在栈中存储的是地址，来指向堆内存的实例
    }
}
