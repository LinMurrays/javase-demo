package com.boc.database.javase.SheJiMoShi.decorator.demo1;


/**
 * Created by zyf on 2017/3/30.
 * 装饰者模式中最顶级的父类
 */
public abstract class Drink {
    String name;

    /**
     * 每个饮品的价格不同,所以讲price方法抽象化<br/>
     * 让每个实现"饮品"类的子类自己决定是多少钱
     */
    public abstract int price();

    /***
     * 得到饮品的名字
     * @return 名字
     */
    public String getName() {
        return name;
    }
}
