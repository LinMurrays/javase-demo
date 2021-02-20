package com.javase.reflect.demo3;

/**
 * 通过反射获取注解
 */
public class TestReflect03 {
    public static void main(String[] args) {
        //通过反射获取AppConfig类上定义的注解
        Class<?> c = AppConfig.class;
        //判定类上是否有ComponentScan注解
        boolean flag = c.isAnnotationPresent(ComponentScans.class);
        if (flag) {
            //获取注解对象
            ComponentScans cs = c.getAnnotation(ComponentScans.class);
            //获取注解对应的value值.
            String s = cs.value();
            System.out.println(s);
            //..........
            String dir = s.replace(".", "/");
            System.out.println(dir);
        }
    }
}
