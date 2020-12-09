package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);       // index 0
        list.add(20);       // index 1
        list.add(30);       // index 2
        list.add(40);       // index 3
        list.add(40);       // index 4
        list.add(10);       // index 5
        list.add(50);       // index 6

       int n1 = list.indexOf(10);
       int n2 = list.lastIndexOf(10);
        System.out.println(n1); // 0
        System.out.println(n2); // 5

        System.out.println( !list.contains(60) );
        System.out.println( list.contains(40) );

        System.out.println("==========================================");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>(); // [....]

        for (char each : characters){
            if (nonDup.contains(each) ){ // if (!nonDup.contains(each) ){
                continue;               // nonDup.add(each);
            }
            nonDup.add(each);
        }
        System.out.println(nonDup);

        /*
        for(int i = 0; i <= characters.size()-1; i++ ){
            if(!nonDup.contains(characters.get(i))){
                nonDup.add(characters.get(i));
            }
        }


         */
        System.out.println("======================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);


        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list1.equals(list2));// true
        System.out.println(list1 == list2); // false different location

        System.out.println("======================================");

        list1.clear();
        list2.clear();
        System.out.println(list1.isEmpty() ); // false
        System.out.println(list2.isEmpty() ); // false ถ้าใช้ clear method before print  is True








    }
}
