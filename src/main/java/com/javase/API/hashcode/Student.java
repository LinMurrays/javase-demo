package com.javase.API.hashcode;

import java.util.Objects;

public class Student {

    String name;
    String addrl;
    int age;

    public Student(String name, String addrl, int age) {
        this.name = name;
        this.addrl = addrl;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addrl='" + addrl + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                addrl.equals(student.addrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addrl, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrl() {
        return addrl;
    }

    public void setAddrl(String addrl) {
        this.addrl = addrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
