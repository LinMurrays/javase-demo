package com.javase.API.EightType.date;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        double a = 12392029;
        DecimalFormat f = new DecimalFormat("\u00a4###,###,000");
        String s = f.format(a);
        System.out.println(s);
        //￥12,392,029
    }
}
