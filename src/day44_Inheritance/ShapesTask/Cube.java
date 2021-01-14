package day44_Inheritance.ShapesTask;

public class Cube extends Shape{

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    public double calculateArea() {
                                // หาพื้นที่ของสี่เหลี่ยมก่อน 1  ด้านจากนั้น คูณด้วย 6 (จำนวนด้านของลูกบิด)
                                // เช่น 4x4 = 8  พื้นที่นี้มีค่าเท่ากับ 8 แล้วคูนด้วยหก --> 8x6 = 48
        return new Square(side).calculateArea()*6; // 6 side 6 square
    }                           // return you area of one square in this cube with this side then * 6
    //   Square square = new Square(side); // one square of the cube
    //   double area = square.calcArea(); // are of one square
     //     หรือใช้   return  side * side * 6 ;

    @Override
    public double calculatePerimeter() { // ความยาวรอบรูป
        return side * 12 ; // เส้นรอบลูกบิดมี 12 เส้น
    }


}
