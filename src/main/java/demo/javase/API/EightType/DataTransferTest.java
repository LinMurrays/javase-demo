package demo.javase.API.EightType;

public class DataTransferTest {
    public static void main(String[] args) {
        /**
         * 自动转换的规则是从低级类型数据转换成高级类型数据。转换规则如下：
         * * 数值型数据的转换：byte→short→int→long→float→double。
         * * 字符型转换为整型：char→int。
         * float、int 和 double 三种数据类型参与运算，最后输出的结果为 double 类型的数据。
         */
        float price1 = 10.9f; //定义牙膏的价格
        double price2 = 5.8; //定义面巾纸的价格
        int num1 = 2; //定义牙膏的数量
        int num2 = 4; //定义面巾纸的数量
        double res = price1 * num1 + price2 * num2; //计算总价
        System.out.println("—共付给收银员" + res + "元"); //输出总价

        /**
         * 强制转换
         *
         */

        int a = 3;
        double b = 5.0;
        a = (int) b;
    }
}
