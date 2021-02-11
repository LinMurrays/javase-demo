package com.boc.database.javase.SheJiMoShi.decorator.demo1;

/**
 * 上述的例子中,可以以饮品为主体,用不用的各种需求来装饰它,
 * 比如有一个可乐对象,那我用一个加冰对象装饰一下,再用加糖对象装饰一下,
 * 最后能得到一个加冰加糖可乐,这时候就将原可乐对象扩展,得到了加冰和加糖两种装饰.
 * 装饰者模式: 动态地将责任附加到对象上,对扩展功能来说,
 * 装饰者比继承更有弹性更灵活(因为子类继承父类扩展功能的前提,是已知要扩展的功能是什么样的,
 * 而这是在编译时就要确定的,但是装饰者模式可以实现动态(在运行时)去扩展功能).
 */
public class Test {
    /**
     * Decorator:是装饰者的父类,每个装饰者都需要继承这个抽象类(或实现这个接口).
     * ConcreteDecoratorA/B:具体的装饰者,就对应上述例子中的加冰,加糖等.
     * ConcreteComponent:具体的对象,就是上述例子中的可乐.
     * Component:装饰者模式中最顶级的父类,装饰者与被装饰者都是它的子类或实现类才行.
     * @param args
     */
    public static void main(String[] args) {
        //可以看到,我们操作的引用一直是这个yp
        //但是这个引用指向的对象已经换了好几次了
        //这就是为什么装饰类也要是饮品类的子类,因为只有这样,装饰类与被装饰类才能被当做同一个类型使用(通过接口或继承实现)
        Drink yp = new CokeColeComponent();
        yp = new WaterDecorator(yp);
        yp = new SugarDecorator(yp);
//  上面与下面这一行是一样的,是不是和IO流很像?
//  yp = new 加醋Decorator(new 兑水Decorator(new 可乐Component()));

        System.out.println("饮品名:" + yp.getName() + "---价格:" + yp.price());
    }
}
