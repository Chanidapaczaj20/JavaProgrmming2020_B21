package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharactersInterview {

    public static void main(String[] args) {
        String str = "abbacaa"; // a4b2c1
        String result = "";

        for (int j = 0; j <= str.length() - 1; j++) {

            char ch = str.charAt(j);          // a b c
            int count = 0; // for frequency     4  2 1
            for (int i = 0; i <= str.length() - 1; i++) { // find frequency of one character by comparing it with each characters of string
                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            if (result.contains(""+ch) ){ // if the char is already in the result, we dont need to concate it again, we can skip
                continue;
            }

            result += "" + ch + count;


        }
           System.out.println(result);
    }


}
