package lesson_5;
class Animals{
    void eat()
    {
        System.out.println("eating......Animal class......eat method");
    }
}
class Lion extends Animals{
    void roar()
    {
        System.out.println("roar......Lion class......roar method");
    }
}
class BabyLion extends Lion{
    void weep()
    {
        System.out.println("weeping......BabyLion class......weep method");
    }
}
public class Animal {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion();
        obj.eat();
        obj.roar();
        obj.weep();
    }
}
