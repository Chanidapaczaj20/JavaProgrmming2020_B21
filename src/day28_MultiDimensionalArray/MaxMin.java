package day28_MultiDimensionalArray;

public class MaxMin {

    public static void main(String[] args) {
        int[][] numbers = {{10,20,30},{40,50,60,70,80}};

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] eachArray : numbers){
            for (int eachNumber : eachArray){
                if (max<eachNumber){
                    max = eachNumber;
                }
                if (min>eachNumber){
                    min = eachNumber;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
