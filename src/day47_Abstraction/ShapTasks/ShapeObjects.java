package day47_Abstraction.ShapTasks;

public class ShapeObjects {

    public static void main(String[] args) {

        // Shape shape = new Shape("Shape");
        Circle circle = new Circle(3);
        System.out.println("Area of Circle"+circle.area());


        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Area of Rectangle"+rectangle.area());

        Square square = new Square(3);
        System.out.println("Area of Square"+square.area());



    }


}
