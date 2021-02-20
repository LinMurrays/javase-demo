package com.javase.File;

import java.io.File;
import java.io.IOException;

public class MethodDemo {
    public static void main(String[] args) throws IOException {
        //mkdirs():创建多级目录
//    File file = new File("E:"+File.separator+"aa"+File.separator+"bb"+File.separator+"cc"+File.separator+"a.txt");
//    boolean flag = file.mkdirs();
//    System.out.println(flag);

        //创建E:\aa\bb\cc\a.txt
        //创建父目录
//    File parent = new File("E:"+File.separator+"aa"+File.separator+"bb"+File.separator+"cc");
//    parent.mkdirs();
//         //创建其子文件
//    File child = new File(parent,"a.txt");
//    child.createNewFile();


        /*
         * isFile() - boolean
         * 判断file对象指向的是否是文件
         */
//    File dir = new File("E:"+File.separator+"d");
//    dir.mkdir();
//    System.out.println(dir.isFile());
//    System.out.println(dir.isDirectory());
//
//    File dest = new File("E:"+File.separator+"a.txt");
//    dest.createNewFile();
//    System.out.println(dest.isFile());
//    System.out.println(dest.isDirectory());

        /*
         * exists() - boolean
         * 判断File对象指向的文件/目录是否存在
         * 创建以下目录，如果该目录不存在
         */

//    File dir = new File("E:"+File.separator+"d");
//    if(!dir.exists()){
//               System.out.println("创建了");
//        dir.mkdir();
//    }

        /*
         * delete() -boolean
         * 删除指定的文件/目录
         */
        //删除E:a.txt文件
//    File dest = new File("E:"+File.separator+"d");
//    System.out.println(dest.delete());
        //删除E:a文件夹(a目录下还有子目录)
        File file = new File("E:"+ File.separator+"a");
        System.out.println(file.delete());
    }
}
