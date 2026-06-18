package lesson_5;
class Mammal{
    void mam(){
        System.out.println("Inside Mammal class");
    }
}
class Lion extends Mammal{
    void roar(){
        System.out.println("Inside Lion class");
    }
}
class Humans extends Mammal{
    void hum(){
        System.out.println("Inside Humans class");
    }
}
public class Mammals {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.hum();
        obj.roar();
        obj.mam();
    }
}