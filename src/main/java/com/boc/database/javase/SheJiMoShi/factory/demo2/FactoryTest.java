package com.boc.database.javase.SheJiMoShi.factory.demo2;

public class FactoryTest {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        Human blackMan = abstractHumanFactory.createHuman(BlackHuman.class); //黑人诞生了
        blackMan.getColor();
        Human yellowMan = abstractHumanFactory.createHuman(YellowHuman.class); //黄人诞生了
        yellowMan.getColor();
        Human whiteMan = abstractHumanFactory.createHuman(WhiteHuman.class); //白人诞生了
        whiteMan.getColor();

        /**
         * 不拓展，就使用静态方法统一生产
         */
        System.out.println("----");
        BlackHuman human2 = HumanFactoryStatic.createHuman(BlackHuman.class);
        human2.getColor();


        System.out.println("----");
        /**
         *    这种工厂模式的好处是职责清晰，结构简单，但是给扩扩展性和可维护性带来了一定的影响，
         *    因为如果要扩展一个产品类，就需要建立一个相应的工厂类，这样就增加了扩展的难度。
         *    因为工厂类和产品类的数量是相同的，维护时也需要考虑两个对象之间的关系。但是这种模式还是很常用的。
         */
        Human blackMan2 = new BlackHumanFactory().createHuman(); //黑人诞生了
        blackMan2.getColor();
        Human yellowMan2 = new YellowHumanFactory().createHuman(); //黄人诞生了
        yellowMan2.getColor();
        Human whiteMan2 = new WhiteHumanFactory().createHuman(); //白人诞生了
        whiteMan2.getColor();

    }

}
