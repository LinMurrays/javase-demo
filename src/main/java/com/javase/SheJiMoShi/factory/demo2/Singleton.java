package com.javase.SheJiMoShi.factory.demo2;

public class Singleton {

    /**
     * Singleton类定义了一个private的无参构造方法，目的是不允许通过new的方式创建对象，
     * 另外，Singleton类也不自己定义一个Singleton对象了，因为它要通过工厂来获得。
     */
    private Singleton() {
    }

    public void doSomething() {
        System.out.println("Singleton");
    }
}
