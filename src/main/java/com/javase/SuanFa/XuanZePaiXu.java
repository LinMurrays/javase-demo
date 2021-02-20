package com.javase.SuanFa;

import java.util.Arrays;
import java.util.Random;

public class XuanZePaiXu {
    public static void main(String[] args) {
        //调用suiji()方法，产生一个乱序数组
        int[] a = suiji();//此方法返回int数组，则不会报错
        System.out.println(Arrays.toString(a));
        System.out.println("-------------");
        sort(a);//排序
        System.out.println("-------------");
        System.out.println(Arrays.toString(a));
    }

    //通过main方法调用其他方法
    static int[] suiji() {
        //随机产生长度长度是[5，11)的数组
        //遍历填入100内随机整数
        int b = 5 + new Random().nextInt(6);
        int[] a = new int[b];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //i到末尾，选择最小值位置
            int j = minIndex(a, i);//得到最小值下标
            //交换i,j位置的值
            swap(a, i, j);
            System.out.println(Arrays.toString(a));
        }
    }

    static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    static int minIndex(int[] a, int i) {
        //假设i位置最小
        //i默认值0
        int m = i;
        //从i+1位置向后找更小值
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[m]) {
                m = j;
            }
        }
        return m;
    }
}
