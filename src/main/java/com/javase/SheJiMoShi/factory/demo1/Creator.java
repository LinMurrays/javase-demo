package com.javase.SheJiMoShi.factory.demo1;

public abstract class Creator {
    //创建一个产品对象，其输入参数类型可以自行设置
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
