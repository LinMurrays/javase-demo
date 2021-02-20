package com.javase.SheJiMoShi.decorator.demo1;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Drink yp) {
        //调用父类的构造方法赋值
        //赋值饮品对象，在构造方法赋值，将加过糖加过水的对象继续赋值往下
        super(yp);
    }

    public void addVinegar() {
        System.out.println("还要加糖,加完了");
    }

    /***
     * 那么加糖后的价格应该是多少呢?<br/>
     * 应该是加糖的价格加饮品的价格
     * @return 加糖五块
     */
    @Override
    public int price() {
        return 5 + yp.price();
    }

    /***
     * 再复写一个名字的方法<br/>
     * 现在已经不是单纯的饮品了
     * @return
     */
    //构造方法会调用这个getname方法
    @Override
    public String getName() {
        //在这里加个糖
        addVinegar();

        System.out.println("name="+yp.name);
        return "加糖的" + yp.getName();

    }
}
