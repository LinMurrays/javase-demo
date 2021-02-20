package com.javase.SheJiMoShi.decorator;

/**
 * 抽象煎饼，子类是肉夹馍
 */
public abstract class Pancake {

    public String desc = "我不是一个具体的煎饼";

    public String getDesc() {
        return desc;
    }

    public abstract double price();
}
