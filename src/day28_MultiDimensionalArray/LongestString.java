package day28_MultiDimensionalArray;

public class LongestString {

    public static void main(String[] args) {
        String[] names = {"Javid","Sayyohat", "Maryam", "Awstralopite","CJ"};

        String longest = names[0];
        String shortest = names[0];

        for (String each : names ){

            if (each.length() > longest.length() ){
                longest = each;
            }
            if (each.length() < shortest.length()){
                shortest =each;
            }
        }

        System.out.println("Longest = "+longest);
        System.out.println("Shortest = "+shortest);


    }
}
