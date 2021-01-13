package day44_Inheritance.ShapesTask;

public class Triangle extends Shape{

    public double height, base, side;

    public Triangle( double height, double base, double side) {
        setInfo("Triangle");
        this.height = height;
        this.base = base;
        this.side = side;
    }

    public double calculateArea(){
        return 0;
    }


    public double calculatePerimeter(){
        return 0;
    }


}
