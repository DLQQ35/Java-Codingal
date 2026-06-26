package lesson_8;
class hillstations {
    void location() {
        System.out.println("Location is:");
    }
    void famousfor() {
        System.out.println("Famous for:");
    }
}

class manali extends hillstations {
    void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    void famousfor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
    }
}

class mussoorie extends hillstations {
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }
    void famousfor() {
        System.out.println("Mussoorie is famous for its educational institutions and peaceful atmosphere.");
    }
}

class shimla extends hillstations {
    void location() {
        System.out.println("Shimla is located in Himachal Pradesh.");
    }
    void famousfor() {
        System.out.println("Shimla is famous for its colonial architecture and pleasant climate.");
    }
}

class gulmarg extends hillstations {
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }
    void famousfor() {
        System.out.println("Gulmarg is famous for its skiing and snowboarding opportunities.");
    }
}
public class HillStation {
    public static void main(String[] args) {
        hillstations a = new hillstations();
        hillstations m = new manali();
        hillstations mu = new mussoorie();
        hillstations s = new shimla();
        hillstations g = new gulmarg();

        a.location();
        a.famousfor();

        m.location();
        m.famousfor();

        mu.location();
        mu.famousfor();

        s.location();
        s.famousfor();

        g.location();
        g.famousfor();
    }
}
