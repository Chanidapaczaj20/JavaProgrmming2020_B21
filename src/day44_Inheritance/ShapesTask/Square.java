package day44_Inheritance.ShapesTask;

public class Square extends Shape{

    /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
 */
    public double side;

    public Square(double side){
        setInfo("Square");
        this.side = side;

    }

    public double calculateArea(){
        return 0;
    }


    public double calculatePerimeter(){
        return 0;
    }




}
