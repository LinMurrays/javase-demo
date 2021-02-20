package com.javase.threadTest.interrupt_join_yield;

//Thread.currentThread()  是指获取当前运行的线程对象

/**
 * interrupt_join_yield():唤醒线程线程调用此方法，
 * 如果当前线程是运行状态，此方法无效。
 * 如果当前线程是阻塞状态，此方法才有效,且抛出的异常需要处理
 */
public class InterruptDemo {
    /*
     * 创建下载线程，耗时5s,下载过程中若被中断
     * 那么下载失败
     */
    public static void main(String[] args) {
        Thread download = new Thread() {
            @Override//这个方法有可能成功有可能不成功，因为两个线程是否阻塞不确定，无序，只有当线程是阻塞状态interrupt才生效
            public void run() {
                System.out.println("开始下载");
                try {
                    Thread.sleep(5000);
                }catch(InterruptedException e) {
                    System.out.println("下载失败");
                    //抛出下载失败异常
                    //e.printStackTrace();
                    throw new NullPointerException();
                }
                System.out.println("下载成功");
            }
        };

        Thread download2 = new Thread() {
            @Override
            public void run() {
                System.out.println("开始任务！");
                //中断download线程
                download.interrupt();
                System.out.println("任务结束");
            }
        };
        download2.start();
        download.start();
    }
}
