package com.javase.FanXing;

/**
 * 这是一个泛型类
 *
 * @param <T>
 * @param <U>
 */
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(U newValue) {
        second = newValue;
    }

    /**
     * 这是一个泛型方法
     * @param a
     * @param <T>
     * @return
     */
        public static <T> T getMiddle(T[] a) {
            return a[a.length / 2];

    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("tom",2);
    }
}
