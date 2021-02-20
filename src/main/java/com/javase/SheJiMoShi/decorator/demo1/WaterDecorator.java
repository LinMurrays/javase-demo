package com.javase.SheJiMoShi.decorator.demo1;

public class WaterDecorator extends Decorator {
    public WaterDecorator(Drink yp) {
        //调用父类的构造方法赋值
        //赋值饮品对象，在构造方法赋值，将加过糖加过水的对象继续赋值往下
        super(yp);
    }

    public void Water() {
        System.out.println("饮料兑水....尴尬不老铁...");
    }

    /***
     * 那么兑水后的价格应该是多少呢?<br/>
     * 应该是兑水的价格加饮品的价格
     * @return Water2块
     */
    @Override
    public int price() {
        return 2 + yp.price();
    }

    /***
     * 再复写一个名字的方法<br/>
     * 现在已经不是单纯的饮品了
     * @return
     */
    //构造方法会调用这个getname方法
    @Override
    public String getName() {
        Water();
        System.out.println("name="+yp.name);
        return "兑水了的" + yp.getName();
    }
}
