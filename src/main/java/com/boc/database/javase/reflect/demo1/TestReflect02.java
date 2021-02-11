package com.boc.database.javase.reflect.demo1;

import java.lang.reflect.Constructor;

public class TestReflect02 {
    public static void main(String[] args)
            throws Exception {
        //1.获取类对象
        Class<?> c = Class.forName("com.boc.database.javase.reflect.demo1.HelloService");
        //2.获取构造方法对象
        Constructor<?> con = c.getDeclaredConstructor();
        //3.构建类的实例
        if (!con.isAccessible()) {
            //假如构造方法私有,则设置可访问
            con.setAccessible(true);
        }
        Object hService = con.newInstance();
        //4.调用实例方法
        ((HelloService) hService).sayHello();
    }
}
