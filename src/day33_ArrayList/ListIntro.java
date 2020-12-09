package day33_ArrayList;

import  java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>(); // size : 1

        scores.add(100);     // autoboxing          index   0
        scores.add(200);     // autoboxing           index   1
        scores.add(300);    // autoboxing            index   2

        scores.add(3,400);
        System.out.println(scores);

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0,"toilet Paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1,"N95 Mask");

        System.out.println(groceryList);

        String item1 = groceryList.get(2);// autoboxing   0
        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);

        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println(groceryList.get(groceryList.size()-1 ) );





    }
}
