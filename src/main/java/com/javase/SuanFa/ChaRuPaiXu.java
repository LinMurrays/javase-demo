package com.javase.SuanFa;

import java.util.Arrays;
import java.util.Random;

public class ChaRuPaiXu {
    public static void main(String[] args) {
        int[] a = suiji();
        System.out.println(Arrays.toString(a));
        System.out.println("-------------");
        sort(a);//排序
        System.out.println("-------------");
        System.out.println(Arrays.toString(a));
    }

    static int[] suiji() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //内层J宣传作用：
            //将i位置的值，向前插入到正确位置
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                } else {
                    //已经插好
                    break;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
}
