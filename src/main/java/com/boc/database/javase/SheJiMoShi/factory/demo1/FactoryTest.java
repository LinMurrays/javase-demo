package com.boc.database.javase.SheJiMoShi.factory.demo1;

/**
 * 工厂模式的定义
 *
 *         工厂模式使用的频率非常高，我们在开发中总能见到它们的身影。
 *         即定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 */
public class FactoryTest {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();
        Product product1 = factory.createProduct(ConcreateProduct1.class); //通过不同的类创建不同的产品
        Product product2 = factory.createProduct(ConcreateProduct2.class);
    }
}

