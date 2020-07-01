package springdemo02.javase.CuoTi;

public class ShortTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    static void test1() {
        short s1 = 3;
        short s2 = 5;
        s1 += s2;//都使用扩展赋值运算符运算，自动强制转换

        short sa = 3;
        short sb = 5;
        //sa = sa + sb;//计算结果都是int类型，都需要从int类型强制转换到short类型,这里没有强转，所以报错

        short sc = 3;
        short sd = 5;
        //sc = sc * sd;//计算结果都是int类型，都需要从int类型强制转换到short类型,这里没有强转，所以报错

        short se = 3;
        short sf = 5;
        se *= sf;//都使用扩展赋值运算符运算，自动强制转换
        /**
         * +=，-=，*=，/=, %=x+=y等价于x=x+y,其他同理
         * 除了以上语法现象外，使用扩展赋值运算符运算的时候，内部隐含强制转换。如果出现需要类型转换，扩展赋值运算符直接进行转换
         */
    }

    static void test2() {
        int x = 1;
        System.out.println("value is " + ((x > 4) ? 99.9 : 9));//输出结果9.0
        /**
         * 第二个表达式和第三个表达式中如果都为基本数据类型，整个表达式的运算结果由容量高的决定。99.9是double类型而9是int类型
         */
    }


    static void test3() {

    }

    static void test4() {

    }

    static void test5() {

    }
}
