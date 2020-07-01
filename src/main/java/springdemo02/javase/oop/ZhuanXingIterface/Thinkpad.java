package springdemo02.javase.oop.ZhuanXingIterface;

public class Thinkpad implements Electronics {
    //Thinkpad引导方法
    public void boot(){
        System.out.println("welcome,I am Thinkpad");
    }

    //使用Thinkpad编程
    public void program(){
        System.out.println("using Thinkpad program");
    }

}
