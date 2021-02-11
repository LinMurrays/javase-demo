package com.boc.database.javase.threadTest;

public class NoNameInnerClassThread {
    /**
     * run()相当于线程的任务处理逻辑的入口方法，它由Java虚拟机在运行相应线程时直接调用，而不是由应用代码进行调用
     * 而start()的作用是启动相应的线程。启动一个线程实际是请求Java虚拟机运行相应的线程，
     * 而这个线程何时能够运行是由线程调度器决定的。start()调用结束并不表示相应线程已经开始运行，
     * 这个线程可能稍后运行，也可能永远也不会运行。
     */
    public static void main(String[] args) {
        //执行两个任务，并发执行
        //创建两个线程对象并启动 - 匿名内部类
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行任务1");
                }
            }
        };

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行任务2");
                }
            }
        };

        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

    }
}
