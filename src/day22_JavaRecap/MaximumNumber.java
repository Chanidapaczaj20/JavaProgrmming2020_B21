package day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
/*
        scanner object: 1
        max: 1

        "enter a number": 5
        nextInt(): 5

        "maximum number is ... ": 1
         */

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // user most likely to enter a number that greater than -99999999

        for (int i =1; i <= 5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if(n > max){
                max = n;
            }

        }

        scan.close();

        System.out.println("max = " + max);
            


/*
1.  write a program that asks user to enter 5 numbers and retuns the maximum number
 */
    }
}