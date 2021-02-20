package com.javase.SheJiMoShi.factory.demo2;

public class YellowHumanFactory extends AbstractHumanFactoryPlus {
    
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
