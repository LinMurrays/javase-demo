package com.javase.API.hashcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashCodeTest {

    public static void main(String[] args) {
        String name = "tom";
        String addrl = "huadu";
        int age = 5;

        Student student1 = new Student(name, addrl, age);
        Student student2 = new Student(name, addrl, age);
        Student student3 = new Student(name, addrl, age);
        Student student4 = new Student(name + 1, addrl + 1, age);

        List<Student> studentList = new LinkedList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        /**
         * 如果有相同的对象那么不添加到set集合
         */
        Set<Student> studentsSet = new HashSet<>();
        for (Student tmp : studentList) {
        /**
         * 已经添加student到set集合
         * Student{name='tom', addrl='huadu', age=5}
         * 已经添加student到set集合
         * Student{name='tom1', addrl='huadu1', age=5}
         */
            if (studentsSet.add(tmp)) {
                System.out.println("已经添加student到set集合");
                System.out.println(tmp.toString());
            }
        }
    }
}
