package day25_Array;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel" };
        // index num:        0       1       2       3       4

        System.out.println( names[2] );

        String str1 = names[0];
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 75,};
                //      0   1   2   3   4
        // Erjon : 70

      /*
        System.out.println(names[2] + " : " + score[2]);
        System.out.println(names[3] + " : " + score[3]);
        */
        System.out.println("======================================");

        for (int i = 0; i < names.length ; i++) { // 0,1,2,3,4
            System.out.println(names[i] + " : " + score[i]);

        }









    }
}
