package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class WhiteHumanFactory extends AbstractHumanFactoryPlus {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
