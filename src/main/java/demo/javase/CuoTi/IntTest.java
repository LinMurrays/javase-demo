package demo.javase.CuoTi;

public class IntTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    static void test1() {
        int x = 10;
        x = x++ + 10;
        System.out.println(x);
        /**
         * 执行顺序如下1、先执行x+10,结果为20
         *           2、再执行x++,x值为11
         *           3、将第一步结果赋值给x，x=20；
         */
    }

    static void test2() {
        long l = 999999;
        long l2 = 9999999999L;
        // byte b = 90+40;
        int i = 'A' + '中';
        /**
         * A选项999999没有超出int类型取值范围，语法合法
         * B选项9999999999超出int类型取值范围，必须以字母L结尾
         * C选项90+40超出byte类型最大取值范围127,编译会报错
         * D选项两个char类型使用加的运算，使用编码值，结果为int类型
         */
    }

    static void test3() {
        int a = 5;
        System.out.println((a++));
        System.out.println(++a);
        //5     //先取值，再自增 1
        //7     // 先自增，再取值 1
    }

    static void test4() {
        int i = 1;
        int j = i++;
        System.out.println(i);//2
        System.out.println(j);//1
        //在java语言中，i++的值为i的值，将其赋值给j，所以j的值为1。而后i会自增1的，所以i的值为2。
        //但是i的值会发生变化，i++的值和i运算之后的值是不一样的
    }

    static void test5() {

    }
}
