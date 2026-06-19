package lesson_6;
class student{
    int id;
    String name;
    float stipend;
    student(){}
    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    student(int id, String name, float stipend)
    {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }
    void displaydetails()
    {
        System.out.println(this.id+"|"+this.name+"|"+this.stipend);
    }
}
class Overload{
    public static void main(String[] args) {
        student s1 = new student(101, "Alice");
        student s2 = new student(102, "Bob", 1500.50f);
        student s3 = new student();
        s1.displaydetails();
        s2.displaydetails();
        s3.displaydetails();
    }
}