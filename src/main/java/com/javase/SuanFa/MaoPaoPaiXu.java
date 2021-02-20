package com.javase.SuanFa;

import java.util.Arrays;
import java.util.Random;

public class MaoPaoPaiXu {
    public static void main(String[] args) {
        //调用suiji()方法，产生一个乱序数组
        int[] a = suiji();//此方法返回int数组，则不会报错
        System.out.println(Arrays.toString(a));
        System.out.println("-------------");
        sort(a);//排序
        System.out.println("-------------");
        System.out.println(Arrays.toString(a));
    }

    static int[] suiji() {
        //随机产生长度长度是[5，11]的数组
        //遍历填入100内随机整数
        int b = 5 + new Random().nextInt(6);
        int[] a = new int[b];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    //循环n-1趟
    //外层控制循环多少趟，内层控制每一趟的循环次数
    static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    flag = true;//交换了数据
                }
            }
            if (!flag) {//没有交换，数据位置都正确
                break;
            }

            System.out.println(Arrays.toString(a));
        }
    }
}
