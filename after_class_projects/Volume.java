package after_class_projects;
class Figure{
    public double getVolume()
    {
        return 0;
    }
}
class Cube extends Figure{
    private double side;
    public Cube(double side)
    {
        this.side = side;
    }
    public double getVolume()
    {
        return side * side * side;
    }
}
class Cylinder extends Figure{
    private double radius;
    private double height;
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double getVolume()
    {
        return Math.PI * radius * radius * height;
    }
}
public class Volume {
    public static void main(String[] args) {
        Figure[] fig = new Figure[2];
        fig[0] = new Cube(3);
        fig[1] = new Cylinder(2, 5);
        System.out.println("Volume of cube: " + fig[0].getVolume());
        System.out.println("Volume of cylinder: " + fig[1].getVolume());
    }
}