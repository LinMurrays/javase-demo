package com.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(9527, "唐伯虎");
        map.put(9534, "null");
        map.put(null, "---");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(9527));
        Set<Integer> keys = map.keySet();//得到键值的集合
        //快捷键alt+shift+l在map.keySet();后面加
        Collection<String> values = map.values();//得到数据的集合
        Set<Map.Entry<Integer, String>> entrys = map.entrySet();
        //嵌套泛型语法，Entry存储对象，Integer, String键值和数据

        System.out.println("--Keys----------");
        //增强for循环遍历
        for (Integer k : keys) {
            System.out.println(k);
        }
        System.out.println("--values----------");
        for (String s : values) {
            System.out.println(s);
        }
        System.out.println("--entrys----------");
        for (Map.Entry<Integer, String> e : entrys) {
            Integer k = e.getKey();
            String v = e.getValue();
            System.out.println(k + "=" + v);
        }
    }
}
