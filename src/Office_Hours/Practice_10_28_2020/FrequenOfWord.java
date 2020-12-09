package Office_Hours.Practice_10_28_2020;

import day21_whileLoop.WhileLoop;

public class FrequenOfWord {

    public static void main(String[] args) {
        String sentence = "Cat Cat Cat";
        String word = "Cat";

        int count = 0;

       while (sentence.contains(word)){
           sentence = sentence.replaceFirst(word, "");
           count++;
       }
        System.out.println(count);




    }
}
