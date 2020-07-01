package springdemo02.javase.threadTest.synchronize;

public class TestSynchronized {
    public void test1() {
        synchronized (this) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }

    /**
     * test1 : 4
     * test1 : 3
     * test1 : 2
     * test1 : 1
     * test1 : 0
     * test2 : 4
     * test2 : 3
     * test2 : 2
     * test2 : 1
     * test2 : 0
     */
    public synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void main(String[] args) {
        final TestSynchronized myt2 = new TestSynchronized();
        Thread test1 = new Thread(new Runnable() {
            public void run() {
                myt2.test1();
            }
        }, "test1");
        Thread test2 = new Thread(new Runnable() {
            public void run() {
                myt2.test2();
            }
        }, "test2");
        test1.start();
        ;
        test2.start();
        //         TestRunnable tr=new TestRunnable();
        //         Thread test3=new Thread(tr);
        //         test3.start();
    }

}