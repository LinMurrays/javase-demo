package com.javase.API.EightType.String;

public class StringMethod {
    public static void main(String[] args) {
        test1();
        System.out.println("--");
        test2();
    }

    static void test1() {
        String str = new String("asdfzxc");
        char ch = str.charAt(4);//ch = z//求字符串某一位置字符
        System.out.println(ch);

        String str2 = str.substring(2);
        System.out.println(str2);//dfzxc
        String str3 = str.substring(2,5);//str3 = "dfz"
        System.out.println(str3);
    }

    static void test2(){
        String str1 = new String("abc");
        String str2 = new String("ABC");
        int a = str1.compareTo(str2);//a>0
        System.out.println(a);
        int b = str1.compareTo(str2);//b=0
        System.out.println(b);
        boolean c = str1.equals(str2);//c=false
        System.out.println(c);
        boolean d = str1.equalsIgnoreCase(str2);//d=true
        System.out.println(d);
    }
}
