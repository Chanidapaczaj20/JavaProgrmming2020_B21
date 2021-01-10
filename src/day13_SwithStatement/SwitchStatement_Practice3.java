package day13_SwithStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {
        String browser = "chrome";

        String selectedBrowser = "";

        switch (browser) {
            case "chrome" : selectedBrowser= "CHROME BROWSER";
                break;

            case "firefox": selectedBrowser = "FIREFOX BROWSER";
                break;

            case "opera": selectedBrowser= "OPERA BROWSER" ;
                break;

            case "safari": selectedBrowser = "SAFARI BROWSER";
                break;

            case "edge": selectedBrowser = "EDGE BROWSER" ;
                break;

            case "ie" : selectedBrowser= "INTERNER EXPLORE BROWSER";
                break;

            default: selectedBrowser = "INVALID BROWSER";
                break;
        }

        System.out.println(selectedBrowser);


    }
}





