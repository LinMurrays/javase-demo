package demo.javase.threadTest;

public class volatileTest {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    /**
     * volatile关键字能保证可见性没有错，但是上面的程序错在没能保证原子性。
     * 可见性只能保证每次读取的是最新的值，但是volatile没办法保证对变量的操作的原子性。
     * 所以值不能保证一定是10000
     * @param args
     */
    public static void main(String[] args) {
        final volatileTest test = new volatileTest();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}
/*
synchronized关键字是防止多个线程同时执行一段代码，那么就会很影响程序执行效率，
而volatile关键字在某些情况下性能要优于synchronized，但是要注意volatile关键字是无法替代synchronized关键字的，
因为volatile关键字无法保证操作的原子性。通常来说，使用volatile必须具备以下2个条件：
　　1）对变量的写操作不依赖于当前值
　　2）该变量没有包含在具有其他变量的不变式中
　　实际上，这些条件表明，可以被写入 volatile 变量的这些有效值独立于任何程序的状态，包括变量的当前状态。
　　事实上，我的理解就是上面的2个条件需要保证操作是原子性操作，才能保证使用volatile关键字的程序在并发时能够正确执行。
*/