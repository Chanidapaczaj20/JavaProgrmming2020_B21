package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        //             01234
        scan.close();

        String result = ""; // "re"

        //result +=name.charAt(name.length()-1);

        for (int i= name.length()-1; i >=0; i--){
            result += name.charAt(i);
            // result += name.substring(1,1+1);
        }
        System.out.println(result);
















    }
}
