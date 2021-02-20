package com.javase.oop;

public class MyClass implements MyInterFace {
    //int counter = 20;继承的接口所隐藏的变量
    private static int counter;

    int a ;

    /**
     * 本题考查子类访问父类被隐藏的成员变量和++运算符子类中，如果有变量与父类相同，
     * 父类的成员变量将被隐藏，
     * 如果子类还想访问父类的被隐藏的成员变量，必须使用super关键字，本程序中，没有使用super，
     * 因此，counter的值是0变量前使用++运算符，变量先自增1，再做其他运算，输出结果是1;
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(++counter);//1
        System.out.println(MyInterFace.counter);//20
        //System.out.println(a);//因为main是static修饰的静态方法，只能访问静态变量，所以你可以用static修饰变量a，不是静态就错了
    }
}
