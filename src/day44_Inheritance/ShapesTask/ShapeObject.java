package day44_Inheritance.ShapesTask;

public class ShapeObject {

    public static void main(String[] args) {

       Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println(circle.calculateArea());
     //   Circle.staticMethod();
       // Circle.calculateArea(); // methods that are not static cannot be called from the class, only from instance
     //   circle.staticMethod();
        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());


    }


}
