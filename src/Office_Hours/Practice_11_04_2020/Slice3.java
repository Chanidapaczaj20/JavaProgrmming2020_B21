package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class Slice3 {

    public static void main(String[] args) {

        int number, digit1, digit2, digit3, digit4, digit5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = scan.nextInt();
        String str = "" + number;

        digit1=0;
        digit2=0;
        digit3=0;
        digit4=0;
        digit5=0;

        for (int i =0, j=1 ; i <= str.length()-1; i++,j++){

            digit1=number/10000;
            digit2=number % 10000  / 1000;
            digit3=number % 10000 % 1000   / 100 ;
            digit4=number % 10000 % 1000 % 100 / 10 ;
            digit5=number % 10000 % 1000 % 100 % 10 ;

        }







    }
}



