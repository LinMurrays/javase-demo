package com.boc.database.javase.SheJiMoShi.decorator.demo1;

//被装饰的啤酒Component类
public class BeerComponent extends Drink {
    public BeerComponent() {
        //设置name为啤酒
        //这个name属性是从饮品类中继承来的
        name = "啤酒";

    }

    /***
     * 实现父类的抽象方法
     * @return 啤酒的价格
     */
    @Override
    public int price() {
        //啤酒3块一瓶~
        return 3;
    }

}
