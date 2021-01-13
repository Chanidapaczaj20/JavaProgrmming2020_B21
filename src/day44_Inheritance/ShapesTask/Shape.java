package day44_Inheritance.ShapesTask;

public class Shape {
    public String name;
    public final static boolean isShape, hasArea,hasPerimeter;

    public void setInfo(String name){
        this.name = name;
    }

    static {
        isShape = true;
        hasArea= true;
        hasPerimeter =true;
    }

    public double calculateArea(){
        return 0;
    }


    public double calculatePerimeter(){
        return 0;
    }



    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", Area= '" + calculateArea() + '\'' +
                ", Perimeter= '" + calculatePerimeter() + '\'' +
                '}';
    }
}
/*
1. create a class called Shape
						variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
						methods: setInfo, calcArea(), calcPerimeter()
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
 */