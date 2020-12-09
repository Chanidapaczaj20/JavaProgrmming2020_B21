package day10_IfElseTriangle;
// logical operator : ||, && !
public class Logical {

    public static void main(String[] args) {


        // || : return false if all express are false,

        boolean r1 = 10 < 9 || 20 != 20;
                //  false   ||  false
                //  false

        System.out.println(r1);

        boolean r2 = "Muhtar" == "Good guy" || "Muhtar" != "Bad guy";
                 //      false      ||              true
                // true

        System.out.println(r2);


        boolean r3 = 'a' != 'A'   || 'B' == 'B';
                //  true  || true
               // true

        System.out.println(r3);


        // && : return true only if all expression are true

        boolean r4 = 200 > 100 && 200 < 300;
        // true && true
        // true

        System.out.println(r4);


        boolean r5 = true && false;
                //    false

        System.out.println(r5);

        // ! : return the opposite of the boolean

        System.out.println( !true );   // false
        System.out.println( !false );   // false



    }
}
