package lesson_4;
class counter{
    static int number = 10;
    void incremental(){
        number = number + 1;
    }
    public static void main(String[] args) {
        counter ob1 = new counter();
        counter ob2 = new counter();
        counter ob3 = new counter();

        ob1.incremental();
        ob2.incremental();
        ob3.incremental();

        System.out.println(ob1.number);
        System.out.println(ob2.number);
        System.out.println(ob3.number);
    }
}