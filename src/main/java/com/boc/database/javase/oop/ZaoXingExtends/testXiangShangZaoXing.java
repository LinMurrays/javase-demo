package com.boc.database.javase.oop.ZaoXingExtends;

/**向上造型优点：
 * 不能访问到子类中的特有成员，只能访问父类本身存在的成员数据
 *        Person per = new Student();
 *        情景：如果一个方法可以接受多个类型的数据，此时可以将参数列表中的参数类型定义成其父类类型
 *        如果子类重写了父类的方法，则可以通过父类引用指向子类，实现不同的方法功能！如果需要使用子类特有的方法，则可以向下转型！！！！
 *
 * 向上造型缺点：
 *     Person per = new Student()
 *     不可以访问到子类中特有的成员
 *
 *通过父类引用指向子类对象，此时如何访问到子类中特有的成员？
 * 向下造型
 */
public class testXiangShangZaoXing {
    public static void main(String[] args) {
        Person obj = new Person();
        test(obj);
    }

    static void test(Person p) {
        //这是向下造型
        Person person = new Student();
        person.Method();//personMethod
        p.Method();//personMethod

        //这是向上造型，这样可以正常使用子类的方法
        Student s2 = (Student) person;
        s2.studentsMethod();//studentMethod

        //Exception in thread "main" java.lang.ClassCastException:
        // Person cannot be cast to Student
        //这样转型是会报错的，不能直接转换，需要先向上造型再向下造型才能使用子类的方法，
        // 直接用 Person obj = new Person();中产生的对象作为参数传进来是没有包含子类中的任何信息，转型错误
        Student s = (Student) p;
        s.studentsMethod();
        System.out.println("------");

        Teacher t = (Teacher) p;
        t.teacherMethod();
    }
}
//向上造型和向下造型，可以用接口，更方便