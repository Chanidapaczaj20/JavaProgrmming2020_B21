package day25_Array;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your first number: ");
            double n1 = scan.nextDouble();
            System.out.println("Math Operator: ");
            char o = scan.next().charAt(0);
            System.out.println("Enter your second number: ");
            double n2 = scan.nextDouble();

            switch (o) {
                case '+':
                    System.out.println("Addition: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Invalid");
            }  // calculates the result

            scan.nextLine();
            System.out.println("Would you like to continue?");
            String a = scan.nextLine().toLowerCase();

            while (!(a.equals("yes") || a.equals("no")) ){
                System.out.println("Invalid answer, Please Re-Enter");
                System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")) {
                break;
            }

        }



    }

}







