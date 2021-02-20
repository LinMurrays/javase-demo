package com.javase.threadTest.interrupt_join_yield;

public class YieldDemo {
    public static void main(String[] args) {
        /*
         * 创建2个线程对象，并发执行
         * 在线程A过程中某个时刻，调用yield()
         * */
        Thread th1 = new Thread("线程A") {
            @Override
            public void run() {
                for(int i=1;i<=30;i++) {
                    System.out.println(Thread.currentThread().getName()+"--"+i);
                    if(i==25) {
                        //???
                        Thread.yield();
                    }
                }
            }
        };
        Thread th2 = new Thread("线程B") {
            @Override
            public void run() {
                for(int i= 1;i<=30;i++) {
                    System.out.println(Thread.currentThread().getName()+"-"+i);
                }
            }
        };
        th1.start();
        th2.start();
    }
}
