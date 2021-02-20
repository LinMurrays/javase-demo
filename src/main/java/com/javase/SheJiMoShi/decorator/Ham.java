package com.javase.SheJiMoShi.decorator;

/**
 * 火腿片，继承调味料，父类是抽象煎饼
 */
public class Ham extends Condiment {
    private Pancake pancake;

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 火腿片";
    }

    @Override
    public double price() {
        return pancake.price() + 1.5;
    }
}
