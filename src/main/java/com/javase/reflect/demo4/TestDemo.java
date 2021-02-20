package com.javase.reflect.demo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获取class

        Class cls = Class.forName("com.javase.reflect.demo4.StudentComponent");
        //实例化对象
        Object obj = cls.newInstance();

        //获取具体方法
        Method m1 = cls.getMethod("method1");
        //调用方法，传参
        m1.invoke(obj, new Object[]{"李白"});
    }
}
