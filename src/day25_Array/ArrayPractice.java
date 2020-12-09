package day25_Array;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] students = new String[5];
        students[0] = "Agalar";
        students[1] = "Mohammed";
        students[2] = "Afrooz";
        students[3] = "John";
        students[4] = "Anna";
/*
        System.out.println( students[0] );
        System.out.println( students[1] );
        System.out.println( students[2] );
        System.out.println( students[3] );
        System.out.println( students[4] );
*/

        for (int i =0; i < students.length ; i++){
            System.out.println(students[i]);
        }



    }
}
