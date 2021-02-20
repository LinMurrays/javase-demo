package com.javase.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*
         * File对象的创建
         * 构造方法
         */
        /*
         * File(String pathName)
         * 创建File对象，此对象指向目标文件/目录
         * 要求：在E盘创建一个text文件夹，在此文件夹下
         * 创建test文件夹，在text文件夹下创建a.txt文件
         */
//    File file = new File("E:"+File.separator+"text");
        //创建目录
//    boolean flag = file.mkdir();
//    System.out.println(flag);

        //File(File parent,String child)
        //创建子目录
//    File childDir = new File(file, "springdemo2.test");
//    flag = childDir.mkdir();
//    System.out.println(flag);

        //File(String parent,String child)
//        File dest = new File("E:"+ File.separator+"text","a.txt");
        File dest = new File("/Users","a.txt");

        //创建文件
        boolean flag = dest.createNewFile();
        System.out.println(flag);
    }
}
