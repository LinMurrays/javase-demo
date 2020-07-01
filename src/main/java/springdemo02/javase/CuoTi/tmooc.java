package springdemo02.javase.CuoTi;

public class tmooc {
    String str = new String("tedu");
    char[] ch = {'x', 'y', 'z'};

    int x;


    public static void main(String args[]) {
        tmooc t = new tmooc();
        t.change(t.str, t.ch);
        //teduandwyz
        System.out.print(t.str + "and");
        System.out.print(t.ch);

        System.out.println("------------");

        tmooc d = new tmooc();
        d.x = 8;
        show(d);
        System.out.println("x=" + d.x);//x=7
        /**
         * 本题考查调用带有引用类型的参数
         * 调用带有引用类型的参数，传递的是对象的引用，方法中操作该参数，操作的
         * 是传递到该方法中的具体对象。
         * 本题目中，创建一个对象，变量d存储了该对象在内存中的地址信息，通过
         * d.x = 8,修改了该对象的x值，然后调用show()方法，将该引用传递给show方法
         * show()方法中，再次修改了该对象的x值为7，所以最后运行结果x=7
         */
    }

    public void change(String str, char ch[]) {
        str = "tarena";
        ch[0] = 'w';
    }

    public static void show(tmooc d) {
        d.x = 7;
    }
}
/**
 * String类是不能改变的，源码里有final修饰符，但是数组可以改变
 * 本题中，调用change()方法，传递一个字符串类型引用，和数组对象的引用，
 * 方法中 将字符串引用重新指向了一个新的字符串对象，源字符串对象不会发生变化。
 * 还是 tedu，而方法中对数组的操作，改变了源数组中第1个元素，源数组被改变后为 wy
 * static优于对象先存在，static修饰的方法访问非静态变量需要通过对象来访问，
 * 原因是非静态变量需要通过对象来调用，而static方法，static修饰的变量存在方法区优先于对象的创建。
 */
