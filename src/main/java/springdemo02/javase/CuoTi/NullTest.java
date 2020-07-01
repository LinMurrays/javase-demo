package springdemo02.javase.CuoTi;


public class NullTest {

    public static void main(String[] args) {
        // test1();
        //test2();
        test3();
    }

    /**
     * //此题目考查的是当对一个null值的对象，访问其属性或方法程序会出现NullPointerException异常。
     * 二维数组没有初始化内部数组，则二维数组中的数组都是null值
     * Exception in thread "main" java.lang.NullPointerException
     */
    static void test1() {
        int[][] arr = new int[3][];
        System.out.println(arr[0].length);
    }

    /**
     * NULL代表声明了一个空对象，根本就不是一个字符串。
     * ""代表声明了一个对象实例，这个对象实例的值是一个长度为0的空字符串。
     */
    static void test2() {
        String s = null;
        s.trim();//就会抛出为空的exception
        String s2 = "";
        s2.trim();//就不会抛,为什么?
    }

    static void test3() {
        String s = null;//null是未分配堆内存空间               (创建一个空字符串对象)
        String a;//分配了一个内存空间,没存入任何对象            (声明一个字符串对象，但并没有分配内存)
        String a2 = "";//分配了一个内存空间,存了一个字符串对象  (创建一个字符串为空的字符串对象。)
        System.out.println(a2);//打印空白
        System.out.println(s);//输出null
        //System.out.println(a);会出现异常，因为没有初始化
    }

    static void test4() {

    }

    static void test5() {

    }
}
