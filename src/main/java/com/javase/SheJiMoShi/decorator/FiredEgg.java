package com.javase.SheJiMoShi.decorator;

/**
 * 火腿鸡蛋，继承调味料
 */
public class FiredEgg extends Condiment {
    private Pancake pancake;

    public FiredEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 煎蛋";
    }

    @Override
    public double price() {
        return pancake.price() + 2;
    }
}
