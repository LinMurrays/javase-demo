package com.boc.database.javase.threadTest;

public class impThread implements Runnable {


    @Override
    public void run() {
      /*  for(int i=1;i<=30;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }*/
        System.out.println("线程2");
    }
}
