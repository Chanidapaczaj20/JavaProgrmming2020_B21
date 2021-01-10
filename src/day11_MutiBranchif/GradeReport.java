package day11_MutiBranchif;

public class GradeReport {

    public static void main(String[] args) {
        int score = 70; // 0 ~ 100

        String result = "";

        if(score < 60){
            result = "failed";
        }else if(score >= 60 && score < 90){
            result = "Passed";
        }else{ // score >= 90
            result = "Passed with distinction";
        }


        System.out.println(result);




    }
}


/*
         if(score < 60){
            System.out.println("Failed");

        }else if(score >= 60 && score < 90){
            System.out.println("Passed");

        }else{ // score >= 90
            System.out.println("Passed with distinction");
        }
 */