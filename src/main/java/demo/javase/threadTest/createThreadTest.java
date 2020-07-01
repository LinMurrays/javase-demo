package demo.javase.threadTest;

public class createThreadTest {

    public static void main(String[] args) {

        /**
         * 继承线程的运行方法
         */
        extendsThread thread1 = new extendsThread();
        extendsThread thread2 = new extendsThread();
        thread1.start();
        System.out.println("============");
        thread1.run();
        System.out.println("------------");
        thread2.start();
        System.out.println("00000000");
        thread2.run();

        /**
         * 实现接口的运行方法
         */
        impThread task = new impThread();
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        thread3.start();
        thread4.start();
        thread3.run();
        thread4.run();


        createThreadTest obj = new createThreadTest();
        obj.test();
        createThreadTest.test();
    }

    static void test(){
        System.out.println("static");
    }


}
