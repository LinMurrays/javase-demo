package com.boc.database.javase.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap是否允许空
 * Key和Value都允许空
 * <p>
 * LinkedHashMap是否允许重复数据
 * Key重复会覆盖、Value允许重复
 * <p>
 * LinkedHashMap是否有序
 * 有序
 * <p>
 * LinkedHashMap是否线程安全
 * 非线程安全
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();

        linkedHashMap.put("111", "111");
        //允许为空
        linkedHashMap.put("", "");
        //允许为null值
        //linkedHashMap.put(null, null);
        linkedHashMap.put("111", "222");

        Iterator it = linkedHashMap.entrySet().iterator();
        for (Map.Entry<String, Object> i : linkedHashMap.entrySet()) {
            System.out.println(i.toString());
        }

        String key = null;
        String value = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = entry.getKey().toString();
            value = entry.getValue().toString();
            System.out.println(key + "====" + value);
        }

        System.out.println("-------------");
        test2();
    }

    static void test2() {
        LinkedHashMap<String, String> linkedHashMap =
                new LinkedHashMap<String, String>(16, 0.75f, true);
        linkedHashMap.put("111", "111");
        linkedHashMap.put("222", "222");
        linkedHashMap.put("333", "333");
        linkedHashMap.put("444", "444");
        loopLinkedHashMap(linkedHashMap);
        linkedHashMap.get("111");
        loopLinkedHashMap(linkedHashMap);
        linkedHashMap.put("222", "2222");
        loopLinkedHashMap(linkedHashMap);
        /**
         * 代码运行结果证明了两点：
         * 1、LinkedList是有序的
         * 2、每次访问一个元素（get或put），被访问的元素都被提到最后面去了
         */
    }

    public static void loopLinkedHashMap(LinkedHashMap<String, String> linkedHashMap) {
        Set<Map.Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
    }
}
