package com.boc.database.javase.reflect.demo2;

import java.lang.reflect.Field;

public class TestReflect04 {
    public static void main(String[] args)
            throws Exception {
        //1.获取类对象
        Class<?> c = OpenDataSource.class;
        //2.获取url属性对象
        Field f = c.getDeclaredField("url");
        //3.获取属性上的注解
        boolean flag = f.isAnnotationPresent(Value.class);
        if (!flag) return;
        Value v = f.getAnnotation(Value.class);
        String value = v.value();
        System.out.println(value);
    }
}
