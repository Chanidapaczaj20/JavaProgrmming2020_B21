package Office_Hours.Practice_11_25_2020;

import Day04_Variables.SalaryCalculator;

import java.util.Scanner;

public class LoopPractice2 {

    public static void main(String[] args) {
        /*
        salary calculator
        hourlyRate
        weeklyRate
        tax rates 30%
         */

       Scanner scan =  new Scanner(System.in);
        double hourlyRate = 0;
        int weeeklyHour = 0;
        String answer = "";

        while (!answer.equals("no")) {
            System.out.println("Enter your hourlyRate");
            hourlyRate = scan.nextDouble();

            System.out.println("How many hours do you work in a week?");
            weeeklyHour = scan.nextInt();

            double salary = weeeklyHour * hourlyRate * 52;
            System.out.println("your salary: " + salary);
            double tax = salary * 0.3;
            System.out.println("Your tax: " + tax);
            double salaryAfterTax = salary - tax;
            System.out.println("Your salary after tax: " + salaryAfterTax);

            System.out.println("Would you like to continue?");
            answer = scan.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no")) ){
                System.out.println("Would you like to continue?");
                answer = scan.next().toLowerCase();

            }

        }



    }
}
