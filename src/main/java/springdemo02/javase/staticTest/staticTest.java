package springdemo02.javase.staticTest;

public class staticTest {
   // 所有静态成员在类加载完成之后都已经或显示或隐式的完成了初始化赋值的操作。
    //很显然，被static关键字修饰的方法或者变量不需要依赖于对象来进行访问，只要类被加载了，就可以通过类名去进行访问。
    private static int num = 11;
    private static int num2;
    private static final int num3 = 12;
    //类初始化的时候会加载静态代码块
    static {
        System.out.println("static mark file");
    }
//不会执行此方法
    static void staticMethod(){
        System.out.println("这是静态方法");
    }

    public static void main(String[] args) {
        staticTest obj = new staticTest();

        System.out.println("ok");
    }
}
