package demo.javase.API.EightType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList实现了List接口,它是以数组的方式来实现的,
 * 数组的特性是可以使用索引的方式来快速定位对象的位置,
 * 因此对于快速的随机取得对象的需求,使用ArrayList实现执行效率上会比较好.
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> userlist = new ArrayList<String>();
        userlist.add("yulon");
        userlist.add("xiaoyun");
        userlist.add("羽龙共舞");
        System.out.println("使用普通for循环:");
        for (int i = 0; i < userlist.size(); i++) {
            System.out.print(userlist.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("使用Iterator迭代器:");
        Iterator it = userlist.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("使用增强for循环:");

        for (String s : userlist) {
            System.out.print(s + " ");
        }
    }
}