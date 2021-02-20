package com.javase.SheJiMoShi.decorator;

/**
 * 煎饼子类
 */
public class TornCake extends Pancake{
    public TornCake() {
        desc = "手抓饼";
    }

    @Override
    public double price() {
        return 4;
    }
}
