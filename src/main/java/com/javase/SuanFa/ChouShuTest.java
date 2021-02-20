package com.javase.SuanFa;

import java.util.LinkedList;

public class ChouShuTest {
    public static void main(String[] args) {
        System.out.println("求第几个丑数：");
        int n = 9;
        long r = choushu(n);
        System.out.println(r);
    }

    private static long choushu(int n) {
        LinkedList<Long> list2 = new LinkedList<>();
        LinkedList<Long> list3 = new LinkedList<>();
        LinkedList<Long> list5 = new LinkedList<>();
        list2.add(2L);
        list3.add(3L);
        list5.add(5L);
        long r = 0;//保存最终结果
        for (int i = 0; i < n; i++) {
            long a = list2.getFirst();
            long b = list3.getFirst();
            long c = list5.getFirst();
            r = Math.min(a, Math.min(b, c));
            if (r == a) list2.removeFirst();
            if (r == b) list3.removeFirst();
            if (r == c) list5.removeFirst();
            list2.add(r * 2);
            list3.add(r * 3);
            list5.add(r * 5);
            //只*2,3,5，所以因子只能是2,3,5
            //运行几次得到第几个r，r为丑数
        }
        return r;
    }
}
