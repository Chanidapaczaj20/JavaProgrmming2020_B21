package day23_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String sentence = "Java is a programing language, I like to learn Java Java Java Java";
                            // " is a programing language, I like to learn Java"
                            // " is a programing language, I like to learn "
        String word = "Java";

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, ""); // we  need to remove one at a time to count
            count++;
        }

        System.out.println(count);
        System.out.println(sentence);

        /*
        Warmup task:
    1. write a program that can return the frequency of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2

         */






    }


}
