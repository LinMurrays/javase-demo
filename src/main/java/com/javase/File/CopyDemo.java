package com.javase.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
         * 将FisDemo.java文件复制到copy1.java文件去
         * 1.按照单个字节方式复制
         * */
        //相对路径？？？
        FileInputStream fis= new FileInputStream("FisDemo.java");
        FileOutputStream fos= new FileOutputStream("copy.java");
        //复制，先读后写（以字节方式读取）
        int by=0;
        while((by=fis.read())!=-1) {
            fos.write(by);
        }

        //复制：先读后写，一次复制120长度字节（以数组方式读取）
        byte[] bys= new byte[120];
        int len=0;
        while((len=fis.read(bys))>0){
            fos.write(bys,0,len);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
