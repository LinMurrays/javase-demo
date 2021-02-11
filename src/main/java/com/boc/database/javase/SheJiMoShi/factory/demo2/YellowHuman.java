package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void talk() {
        System.out.println("yelllow man");
    }
}
