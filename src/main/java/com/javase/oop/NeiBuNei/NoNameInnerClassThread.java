package com.javase.oop.NeiBuNei;

public class NoNameInnerClassThread {
    public static void main(String[] args) {
        //执行两个任务，并发执行
        //创建两个线程对象并且启动。（匿名内部类）
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                }
            }
        };
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                }
            }
        };

        //一个thread执行一个线程
        thread1.start();
        //任务与线程实现了动态绑定。一个thread对象可以执行多个任务
        Thread thread2 = new Thread(task);
        thread2.start();
    }
}
