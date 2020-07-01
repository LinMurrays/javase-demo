package springdemo02.javase.oop.NeiBuNei;

/**
 * 这是一个成员内部类
 */
public class Hero {
    void callHorse() {
        // 自己使用自己的成员内部类
        System.out.print("吕布");
        this.new Horse().show();//外部类里面创建成员内部类的实例：this.new Innerclass();
    }
    // 成员内部类
    class Horse {
        public void show() {
            System.out.println("---赤兔---");
        }
    }
    /**
     * 可以访问外部类的所有成员变量和方法（无论静态、非静态)
     * 自身没有静态成员
     * |--外部类里面创建成员内部类的实例：this.new Innerclass();
     * |--在外部类之外创建内部类的实例：new Outerclass().new Innerclass();
     * |--在内部类里访问外部类的成员：Outerclass.this.member
     */
}


