package day16_Scanner;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the browser type");
        String browser = input.nextLine();

        input.close();

        switch (browser){
            case "CHROME":
            case "chrome":
                System.out.println("Chrome is opening");
                break;
            case "firefox":
                System.out.println("Firefox is opening");
                break;
            case "opera":
                System.out.println("opera is opening");
                break;
            case "safari":
                System.out.println("Safari is opening");
                break;
            case "internext explorer":
                System.out.println("Internet explorer is opening");
                break;
            default:
                System.out.println(browser+ " is not valid");


        }


    }
}

/*Write a program that will ask the user to enter a browser type (firefox, chrome, safari, opera) Handle case sensitivity
        If a valid browser type is entered print "Browser_type is opening..."
        If the given browser is not valid print "Browser_type is not a valid browser*
 */