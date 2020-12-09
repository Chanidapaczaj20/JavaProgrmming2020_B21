package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");

        int  score = scan.nextInt();
        scan.close();

      String grade = "";

      if(score >= 0 && score <= 100){

          if(score >= 90){  // become false when score < 90
              grade = "Exellent";
          }else if(score>= 80){
              grade = "Great";
          } else if (score >= 70) {
              grade = "Good";
          }else if(score >=60){
              grade = "Passed";
          }else{
              grade = "Fail";
          }

      }else{
          grade = "Invalid";
      }

        System.out.println(grade);

        // grade = (score >= 90)? "Excellent" :(score>= 80 )? "Great" :(score >= 70)? "Good"
        //                    :(score >= 60)? "Passed" : "Fail";


    }

}

/*
pre condition: 0 - 100
A: 90-100
B:80-89
C:70-79
D: 60-69
F:0-59

 */
