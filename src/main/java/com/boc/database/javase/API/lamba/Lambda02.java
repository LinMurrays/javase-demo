package com.boc.database.javase.API.lamba;

import java.io.File;

public class Lambda02 {
    public static void main(String[] args) {
        /*
         * 使用lanbla表达式实现Runnable接口，并启动线程
         *
         * */
        Runnable task = () -> System.out.println("线程启动1");
        new Thread(task).start();
        // lambda表达式可以作为方法的参数使用
        new Thread(() -> System.out.println("开始任务2")).start();
        /*
         * 用lambda表达式实现FileFilter接口
         */
        //查询D盘下所有以.txt结尾的文件并打印输出
        File file = new File("D" + File.separator);
        File[] files = file.listFiles(f -> f.getName().endsWith(".txt") && f.isFile());
        for (File file2 : files) {
            System.out.println(file2);
        }
    }
}
//        匿名内部类的写法：
//        接口类型  引用 = new 接口（）{
//        重写抽象方法
//        }