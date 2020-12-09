package day20_ForLoop;

import java.util.Scanner;

public class StringReverse2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine();

        String result = "";
        int lastIndex = word.length()-1;

        for (int i = lastIndex; i >= 0; i--){
            result += word.charAt(i);
        }
        System.out.println("result = " + result);

        boolean isPalindrome = result.equalsIgnoreCase(word);
        if (isPalindrome){
            System.out.println(result+ " is palindrome");
        }else{
            System.out.println(result+ " is not palindrome");
        }


    }
}
