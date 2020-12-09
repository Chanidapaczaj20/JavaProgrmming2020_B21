package Office_Hours.Practice_11_26_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LoopPractice {
    public static void main(String[] args) {

        System.out.print("All numbers: ");
        for (int i =0; i <= 50; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        // even number

        System.out.print("Even Numbers: ");
        for (int i = 2; i <= 50; i+=2){
            System.out.print(i+ " ");
            }

            System.out.println();

        // odd number
        System.out.print("Odd number: ");
        for ( int i = 1; i <= 49; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("========================================================================================");

        for (int i = 1; i <= 50 ; i++){
            if (i%2!=0){
                continue;
            }
            System.out.print(i+" ");


        }
        System.out.println();

        for (int i = 1; i <= 50 ; i++){
            if (i%2 ==0){
                continue;
            }
            System.out.print(i+" ");
            if (i==29){
                break;
            }
        }









        }

    }

