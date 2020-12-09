package Day12_Nestedif;

public class browserName {

    public static void main(String[] args) {
        String browserName = "firefox";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = "";

        if (valid) {

            if (browserName == "chrome") {
                selectedBrowser = "CHROME BROWSER";
            } else if (browserName == "firefox") {
                selectedBrowser = "FIREFOX BROWSE";
            } else if (browserName == "opera") {
                selectedBrowser = "OPERA BROWSER";
            } else if (browserName == "safari") {
                selectedBrowser = "SAFARI BROWSER";
            } else if (browserName == "edge") {
                selectedBrowser = "EDGE BROWSER";
            } else {
                selectedBrowser = "INTERNET EXPLORE";
            }

        } else {
            System.out.println("No such a browser");
        }


        System.out.println(selectedBrowser);


    }


}



/*
write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected

 */