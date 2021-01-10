package day07_LeapYear;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2030;
        boolean isLeapYear =  year % 4 < 1; // check if year is evenly divisble by 4
            //   0   <   1 ===> true

        System.out.println(year+ " is leap year: "+ isLeapYear);



    }
}

/*
create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
				year = 2020

			output:
				2020 is leap year: true


				year = 2021

			output:
				2021 is leap year: false

				>, <

				2020 % 4  < 1

		Hint: if the number of year can be evenly divisible by 4, it's known as leap year
 */
