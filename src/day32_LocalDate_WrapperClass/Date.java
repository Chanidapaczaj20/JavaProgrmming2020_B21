package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

       // LocalDate d1 = LocalDate.of(2019,2,29);
      //  System.out.println(d1);
        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate DofB = LocalDate.of(1990,7,28);

        System.out.println(DofB.isLeapYear());

        System.out.println("=========================");

        String[]classMates = {"Ally","Cece","Kate","Chanidapa","Grant"};
        LocalDate[] birthDays = {LocalDate.of(1995, 9,11),
                LocalDate.of(1992, 4,29),LocalDate.of(1994, 9,10)
                ,LocalDate.of(1990, 7,28),LocalDate.of(1993, 8,30)};

        for (int i = 0; i <= birthDays.length-1; i++){
            System.out.println(classMates[i]+"' birthday is: "+ birthDays[i]);
            System.out.println(classMates[i]+ " was born on leap year: " + birthDays[i].isLeapYear());

        }

    }
}
