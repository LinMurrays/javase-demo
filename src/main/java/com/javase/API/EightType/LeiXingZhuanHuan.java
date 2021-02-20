package com.javase.API.EightType;

public class LeiXingZhuanHuan {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        float price1 = 10.9f; //定义牙膏的价格
        double price2 = 5.8; //定义面巾纸的价格
        int num1 = 2; //定义牙膏的数量
        int num2 = 4; //定义面巾纸的数量
        float a = price1 * num1;
        double b = price1 + price2;
        double res = price1 * num1 + price2 * num2; //计算总价
        System.out.println("—共付给收银员" + res + "元"); //输出总价

        /**
         * 当两种数据类型不兼容，或目标类型的取值范围小于源类型时，自动转换将无法进行，这时就需要进行强制类型转换。
         */
        int aa = 3;
        double bb = 5.0;
        a = (int) b;
        /**
         *  double 类型变量 b 的值强制转换成 int 类型，然后将值赋给 a，但是变量 b 本身的值是没有发生变化的。
         *  在强制类型转换中，如果是将浮点类型的值转换为整数，直接去掉小数点后边的所有数字；
         *  而如果是整数类型强制转换为浮点类型时，将在小数点后面补零。
         */
    }
}
