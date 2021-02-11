package com.boc.database.javase.threadTest.synchronize;

public class Syn {
    public synchronized  void printInfo() {
        for(int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
