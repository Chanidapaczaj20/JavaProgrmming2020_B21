package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = ""; // A3b2C1D4E3

        ArrayList<String> list = new ArrayList<>();
        // ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split(""))  ); // in order to be able to use frequency method
        for (String each : str.split("")){
            list.add(each);     // split to each index of str
        }

        for(String each : list){
            int frequency = Collections.frequency(list,each);
            if(!result.contains(each)){
                result += each+frequency;
            }

        }

        System.out.println(result);





    }
}
