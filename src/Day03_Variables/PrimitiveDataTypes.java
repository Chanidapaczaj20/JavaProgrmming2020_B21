package Day03_Variables;

/*
 declare variables;
        DataTypes name = Data;
 */

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // declare
        float myvariable;

        // assign
        myvariable = 2;

        //  declare and assign
        double my_new_variable = 5;

        // score is 85
        double  score = 85;


        System.out.println( score );
        System.out.println("score");

     //   long number0 = 9999999999;
        // int is prefered, compiler takes it as an it, and the number 9999999999 is out of int' range

        long number1 = 9999999999L;

        double decimal1 = 0.5;
       // float float1 = 0.5; // double is prefered for decimails, compiler takes it as, double' range is greater than float
               float float2 = 0.5f;

        System.out.println(float2); //0.5

        /*
        in future: int
        for decimal: double


         */


    }

}

