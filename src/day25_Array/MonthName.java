package day25_Array;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "March", "April", "May", "June", "july", "August", "Sep", "Oct", "Nov", "Dec"};
        //                  0       1       2       3
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        System.out.println( "The month name is: "+ month[num-1] );





    }
}
