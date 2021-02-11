package com.boc.database.javase.SheJiMoShi.factory.demo2;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static Singleton instance;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            //获取无参构造方法
            Constructor constructor = clazz.getDeclaredConstructor();
            //设置无参构造方法可访问
            constructor.setAccessible(true);
            //产生一个实例对象
            instance = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
