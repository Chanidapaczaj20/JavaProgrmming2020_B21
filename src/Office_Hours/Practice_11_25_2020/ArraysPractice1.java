package Office_Hours.Practice_11_25_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 30;
        arr[1] = 50;
        arr[2] = 0;
        arr[3] = 25;
        arr[4] = 15;
        System.out.println(Arrays.toString(arr));
        System.out.println("==========================================================================================");
        int[]numbers = new int[100];
        for (int i = 0; i <= numbers.length-1; i++){
            numbers[i] = i+1;
                /*
                    0 = 0+1 = 1
                    1 = 1+1 = 2
                    2 = 2+1 = 3

                 */
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("==========================================================================================");

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for ( int each : numbers){
            if (each %2 == 0){
                even.add(each);
            }else{
                odd.add(each);
            }
        }
        System.out.println("odd: " + odd);
        System.out.println("even: " + even);





    }
}
