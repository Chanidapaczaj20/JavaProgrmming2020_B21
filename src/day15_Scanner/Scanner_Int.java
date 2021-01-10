package day15_Scanner;

import java.util.Scanner;
//import Day14_Switch_Recap.SalaryCalculator;

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner objeat called scanner

        System.out.println("Enter number one:");
        int numOne = scanner.nextInt();  // reading an in number

        System.out.println("Enter number two:");
        int numTwo = scanner.nextShort();  // reading an in number

        System.out.println("Number one is: " + numOne);
        System.out.println("Num two is: "+ numTwo);
        System.out.println("Sum "+ (numOne+numTwo));


    }
}
