package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class BlackHumanFactory extends AbstractHumanFactoryPlus {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
