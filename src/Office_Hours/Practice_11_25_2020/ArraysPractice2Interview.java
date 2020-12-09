package Office_Hours.Practice_11_25_2020;

import java.util.Arrays;

public class ArraysPractice2Interview {

    public static void main(String[] args) {
        String sentence = "Today is a great day to celebrate the thanksgiving by doing java tasks";
        String[] words = sentence.split(" ");
        String result = "";

        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >= 0; i--){
            result += words[i];
        }

        result = result.trim();
        System.out.println(result);

        System.out.println("============================================");

        int[] arr1 = new int[3];
        int[]arr2 = {1,2,3,4,5};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));






    }
}
