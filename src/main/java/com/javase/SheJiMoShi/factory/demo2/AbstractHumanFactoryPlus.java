package com.javase.SheJiMoShi.factory.demo2;

/**
 * 多个工厂模式
 */
public abstract class AbstractHumanFactoryPlus {
    /**
     * 注意抽象方法中已经不需要再传递相关类的参数了，因为每个具体的工厂都已经非常明确自己的职责：创建自己负责的产品类对象。
     * 所以不同的工厂实现自己的createHuman方法即可：
     *
     * 每个具体的工厂方法继承这个父类工厂
     * @return
     */
    public abstract Human createHuman();
}
