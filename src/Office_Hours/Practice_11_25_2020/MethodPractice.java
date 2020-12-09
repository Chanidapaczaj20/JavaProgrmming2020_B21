package Office_Hours.Practice_11_25_2020;

public class MethodPractice {

    public static void main(String[] args) {

        divisibleBy3Between1To100();
        System.out.println("Hello");

        divisibleBy3(100,10);

        System.out.println("Test");

        grade(95);

        grade(-50);
        eligibleToVote(25,false);




    }

    public static void divisibleBy3Between1To100(){

        for (int i = 0 ; i <= 100; i++){
            if (i%3 != 0) {     //  if (i%3 == 0) {
                continue;       // System.out.print(i+" ");
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void divisibleBy3(int start, int end){

        if (end<= start){
            System.out.println("Invalid number");
            //System.exit(0);
            return; // exists the current method
        }

        for (int i = start ; i <= end; i++){
            if (i%3 != 0) {     //  if (i%3 == 0) {
                continue;       // System.out.print(i+" ");
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /*
    A: Excellent
    B: Great
    C: Good
    D: Passed
    E:  Failed
     */

    public static void grade(int score){
        if(score<0 || score >100){
            System.out.println("Invalid score");
            return;
            //}else{
        }

       char grade = (score >= 90)?'A': (score >= 80)?'B':(score >= 70)?'C':(score >= 60)?'D':'F';
        // you can use String, don't forget to change '' to ""

        switch (grade){
            case 'A':
                System.out.println("Excellent, you made an A ");
                break;
            case 'B':
                System.out.println("Great, you made an B ");
                break;
            case 'C':
                System.out.println("Good, you made an C ");
                break;
            case 'D':
                System.out.println("Passed, you made an D ");
                break;
            default:
                System.out.println("Failed, you made an F");
        }

    }

    public static void eligibleToVote(int age, boolean isUSCitizen){
        if(age<18){
            System.out.println("You must be at least 18 years old");
            return;
        }
        if (isUSCitizen == false){
            System.out.println("You must be a US citizen in order to vote");
            return;
        }

        System.out.println("You are eligible to Vote");




    }
}
