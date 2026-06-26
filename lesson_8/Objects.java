package lesson_8;

abstract class objectss{
    abstract void showshape();
    public void shape() {
        System.out.println("I am from abstract class.");
    }
}

class sphere extends objectss{
    void showshape() {
        System.out.println("I am a sphere.");
    }
}

class cuboid extends objectss{
    void showshape() {
        System.out.println("I am a cuboid.");
    }
}

class prism extends objectss{
    void showshape() {
        System.out.println("I am a prism.");
    }
}

public class Objects {
    public static void main(String[] args) {
        objectss obj = new sphere();

        obj.showshape();
        obj = new cuboid();

        obj.showshape();
        obj = new prism();

        obj.showshape();
        obj.shape();
    }
}
