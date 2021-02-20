package com.javase.API.EightType.integer;

public class IntegerDemo {

    public static void main(String[] args) {
        test1();
        test3();
        test4();
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

    static void test3() {
        Integer f1 = 100;
        Integer f2 = 100;
        Integer f3 = 150;
        Integer f4 = 150;
        Integer f5 = 3;
        Integer f6 = 3;
        Integer f7 = new Integer(100);
        Integer f8 = Integer.valueOf(100);

//        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2); //true
        System.out.println(f3 == f4); //false
        System.out.println(f5 == f6); //false
        System.out.println(f1 == f7);//false
        System.out.println(f1 == f8);//true 缓存
        System.out.println("--");
    }

    /**
     * Interger 赋予的int数值在-128 - 127的时候，直接从cache中获取，
     * 这些cache引用对Integer对象地址是不变的，但是不在这个范围内的数字，
     * 则new Integer(i) 这个地址是新的地址，不可能一样的
     */

    static void test4() {
        Integer a = new Integer(3);
        Integer b = 3;//自动装箱过程
        int c = 3;//而int c=3由于int是基本类型，所以不存在引用问题，直接由编译器将其存放在栈中，换一句话说，c本身就是3
        System.out.println("------");
        System.out.println(a == b);//false
        /**
         * Integer b = 3; 自动调用Integer.valueOf(3) 返回一个Integer的对象。
         * 这个对象存放到cache中的（上面一段代码分析）。
         * 而 Integer a = new Integer(3);这里创建了一个新的对象Integer 所以 a == b 返回的是false
         */
        System.out.println(a == c);//true
        /**
         * 因为等号一边存在基本类型所以编译器后会把另一边的Integer对象拆箱成int型，这时等号两边比较的就是数值大小，所以是true。
         * 一个Integer 与 int比较，先将Integer转换成int类型，再做值比较，所以返回的是true。
         */
    }
}
