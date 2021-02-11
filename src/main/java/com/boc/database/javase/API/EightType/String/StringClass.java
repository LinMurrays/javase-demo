package com.boc.database.javase.API.EightType.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringClass {
    public static void main(String[] args) {
        /**
         * String转基本数据类型通过基本类型对应的封装类
         */
        String s = String.valueOf("a");
        System.out.println(s);

        String a = String.valueOf(1);
        System.out.println(a);

        String b = Integer.toString(123);
        System.out.println(b);


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.format(date);

        subStrings();

        /**
         *
         * 简单一点说，装箱就是自动将基本数据类型转换为包装器类型；
         * 拆箱就是自动将包装器类型转换为基本数据类型。
         */
        //自动装箱
        Integer total = 99; //Integer total = Integer.valueOf(99);
        //自动拆箱
        int totalprim = total;//int totalprim = total.intValue();

        indexOfTest();
        lastIndexOfTest();
    }


    void test1() {
        String str = "abc";
        //上面的写法其实等效于下面的写法
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);
    }

    void test2() {
        String s = "abc";
        String s2 = new String("abc");
/**
 * 第一种先在栈中创建一个对String类的对象引用变量s，然后去查找"abc"是否被保存在字符串常量池中，
 * 如果没有则在栈中创建三个char型的值'a'、'b'、'c'，然后在堆中创建一个String对象object，
 * 它的值是刚才在栈中创建的三个char型值组成的数组{'a'、'b'、'c'}，
 * 接着这个String对象object被存放进字符串常量池，最后将s指向这个对象的地址，
 * 如果"abc"已经被保存在字符串常量池中，则在字符串常量池中找到值为"abc"的对象object，然后将s指向这个对象的地址。cxxfvfcgvcx nbvcx
 *
 * 第一种特点：JVM会自动根据栈中数据的实际情况来决定是否有必要创建新对象。
 * 第二种可以分解成两步1、String object = "abc"; 2、String s = new String(object);
 * 第一步参考第一种创建方式，而第二步由于"abc"已经被创建并保存到字符串常量池中，因此jvm只会在堆中新创建一个String对象，
 * 它的值共享栈中已有的三个char型值。
 * 第二种特点：一概在堆中创建新对象，而不管其字符串值是否相等，是否有必要创建新对象。
 */
    }

    static void subStrings() {
        String e = "tom@12312";
        //提取一个字符串e中为@的下标
        int index = e.indexOf("@");

        //提取[0,index）范围的子串
        String n = e.substring(0, index);
        System.out.println(n);
    }

    /**
     * 返回指定索引处的字符。
     */
    static void charAtTest() {
        String s = "www.runoob.com";
        char result = s.charAt(8);
        System.out.println(result);
    }

    static void indexOfTest() {
        String string = "aaa456ac";
        //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.
        System.out.println(string.indexOf("b")); // indexOf(String str); 返回结果：-1，"b"不存在

        // 从第四个字符位置开始往后继续查找，包含当前位置
        System.out.println(string.indexOf("a", 3));//indexOf(String str, int fromIndex); 返回结果：6

        //（与之前的差别：上面的参数是 String 类型，下面的参数是 int 类型）参考数据：a-97,b-98,c-99

        // 从头开始查找是否存在指定的字符
        System.out.println(string.indexOf(99));//indexOf(int ch)；返回结果：7
        System.out.println(string.indexOf('c'));//indexOf(int ch)；返回结果：7

        //从fromIndex查找ch，这个是字符型变量，不是字符串。字符a对应的数字就是97。
        System.out.println(string.indexOf(97, 3));//indexOf(int ch, int fromIndex); 返回结果：6
        System.out.println(string.indexOf('a', 3));//indexOf(int ch, int fromIndex); 返回结果：6
    }

    static void lastIndexOfTest() {
        String Str = new String("菜鸟教程:www.runoob.com");
        String SubStr1 = new String("runoob");
        String SubStr2 = new String("com");

        System.out.print("查找字符 o 最后出现的位置 :");
        System.out.println(Str.lastIndexOf('o'));
        System.out.print("从第14个位置查找字符 o 最后出现的位置 :");
        System.out.println(Str.lastIndexOf('o', 14));
        System.out.print("子字符串 SubStr1 最后出现的位置:");
        System.out.println(Str.lastIndexOf(SubStr1));
        System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :");
        System.out.println(Str.lastIndexOf(SubStr1, 15));
        System.out.print("子字符串 SubStr2 最后出现的位置 :");
        System.out.println(Str.lastIndexOf(SubStr2));
    }
}
