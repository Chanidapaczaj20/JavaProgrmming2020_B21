package day44_Inheritance.ShapesTask;

public class Square extends Shape{

    /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
 */
    public double side;

    public Square(double side){
        super("Square");
        this.side = side;

    }

    public double calculateArea(){
        return side * side;
    }


    @Override
    public double calculatePerimeter(){
        return side*4;
    }




}
