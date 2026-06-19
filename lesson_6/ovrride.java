package lesson_6;
class Parent{
    public void sayhello()
    {
        System.out.println("Hello from Parent.");
    }
}
class Child extends Parent{
    @Override
    public void sayhello()
    {
        System.out.println("Hello from Child.");
    }
}
public class ovrride {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayhello(); // Output: Hello from Child.
    }   
}
