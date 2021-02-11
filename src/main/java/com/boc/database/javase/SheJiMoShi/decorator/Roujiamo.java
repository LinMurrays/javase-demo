package com.boc.database.javase.SheJiMoShi.decorator;

/**
 * 肉夹馍，煎饼子类，继承抽象煎饼
 */
public class Roujiamo extends Pancake {
    public Roujiamo() {
        desc = "肉夹馍";
    }

    @Override
    public double price() {
        return 6;
    }
}
