package day11_MutiBranchif;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 7;
        String month = (n==1)? "January" :(n==2)?"February" :(n==3)?"March" :(n==4)? "April"
                :(n==5)?"May":(n==6)? "June" : (n==7)? "July" :(n==8)?"August":(n==9)?"September"
                :(n==10)?"October" :(n==11)?"November": "December";

        System.out.println(month);


    }
}





/*
 write a program that can print out the name of the month based on the number 1 ~ 12
        number = 1
        output:
            January

 */