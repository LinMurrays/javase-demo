package springdemo02.javase.threadTest.synchronize;

public class SynDemo {
    public static void main(String[] args) {
        /*
         * 创建两个线程并发访问同一个资源
         * 实现线程同步执行
         * synchronized修饰方式，本质是加锁
         * */
        Syn syn= new  Syn();//对象要放在外面，共用同一个对象，
        //因为加锁的是对象，如果放在方法体内
        //不是同一个对象，不能实现同步
        Thread th1 = new Thread("线程A") {
            @Override
            public void run() {
                syn.printInfo();
            }
        };
        Thread th2 = new Thread("线程B") {
            @Override
            public void run() {
                syn.printInfo();
            }
        };
        th1.start();
        th2.start();
    }
}
