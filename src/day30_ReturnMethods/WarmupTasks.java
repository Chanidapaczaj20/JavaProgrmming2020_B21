package day30_ReturnMethods;

import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        positiveNegativeZero(123);
        positiveNegativeZero(-20);
        positiveNegativeZero(0);

        System.out.println("===================================================");

        int[]numbers = {1,2,3,4,-5,-6,-7,-8,10,-11,0};

        //for(int i = 0; i <= numbers.length-1; i++){
       // positiveNagativeZero(numbers[i]  );
        for (int each : numbers){
       positiveNegativeZero(each);
        }

       System.out.println("===================================================");

       gradeCalculator(85);
       gradeCalculator(-120);

        System.out.println("===================================================");

        int[] a1 = {10,50,60,70};
        int[] a2 = {20,90,100};

        combineTwoArrays(a1,a2);

        System.out.println("===================================================");

        removeDuplicates("aaaaaaaabbbbbbbbbcccccccddddd");

        String str = "ppppppppooooooiiiiuuuuyyyyttt";
        removeDuplicates(str);

        System.out.println("===================================================");

        formattedFullName("Daow","Chanidapa");
        formattedFullName("cYbErTeK", "SCHOOL");







    }
    // Task2
    public static void positiveNegativeZero(int number){
        String result = (number > 0)?"Positive" : (number <0)?"Negative" : "Zero";
        System.out.println(number+" is "+result);

    }

    // Task2
    public static void gradeCalculator(int score){
        if (score >= 0 && score <= 100) {
          if (score >= 90){
              System.out.println("A");
          }else if(score >= 80){
              System.out.println("B");
          }else if(score >= 70){
              System.out.println("C");
          }else if(score >= 60) {
              System.out.println("D");
          }else{
              System.out.println("F");
          }
         //   System.out.println( (score >= 90)? 'A': (score >= 80)?'B':(score >=70)?'C': (score >= 60)? 'D' : 'F' );

        }else{
            System.out.println("Invalid score");

        }
    }

    // Task3
                                            // {1,2,},{3,4,5}
    public static void combineTwoArrays(int[] arr1,int[]arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;

        for (int each : arr1){
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        for (int each : arr2){
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of third array
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    // Task4                                "aabccd"
    public static void removeDuplicates(String str){
        String result = ""; // "abc"
        for (String each : str.split("") ) { // each: [a,a,b,c,c,b]     for (char each : str.toCharArray() ) {
            if (result.contains(each)) {                                    // if (!result.contains(""+each))
                continue;                                                   // result += each;
            } else {
                result += each;
            }
        }
        // หรือใช้ for loop ก็ได้
        System.out.println(result);

    }
// หรือใช้ for loop ก็ได้
    /*
    for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
     */
    // Task5                                ("cYbErTeK", "SCHOOL");
    public static void formattedFullName(String first, String last){
        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();
        String fullName = first+ " " + last;

        System.out.println(fullName);

    }



}
/*
 1. create a function that can check if the given integer is positive, negative or zero
    2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays
    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */