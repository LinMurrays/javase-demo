package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("Black");
    }

    @Override
    public void talk() {
        System.out.println("Black man");
    }
}
