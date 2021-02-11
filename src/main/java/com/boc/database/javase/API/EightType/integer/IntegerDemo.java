package com.boc.database.javase.API.EightType.integer;

public class IntegerDemo {

    public static void main(String[] args) {
        test1();
    }

    /**
     * 基本类型通过==比较的是他们的值大小，而引用类型比较的是他们的引用地址
     */
    static void test1() {
        Integer a1 = 58;
        int a2 = 58;
        Integer a3 = Integer.valueOf(58);
        Integer a4 = new Integer(58);
        System.out.println(a1 == a2);//true
        System.out.println(a1 == a3);//true
        System.out.println(a1 == a4);//false
        System.out.println("-----");
        System.out.println(a2 == a3);//true
        System.out.println(a2 == a4);//true
        System.out.println("-----");
        System.out.println(a3 == a4);//false
    }

    static void test2() {
        //在Java SE5之前，如果要生成一个数值为10的Integer对象，必须这样进行：
        //Integer i = new Integer(10);
        //自动装箱
        Integer i = 10;
    }

}
