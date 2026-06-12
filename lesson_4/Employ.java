package lesson_4;
class Employee{
    int empno;
    String name;
    float sal;

    Employee(){
        System.out.println("******");
        empno = 1001;
        name = "ABC";
        sal = 25565555f;
    }
    void display(){
        System.out.println(empno + "|" + name + "|" + sal );
    }
}
public class Employ {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.display();
        Employee emp2 = new Employee();
        emp2.display();
        Employee emp3 = new Employee();
        emp3.display();
    }
}
