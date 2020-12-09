package day22_JavaRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

      String str = "AAAAAABBBBCCCCCCCCCDDDDEEEEEFFFFFF";  // A,A,A,B,B
      String result = "";

      for(int i =0; i <= str.length()-1; i++){

          String eachCharacter = ""+str.charAt(i); // A,B,B,C,C

          if(result.contains(eachCharacter)){
              continue;
          }else{
              result += eachCharacter;
          }

            /*
            if(!result.contains(eachCharacter)){
                result += eachCharacter;
            }

             */

          //  result += (!result.contains(eachCharacter))? eachCharacter : "";

      }

        System.out.println("result = " + result);


    }


}


