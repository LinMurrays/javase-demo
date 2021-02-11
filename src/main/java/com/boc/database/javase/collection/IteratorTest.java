package com.boc.database.javase.collection;

import java.util.*;

/**
 * Iterator 接口提供遍历任何 Collection 的接口。
 */
public class IteratorTest {
    public static void main(String[] args) {

    }

    /**
     * 这个方法是用来遍历list的
     */
    static void listIterator() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if ("bbb".equals(t)) {
                it.remove();
            }
        }
        System.out.println("After iterate : " + a);
    }

    /**
     * 这个方法是用来遍历map
     */

    static void mapTest() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "qq");
        map.put("passWord", "123");
        map.put("userID", "1");
        map.put("email", "qq@qq.com");

        /**
         * for循环遍历
         */
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        /**
         * 用set迭代
         */
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry<String, String> entry1 = (Map.Entry<String, String>) i.next();
            System.out.println(entry1.getKey() + "==" + entry1.getValue());
        }

        /**
         * 用keyset迭代
         */

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key;
            String value;
            key = it.next().toString();
            value = map.get(key);
            System.out.println(key + "--" + value);
        }

        /**
         * 用entryset迭代
         */
        Iterator its = map.entrySet().iterator();
        System.out.println(map.entrySet().size());
        String key;
        String value;
        while (its.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = entry.getKey().toString();
            value = entry.getValue().toString();
            System.out.println(key + "====" + value);
        }


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());

        }
    }
}
