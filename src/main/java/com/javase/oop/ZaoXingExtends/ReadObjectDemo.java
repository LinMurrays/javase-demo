package com.javase.oop.ZaoXingExtends;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OOS.txt"));

        //此处成功的原因是ois.readObject()中返回的object中有student信息
        Student stu = (Student) (ois.readObject());

        //此处会报错，因为obj对象中不包含stus的信息，转型不成功
        //Object obj = new Object();
        //Student stus =(Student) obj;

        //向下转型成功与否看父类中是否包含子类信息

        //子类创建对象时默认会创建父类对象，所以能向上转型，所以父类指向子类，
        //又可以向下转型
        // Person per = new Student();//    向上造型
        //Student stu = (Student)per;//     向下造型(强制变成子类对象)

        System.out.println(stu);
        //释放资源
        ois.close();
    }
}
