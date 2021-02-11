package com.boc.database.javase.API.lamba;

public class Lambda {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void test(int a) {
                System.out.println(a);
            }
        };
        foo.test(3);
        /*
         * 用Lambad表达式实现Foo接口
         * 并调用重写后的test方法
         * ()->{}
         */
        Foo foos = (int a) -> {
            System.out.println(a);
        };
        foos.test(3);

        Foo fooss = (a) -> {
            System.out.println(a);
        };
        fooss.test(3);// 1.     参数类型可以省略
        Foo foosss = a -> {
            System.out.println(a);
        };
        foosss.test(3);// 2.     如果只有一个参数，（）可以省略

        Goo g1 = (a, b) -> a - b;//()不可以省略。 如果方法体只有一行语句，那么{}可以省                                                          //略，如果是return语句，可以一起省略
    }
}
