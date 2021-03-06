package day44_Inheritance.ShapesTask;
// สี่เหลี่ยมผืนผ้า กว้าง x ยาว
public class Rectangle extends Shape {

    /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
     */

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double calculateArea(){
        return width * length;
    }


    public double calculatePerimeter(){
        return (width+length)*2;
    }









}
