package day44_Inheritance.ShapesTask;

public class Triangle extends Shape{

    public double height, base, side;

    public Triangle(String name, double height, double base, double side) {
        super("Triangle");
        this.height = height;
        this.base = base;
        this.side = side;
    }

    public double calculateArea(){
        return base * height * 0.5;
    }


    public double calculatePerimeter(){
        return base + side * 2;
    }


}
