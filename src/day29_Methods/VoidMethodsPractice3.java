package day29_Methods;

public class VoidMethodsPractice3 {

    public static void main(String[] args) {

      eligibleToVote("John","USA",45,true);

      eligibleToVote("Daniel","Japan",35,true);

      eligibleToVote("Aron","usa",13,true);

    }


    public static void eligibleToVote(String name ,String citizenShip, int age,boolean isAlive){

        if (citizenShip.equalsIgnoreCase("USA")){

           if (isAlive){
               if (age >= 18){
                   System.out.println(name + ", you are eligible to vote");
               }else{
                   System.out.println(name +", you must be at least 18 years old");
               }

           }else{
               System.out.println(name +", you must be come back to life in order to vote");
           }

       }else{
           System.out.println(name +", you must be citizen of USA");
       }




    }
}
