package day13_SwithStatement;

public class ABCTesting {

    public static void main(String[] args) {
        char letter = 'T';
        String result = "";

        switch(letter){
            case 'A':
                result = "A";
                 break;
            case 'B':
                result = "B";
                break;
            case 'C':
                result = "C";
                break;
            case 'D':
                result = "D";
                break;
            case 'E':
                result = "E";
                break;

            default :
                result = "NOT FOUND";
                break;
        }

        System.out.println(result);


    }
}


 /*
        Task
        Create a new switch statement using char instead of int.
        Create a new char variable
        Create a switch statement testing for A, B, C, D or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found.
         */