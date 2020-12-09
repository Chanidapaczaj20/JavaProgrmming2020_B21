package day27_ForEachLoop;

public class UniqueIntergers2Interview {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,1};



        for (int each2 : arr){

            int frequency = 0;
            for (int each : arr) {
                if (each == each2) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(each2+" ");
            }

        }

    }
}
