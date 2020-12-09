package day23_nestedLoop;

public class oo {
    public static void main(String[] args) {

        String str = "abaacaaaaaaaaaabbbbb";
        // "abaac"

        char ch = 'b';

        int count = 0; // 1 + 1 + 1 = 3
        for(int i=0; i < str.length(); i++ ){

            char eachChar = str.charAt(i); // a, b, a, a, c

            if(eachChar == ch){
                // a
                count++;
            }

        }

        System.out.println(count);



    }

}
