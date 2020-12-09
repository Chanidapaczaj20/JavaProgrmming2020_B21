package Day11_MutiBranchif;

public class MaxMin1 {

    public static void main(String[] args) {
        int a =10000; // return in number
        int b =200;

        int max1 = 0;
        if( a>b ){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println("Max number in if: "+max1);

        int max2 = ( a>b ) ? a : b;
        System.out.println("Max number in Ternary: "+max2);

        System.out.println("=================================");
        int min1 = 0;
        if( a<b ){
            min1 = a;
        }else{
            min1 = b;
        }

        System.out.println("Mininum number in if: "+min1);

        int min2 =( a<b ) ? a : b ;

        System.out.println("Mininum number in Ternary: "+min1);






    }
}


/*
1. write a program that can find the maximum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement
    2. write a program that can find the minimum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement
 */