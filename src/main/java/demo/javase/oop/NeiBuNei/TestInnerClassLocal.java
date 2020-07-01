package demo.javase.oop.NeiBuNei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//局部内部类
public class TestInnerClassLocal {
    public static void main(String[] args) {
        /**
         * 在方法中定义、使用
         * 不能被public, protected, private和static修饰(像局部变量一样)
         * 只能访问方法中定义的final类型的局部变量(初始化之后便不能更改)
         */
        class InnerComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }
        // 需要先定义局部内部类，再使用
        InnerComparator com = new InnerComparator();
        List<Integer> lst = new ArrayList<>();
        Collections.addAll(lst, 2, 3, 5, 1, 4);
        Collections.sort(lst, com);
        System.out.println(lst);
    }
}
