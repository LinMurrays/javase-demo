package com.boc.database.javase.SheJiMoShi.decorator;

/**
 * 调味料，继承抽象煎饼
 */
public abstract class Condiment extends Pancake {
    public abstract String getDesc();

    @Override
    public double price() {
        return 0;
    }
}
