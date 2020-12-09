package day26_Arrays;

public class MaxNumberInArrays {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
                    //   0 1 2 3 4
        int max = numbers[0]; // 300

        for (int i =1; i <= numbers.length-1;i++){

            if(numbers[i] > max ){
                max = numbers[i];

            }
        }


        System.out.println("max = " + max);



    }
}
