package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int min = 2147483647;

        for (int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n < min){
                min = n;
            }
        }
        System.out.println("Min = "+min);











    }
}

/*
2.  write a program that asks user to enter 5 numbers and returns the minimum number
 */