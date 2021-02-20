package com.javase.SheJiMoShi.decorator.demo1;

//被装饰的可乐Component类
public class CokeColeComponent extends Drink {
    public CokeColeComponent() {
        //设置name为可乐
        //这个name属性是从饮品类中继承来的
        name = "可乐";
    }

    /***
     * 实现父类的抽象方法
     * @return 可乐的价格
     */
    @Override
    public int price() {
        //可乐30块一瓶~
        return 30;
    }

}
