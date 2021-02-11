package com.boc.database.javase.reflect.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 1)概念:Java中一种特殊的类
 * 2)作用:描述类,属性,方法等对象
 */
@Retention(RetentionPolicy.RUNTIME)//何时有效
@Target(ElementType.TYPE)
//应用目标
@interface ComponentScans {//注解,ComponentScan.class

    String value();//属性
}