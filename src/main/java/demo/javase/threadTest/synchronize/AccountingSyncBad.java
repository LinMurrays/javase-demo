package demo.javase.threadTest.synchronize;
/**
 * synchronized 修饰实例方法，作用于当前实例加锁，进入同步代码前要获得当前实例的锁
 */
public class AccountingSyncBad implements Runnable {
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
    //new新实例，分别在访问两个实例的方法，没有起到锁的作用
        Thread t1 = new Thread(new AccountingSyncBad());
    //new新实例
        Thread t2 = new Thread(new AccountingSyncBad());
        t1.start();
        t2.start();
//join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
