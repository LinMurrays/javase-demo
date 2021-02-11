package com.boc.database.javase.threadTest.interrupt_join_yield;

public class JoinDemo {
    public static void main(String[] args) {
        //创建下载任务线程
        Thread download= new Thread() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++) {
                    System.out.println("已下载"+i+"%");
                }
            }
        };
        Thread show = new Thread() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("开始加载并且显示..");
                try {
                    download.join();
                    //线程中调用了B线程的join方法，则相当于A线程调用了B线程的wait方法，
                    //在调用了B线程的wait方法后，A线程就会进入阻塞状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("显示完成!");
            }
        };

        download.start();
        show.start();
    }
}
