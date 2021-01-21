package day50_Polymorphism;

import day44_Inheritance.WebDriverTask.ChromeDriver;
import day44_Inheritance.WebDriverTask.CybertekDriver;
import day44_Inheritance.WebDriverTask.FireFoxDriver;
import day44_Inheritance.WebDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.Iphone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;

public class PolymorphismIntro { // parent can be reference to child only

    public static void main(String[] args) {

     //   Iphone iphone1 = new Iphone("Iphone 12", "small", "Black",1000);
     //   Samsung samsung1 =  new Samsung("Galaxy S20", "Medium", "White",900);
        Phone phone1 = new Samsung("Galaxy S21", "Medium", "White",1100); // is a relation
        Phone phone2 = new Samsung("Iphone 12", "Small", "White",1000); // is a relation

        ArrayList<Phone> phones = new ArrayList<>(); // if <Iphone> can't store other object only iphone
        phones.add(new Iphone("Iphone 11", "Small", "Black",1000));
        phones.add(new Samsung("Galaxy S10", "Medium", "White",1100));


        Shape shape;
      //  shape = new Circle(3);
      //  shape = new Rectangle(3,4);
        shape = new Cube(5);
        System.out.println(shape.area());

        System.out.println("=============================================");
        String browserName = "firefox";

        WebDriver driver;

        switch (browserName){
            case "firefox":
                driver = new FireFoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "cybertek":
                driver = new CybertekDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser Name");
        }



    }


}
