package com.boc.database.javase.threadTest.synchronize;

/**
 * synchronized同步代码块
 * 从代码看出，将synchronized作用于一个给定的实例对象instance，即当前实例对象就是锁对象，
 * 每次当线程进入synchronized包裹的代码块时就会要求当前线程持有instance实例对象锁，
 * 如果当前有其他线程正持有该对象锁，那么新到的线程就必须等待，这样也就保证了每次只有一个线程执行i++;操作。
 */
public class AccountingDaiMaKuai implements Runnable {
    static AccountingDaiMaKuai instance = new AccountingDaiMaKuai();
    static int i = 0;

    @Override
    public void run() {
//省略其他耗时操作....
//使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized (instance) {
            for (int j = 0; j < 1000000; j++) {
                i++;
            }
        }

        //this,当前实例对象锁
//        synchronized(this){
//            for(int j=0;j<1000000;j++){
//                i++;
//            }
//        }

        //class对象锁
//        synchronized(AccountingSync.class){
//            for(int j=0;j<1000000;j++){
//                i++;
//            }
//        }
    }

    //上面是三种方法的结果是一样的，都起到锁的作用，不过锁的对象不一样。
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
