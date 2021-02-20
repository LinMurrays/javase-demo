package com.javase.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //下标遍历，对于双向链表效率低，一个一个下标数
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add(null);
        System.out.println(list.size());//得到长度值
        System.out.println(list.get(0));//得到下标0的值
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.remove(6));//移除下标6的值
        System.out.println(list.remove("aaa"));//用数据删除返回布尔值
        //表示是否找到了数据并且删除
        System.out.println(list);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
          /*Iterator<Student> it = ls.iterator();
          就是循环你那个list<student> ，it.hasNext();
          表示是否还有下一个student对象，返回true就进入
          it.next表示获得当前这个student（强转）对象然后判断获得的分数是否和那个相等。
          返回false就终止了，与for循环原理差不多。iterator是迭(die)代器，相当于指针，
          指向list中的数据，通过next方法，返回当前指向位置的数据，并将指针指向下一个数据，
          hasnext在指针不是处于末尾的时候都是返回true
          */

        //双向链表迭代器效率高，一个找完下一个
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {//hasNext判断是否还有下一个值
            String s = it.next();
            System.out.println(s);
        }
    }


}
