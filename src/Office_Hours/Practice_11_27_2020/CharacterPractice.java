package Office_Hours.Practice_11_27_2020;

public class CharacterPractice {

    public static void main(String[] args) {


        int countSpecialChars = 0;
        int countLetter = 0;
        int countDigits = 0;

        for (int i = 0; i <= Character.MAX_VALUE; i++){
            char each = (char)i;
            if (!Character.isLetterOrDigit(each)){
                // Character.isLetter(each) for printing all letters
                countSpecialChars++;
            }else if(Character.isLetter(each) ){
                countLetter++;
            }else{
                countDigits++;
            }

        }

        System.out.println("countSpecialChars = " + countSpecialChars);
        System.out.println("countLetter = " + countLetter);
        System.out.println("countDigits = " + countDigits);



    }
}
