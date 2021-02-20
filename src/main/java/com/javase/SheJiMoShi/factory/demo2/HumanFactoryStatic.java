package com.javase.SheJiMoShi.factory.demo2;

/**
 * 静态工厂模式
 */
public class HumanFactoryStatic  {

    /**
     * 我现在只需要一个工厂就可以把人生产出来，我干嘛要具体的工厂对象呢？我只要使用静态方法就好了。
     * 这样一想，于是女娲就开始把AbstractHumanFactory抽象类去掉了，只保留了HumanFactory类，
     * 同时把createHuman方法设置成了static类型，搞定！
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T extends Human> T createHuman(Class<T> clazz) {

        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("----");
            e.printStackTrace();

        }
        return (T) human;
    }
}
