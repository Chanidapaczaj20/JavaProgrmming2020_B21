package day20_ForLoop;



public class StringReverse {

    public static void main(String[] args) {
        String str = "ABCD";
        //            0123

        String result = "";  // cba


        for(int i = str.length()-1; i>= 0; i--){ // 3,2,1,0
            result += str.charAt(i); // D,C,B,A
        }

        System.out.println("result = " + result);





    }
}

/*
5. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC

 */