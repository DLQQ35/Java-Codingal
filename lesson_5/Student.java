package lesson_5;
class Parent{
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name: " + name);
    }
}
class Child extends Parent{
    void age(int age)
    {
        System.out.println("Age of student is: " + age);
    }
}
public class Student {
    public static void main(String[] args) {
        Child s = new Child();
        s.naming("John Doe");
        s.age(20);
    }
}