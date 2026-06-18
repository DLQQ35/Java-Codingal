package lesson_5;

public class Age {
    int age;
    Age(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        Age obj = new Age(25);
        System.out.println("Age of the person is: " + obj.age);
    }
}
