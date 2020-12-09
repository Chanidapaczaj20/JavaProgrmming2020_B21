package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {
        char n = 'W';

        System.out.println( Character.isDigit(n) );
        System.out.println(Character.isLetter(n));


        String str = "a1b2c3b4c56T@w$y%o^p%";

        String digits = "";
        String lettters = "";
        String specialChar = "";

        for (char each : str.toCharArray()){
            if (Character.isDigit(each) ){
                digits += each;
            }else if(Character.isLetter(each) ){
                lettters += each;
            }else{
                specialChar += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("lettters = " + lettters);
        System.out.println("specialChar = " + specialChar);



    }
}
