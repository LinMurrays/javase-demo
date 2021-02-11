package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class YellowHumanFactory extends AbstractHumanFactoryPlus {
    
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
