package day23_nestedLoop;

public class CatDog {

    public static void main(String[] args) {

        String sentence = "dog dog Dog Dog Cat cAt CAt";

        String temp = sentence.toLowerCase();

        int countDog = 0;
        String word = "dog";
        while (temp.contains(word)){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("Number of dogs: "+countDog);

        int countCat = 0;
        word = "cat";
        while (temp.contains(word)){
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("Number of cats: "+ countCat);
        System.out.println(countCat==countDog);


    }
}
