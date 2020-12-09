package day21_whileLoop;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println(" " + f + l);
        //                  106+97=203

        System.out.println("========================================");

        while (true) {
            System.out.println("Enter building number: ");
            String building = scan.next();

            scan.nextLine();

            System.out.println("Enter street name: ");
            String street = scan.nextLine();

            System.out.println("Enter your apartment number: ");
            String apartment = scan.next();

            scan.nextLine();

            System.out.println("Enter your city name: ");
            String city = scan.nextLine();

            System.out.println("Enter your state name: ");
            String state = scan.nextLine();

            System.out.println("Enter your Zip Code: ");
            int zip = scan.nextInt();

            String fullAddress = building + " " + street + ", Apt#" + apartment + "\n" + city + ", " + state + " " + zip;
            System.out.println(fullAddress);

            System.out.println("Would you like to Continue? Yes,No");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }


        }
    }
}
