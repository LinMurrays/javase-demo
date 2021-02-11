package com.boc.database.javase.SheJiMoShi.factory.demo2;

public abstract class AbstractHumanFactory {
    //注意这里T必须是Human的实现类才行，因为要造Human嘛
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
