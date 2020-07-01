package springdemo02.javase.collection;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        listToArray();
    }

    /**
     * 这个方法是数组和list集合互相转换的
     */
    public static void listToArray(){
        List<String> list = new ArrayList<String>();
        list. add("王磊");
        list. add("的博客");
        list.toArray();
        System.out.println(list.toArray().toString());
// array to list
        String[] array = new String[]{"王磊","的博客"};
        Arrays. asList(array);
    }

    public static void testMap(){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        TreeMap<String,Object> treeMap = new TreeMap<String,Object>();
        Hashtable<String,Object> hashtable = new Hashtable<String,Object>();
        /**
         * HashMap和TreeMap比较
         *
         * （1）HashMap:适用于在Map中插入、删除和定位元素。
         * （2）Treemap:适用于按自然顺序或自定义顺序遍历键（key）。
         * （3）HashMap通常比TreeMap快一点（树和哈希表的数据结构使然），建议多使用HashMap,在需要排序的Map时候才用TreeMap.
         * （4）HashMap 非线程安全 TreeMap 非线程安全
         * （5）HashMap的结果是没有排序的，而TreeMap输出的结果是排好序的。
         */

        /**
         * HashMap 基于 Hash 算法实现的，我们通过 put(key,value)存储，get(key)来获取。
         * 当传 入 key 时，HashMap 会根据 key. hashCode() 计算出 hash 值，
         * 根据 hash 值将 value 保存在 bucket 里。当计算出的 hash 值相同时，
         * 我们称之为 hash 冲突，HashMap 的做 法是用链表和红黑树存储相同 hash 值的 value。
         * 当 hash 冲突的个数比较少时，使用链表 否则使用红黑树。
         */

    }



}
