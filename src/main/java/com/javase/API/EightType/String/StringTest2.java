package com.javase.API.EightType.String;

public class StringTest2 {
    static String str = new String("tedu");

    static char[] ch = {'x', 'y', 'z'};

    public static void main(String args[]) {
        StringTest2 t = new StringTest2();
        change(str, ch);
        System.out.println(str + "and");
        System.out.println(ch);

        String a = "oldA";
        a = "newA";
        System.out.println(a);//newA
        //a是改变了值，但是str并没有改变值
    }

    public static void change(String str, char ch[]) {
        str = "tarena";
        ch[0] = 'w';
        System.out.println("change" + str);
        /**
         * 改变的是change里面方法的参数的值，但是并没有改变传进来的str对象指向对象的值
         */
    }
}
//teduandwyz
//从上面的代码可知道，str是String类的一个对象，str在调用change方法后，并没有产生值的改变，
// 原因是String类的源码里面有final修饰符，String类在调用方法后值并没有产生改变，而数组则可以产生改变。
