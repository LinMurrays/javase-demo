package springdemo02.javase.threadTest.synchronize;

public class SynDemo2 {
    public static void main(String[] args) {
        /*
         * 创建2个人线程实现buy操作
         * */
        Shopping shop = new Shopping();
        Thread linda = new Thread("linda") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread amy = new Thread("amy") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        linda.start();
        amy.start();
    }
}
