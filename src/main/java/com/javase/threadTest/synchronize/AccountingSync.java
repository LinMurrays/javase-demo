package com.javase.threadTest.synchronize;

/**
 * synchronized 修饰实例方法,作用于当前实例加锁，进入同步代码前要获得当前实例的锁
 */
public class AccountingSync implements Runnable {
    //共享资源(临界资源)
    static int i = 0;

    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance = new AccountingSync();//同一个实例
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
    /**
     * 输出结果:
     * 2000000
     */
}
