package com.javase.API.EightType.String;

public class StringEqualsDemo {
    public static void main(String[] args) {
        test1();
        test2();
    }

    static void test1() {
        int x = 10;
        int y = 10;
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(x == y); // 输出true
        System.out.println(str1 == str2); // 输出false
        System.out.println(str1.equals(str2));//true
        //==号在比较基本数据类型时比较的是值，而用==号比较两个对象时比较的是两个对象的地址值：
/**
 * equals()方法呢？我们可以通过查看源码知道，equals()方法存在于Object类中，因为Object类是所有类的直接或间接父类，
 * 也就是说所有的类中的equals()方法都继承自Object类，而通过源码我们发现，Object类中equals()方法底层依赖的是==号，
 * 那么，在所有没有重写equals()方法的类中，调用equals()方法其实和使用==号的效果一样，也是比较的地址值，
 * 然而，Java提供的所有类中，绝大多数类都重写了equals()方法，重写后的equals()方法一般都是比较两个对象的值：
 */
    }

    static void test2() {
        System.out.println("---");
        String str1 = "a";
        String str2 = "a";
        String str3 = new String("a");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false

        /**
         * 内存中的常量池，常量池属于方法区的一部分，当运行到str1创建对象时，如果常量池中没有，
         * 就在常量池中创建一个对象”a”,第二次创建的时候，就直接使用，所以两次创建的对象其实是同一个对象，它们的地址值相等
         *
         * 第三个例子这里其实创建了两次对象，依次是在常量池中创建了对象”a”，一次是在堆内存中创建了对象str3，所以str1和str3的地址值不相等。
         */
    }
}
