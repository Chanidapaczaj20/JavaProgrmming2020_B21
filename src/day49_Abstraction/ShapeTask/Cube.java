package day49_Abstraction.ShapeTask;

public final class Cube extends Shape implements Volume{
    private double side;

    public Cube(double side) {
        super("Cube");
        if (side <= 0){
            throw new RuntimeException("No such a cube side of "+side);
        }
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        Square square = new Square(side);
        return square.area() * 6;
    }
    //new Square(side).calculateArea()*6;
    //6 * side * side
    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= '" + df.format(area() ) + '\'' +
                ", perimeter= '" + df.format(perimeter()) + '\'' +
                ", volume= '" + df.format( volume() ) + '\'' +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
