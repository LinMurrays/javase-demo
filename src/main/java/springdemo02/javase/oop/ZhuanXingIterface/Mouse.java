package springdemo02.javase.oop.ZhuanXingIterface;

public class Mouse implements Electronics {
    //鼠标移动
    public void move(){
        System.out.println("move the mouse");
    }

    //鼠标点击
    public void onClick(){
        System.out.println("a click of the mouse");
    }

}
