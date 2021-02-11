package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {

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
