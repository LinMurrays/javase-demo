package demo.javase.threadTest.synchronize;

public class Shopping {
    public void buy() {
        //Thread.currentThread()  是指获取当前运行的线程对象
        String name = Thread.currentThread().getName();
        System.out.println(name+"开始选衣服");
        try {
            Thread.sleep(2000);//进入阻塞状态
            //当阻塞方法收到中断请求的时候就会抛出InterruptedException异常
        }catch(InterruptedException e){
            e.printStackTrace();
            //throw new NullPointerException();
        }
        System.out.println(name+"选衣服结束");
        //试衣服
        //通常采用this，指调用当前方法的对象
        synchronized(this) {
            System.out.println(name+"开始试衣服");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+"试衣服结束");
            //不能同时两个人试衣服，只有一个人试衣服结束以后另外一个线程才能访问
        }
    }
}
