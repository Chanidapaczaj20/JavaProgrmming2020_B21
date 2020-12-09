package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharactersList {

    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhaqwer%^879";

        // "a" "b" "c" "d" "@" "!" "#" ...

        //  0
        // String str = "a"
        // char firstCharacter = str.charAt(0)

        ArrayList<String>digits = new ArrayList<>(Arrays.asList(str.split("") ) );
        digits.removeIf( p -> !Character.isDigit(p.charAt(0) )  );
        System.out.println(digits);


        ArrayList<String>letters = new ArrayList<>(Arrays.asList(str.split("") ));
        letters.removeIf( p -> !Character.isLetter(p.charAt(0))); // charAt(0) convert string to char
        System.out.println(letters);

        ArrayList<String>specialCharacters = new ArrayList<>(Arrays.asList(str.split("") ));
       specialCharacters.removeIf( p -> Character.isLetterOrDigit(p.charAt(0) ) );
       // specialCharacters.removeAll(digits);
       // specialCharacters.removeAll(letters);
        System.out.println(specialCharacters);






    }
}
