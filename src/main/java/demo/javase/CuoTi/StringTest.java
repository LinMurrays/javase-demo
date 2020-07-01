package demo.javase.CuoTi;

public class StringTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    /**
     * 有本质上区别
     * 前者是在字符串池里写入一个字符'a',然后用s指向它；
     * 后者是在堆上创建一个内容为"a"的字符串对象。
     */
    static void test1() {
        String s = "a";////于栈上分配内存
        String s2 = new String("a");////于堆上分配内存
    }

    static void test2() {

        String abc = null;
        //String abc;
        String a = "";
        String b = "";
        String c = new String("");
        String d = new String("");
        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(c == d);//false
//和C语言不同，JAVA为安全原因不允许一个悬挂引用，没有赋值的引用地址一律自动赋值为NULL，以防止访问到任意内存
//变量a和b将会指向同一内存地址(""的地址)
//变量c和d不会指向同一地址,而是两个""内容的地址,并且和a,b不同,实际上,3)和4)相当于new String("").intern().
//String类维护着一个字符串池,对于像3)和4)这样的赋值方法,String会在这个池中查找字符串是否已经在池中,如果在,就直接指向该地址,
    }

    static void test3() {
        String str = "I can do it because I think I can";
        int a = str.indexOf("I");
        System.out.println(a);//从0开始计算
        int index1 = str.indexOf("can");
        int index2 = str.lastIndexOf("can");
        System.out.println(index1 + "---" + index2);//2---30
    }

}
