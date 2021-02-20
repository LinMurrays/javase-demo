package com.javase.collection;

import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        //创建栈内存并向栈中压入元素
        Deque<String> stack = new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);//[c, b, a]
        //原来的逻辑是：栈不能从队尾入列，但此处当成了双向列表
        //stack.offer("d");
        //System.out.println(stack);

        String ele = stack.pop();
        System.out.println(ele);
        System.out.println(stack);
    }
}

