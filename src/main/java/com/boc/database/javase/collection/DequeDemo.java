package com.boc.database.javase.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        //默认队尾入列
        deque.offer("a");
        //offerFirst(E):从队首入列
        deque.offerFirst("first");

        //offerLast(E):从队尾入列
        deque.offerLast("last");

        //poll()：从队首出列
        String ele = deque.poll();

        //pollFirst()：从队首出队
        String ele2 = deque.pollFirst();
        //pollLast():从队尾出队
        String ele3 = deque.pollLast();
        //从队首取值
        ele = deque.peek();
        //从队首取值
        ele = deque.peekFirst();
        //从队尾取值
        ele = deque.peekLast();
    }
}
