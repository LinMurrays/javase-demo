package demo.javase.oop.NeiBuNei;

/**
 * 成员内部类测试
 */
public class InnerClassMember {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.callHorse();
        // 创建一个类的内部类
        Hero.Horse horse = new Hero().new Horse();
        horse.show();
    }
}
