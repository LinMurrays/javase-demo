package com.boc.database.javase.SheJiMoShi.decorator.demo1;

//Decorator类,所有装饰类的父类
public class Decorator extends Drink {
    @Override
    public int price() {
        return 0;
    }

    /***
     * 声明一个饮品引用,准备接受一个饮品对象<br/>
     */
    protected Drink yp;

    //将传入来的饮品对象赋值给自己的饮品对象
    public Decorator(Drink yp) {
        this.yp = yp;
        System.out.println("yp"+yp.getName());
    }
}
