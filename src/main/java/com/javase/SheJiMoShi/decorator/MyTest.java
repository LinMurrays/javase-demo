package com.javase.SheJiMoShi.decorator;

public class MyTest {
    public static void main(String[] args) {
        test();
    }


    public static void test() {
        //抽象煎饼，手抓饼
        Pancake tornCake = new TornCake();
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getDesc(), tornCake.price()));

        //肉夹馍
        Pancake roujiamo = new Roujiamo();
        //加煎蛋
        roujiamo = new FiredEgg(roujiamo);
        //再加煎蛋
        roujiamo = new FiredEgg(roujiamo);
        //加火腿肠
        roujiamo = new Ham(roujiamo);
        //我好饿
        System.out.println(String.format("%s ￥%s", roujiamo.getDesc(), roujiamo.price()));
    }
    /**
     * 手抓饼 ￥4.0
     * 肉夹馍, 煎蛋, 煎蛋, 火腿片 ￥11.5
     */
}
/**
 * 公司门口有一个小摊卖手抓饼和肉夹馍的，有时候中午不想吃饭就会去光顾一下那个小摊，
 * 点了手抓饼之后往往还可以在这个基础之上增加一些配料，例如煎蛋，火腿片等等，每个配料的价格都不一样，
 * 不管你怎么配配料，最终价格是手抓饼基础价加上每一种所选配料价格的总和。小摊的价格单如下：
 */
