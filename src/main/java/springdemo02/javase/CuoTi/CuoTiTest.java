package springdemo02.javase.CuoTi;

public class CuoTiTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    static void test1() {
        double b1, b2;
        int a1, a2;
        //这样声明变量是正确的
        // String a1;//这样声明变量是错误的
    }

    static void test2() {
        System.out.println(3+4+"tedu"+3+4);//7tedu34
        //输出语句中，先执行3+4，结果是7，再执行7+"tedu"，结果是7tedu再+3，结果是7tedu3,在加4，结果是7tedu34
    }

    static void test3() {
        /**
         * floor ： 意为地板，指向下取整，返回不大于它的最大整数
         * ceil ： 意为天花板，指向上取整，返回不小于它的最小整数
         * round ： 意为大约，表示“四舍五入”，而四舍五入是往大数方向入。
         */
        System.out.println(Math.round(11.5) );//12
        System.out.println(Math.round(-11.5) );//-11
    }

    static void test4() {


    }

    static void test5() {

    }
}
