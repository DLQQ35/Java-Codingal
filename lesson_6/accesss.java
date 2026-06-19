package lesson_6;
class Parent{
    protected void protect()
    {
        System.out.println("This is a protected method.");
    }
}
class Child extends Parent{
    private void privatemethod()
    {
        System.out.println("This is a private method.");
    }
}
public class accesss {
    public static void main(String[] args) {
        Child kid = new Child();
        kid.privatemethod(); 
        System.out.println("Hello World");
    }
}
