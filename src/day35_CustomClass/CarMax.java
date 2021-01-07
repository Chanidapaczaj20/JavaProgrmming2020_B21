package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota","Camry","White",2017,10000);
        car1.getInfo();

        car2.setInfo("Honda","Civic","White",2015,15000.55);
        car2.getInfo();

        car3.setInfo("Mercede","C250","Black",1991,55000.99);
        car2.getInfo();

        car4.setInfo("BMW","i8","White",2019,98000);
        car4.getInfo();

        car5.setInfo("Audi","Q7","White",2020,105000);
        car5.getInfo();

        Car[] cars = { car1, car2, car3, car4, car5 };

        for (Car eachCar : cars){
            eachCar.getInfo();

        }

        System.out.println("==============================================================================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll( Arrays.asList( cars ) );

        carList.removeIf( p -> p.price < 25000);

        for (int i = 0 ; i <= carList.size()-1; i++ ){
             carList.get(i).getInfo();
        }









    }




}
