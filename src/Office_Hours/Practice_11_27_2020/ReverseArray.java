package Office_Hours.Practice_11_27_2020;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { // or j <= 0
            reverse[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));

        double[] arr2 = {100, 200, 300, 400, 500};
        arr2 = reverse(arr2);

        System.out.println(Arrays.toString(arr2));

        char[]ch1 = {'A','B','C'};
        ch1 = reverse(ch1);
        System.out.println(Arrays.toString(ch1));

    }

    public static int[] reverse(int[] arr) {

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { // or j <= 0
            reverse[j] = arr[i];
        }
        return reverse;

    }

    public static double[] reverse(double[] arr) {

        double[] reverse = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { // or j <= 0
            reverse[j] = arr[i];
        }
        return reverse;

    }

    public static char[] reverse(char[] arr) {

        char[] reverse = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { // or j <= 0
            reverse[j] = arr[i];
        }
        return reverse;

    }

    public static String[] reverse(String[] arr) {

        String[] reverse = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { // or j <= 0
            reverse[j] = arr[i];
        }
        return reverse;

    }



    }
