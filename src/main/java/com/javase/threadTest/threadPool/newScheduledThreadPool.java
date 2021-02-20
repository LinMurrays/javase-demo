package com.javase.threadTest.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newScheduledThreadPool 创建一个固定长度线程池，支持定时及周期性任务执行。
 */
public class newScheduledThreadPool {
    public static void main(String[] args) {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            /*singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("newSingleThreadExecutor: " + index);
                        Thread.sleep(2*1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });*/


            singleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("newSingleThreadExecutor: " + index);
                        Thread.sleep(2*1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        singleThreadExecutor.shutdown();
    }

}
