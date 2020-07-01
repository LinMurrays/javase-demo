package springdemo02.javase.threadTest.synchronize;

/**
 * synchronized作用于静态方法（实例对象和类对象是不同的),当synchronized作用于静态方法时，其锁就是当前类的class对象锁
 * 由于静态成员不专属于任何一个实例对象，是类成员，因此通过class对象锁可以控制静态 成员的并发操作。
 */
public class AccountingSyncClass implements Runnable {
    static int i = 0;
    /**
     * 作用于静态方法,锁是当前class对象,也就是
     * AccountingSyncClass类对应的class对象
     */
    public static synchronized void increase() {
        i++;
    }
    /**
     * 非静态,访问时锁不一样不会发生互斥
     */
    public synchronized void increase4Obj() {
        i++;
    }
    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
//new新实例
        Thread t1 = new Thread(new AccountingSyncClass());
//new心事了
        Thread t2 = new Thread(new AccountingSyncClass());
//启动线程
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
