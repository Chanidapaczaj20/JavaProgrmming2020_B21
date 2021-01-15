package day49_Abstraction.ShapeTask;

public class Octagon extends Shape {
    public double n, a;

    public Octagon(String name, double n, double a) {
        super("Octagon");
        this.n = n;
        this.a = a;
    }

    @Override
    public double area() {
        return 0;
    }
// you can overload if you need it
    @Override
    public double perimeter() {
        return 0;
    }



}
