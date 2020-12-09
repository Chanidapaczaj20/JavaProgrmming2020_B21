package day16_Scanner;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // make scanner object

        System.out.println("Enter number one");
        double numberOne = input.nextDouble(); // accept the first number

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble(); // accept the second number

        System.out.println("Enter the operator");
        String operator =  input.next();// accept the operator

        input.close();// Closing the Scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;

        switch (operator){
            case "plus":
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "x":
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne % numberTwo;
                break;
            default:
                isValid = false;
        }

        if(isValid) {
            System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);
        } else {
            System.out.println(operator + " is an invalid operator");
        }




    }

}
