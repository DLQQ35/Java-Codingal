package lesson_6;
class SuperClass{
    int number = 56;
}
class SubClass extends SuperClass{
    int number = 97;
    void printNumber()
    {
        System.out.println(super.number);
    }
}
public class Super {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.printNumber();
    }
}
