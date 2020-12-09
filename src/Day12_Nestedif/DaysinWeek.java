package Day12_Nestedif;

public class DaysinWeek {

    public static void main(String[] args) {
        int number = 5; // any number
        String day = "";

        if(number>=1 && number<=7){

            if(number ==1){
                day = "Monday";
            }else if(number == 2){
                day = "Tuesday";
            }else if(number == 3){
                day = "Wedneseday";
            }else if(number == 4){
                day = "Thursday";
            }else if(number == 5){
                day = "Friday";
            }else if(number == 6) {
                day = "Saturday";
            }else{
                day = "Sunday";
            }
             }else{
                day= "Not such a day";
             }
                System.out.println(day);





    }
}
