package com.javase.SheJiMoShi.factory.demo2;

public class WhiteHumanFactory extends AbstractHumanFactoryPlus {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
