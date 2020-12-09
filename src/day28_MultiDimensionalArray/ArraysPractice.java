package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

/*
        ScrumTeam
            Testers:  {"Dorin", "Adil", "Fatih", "Subhi"}
            Developers: {"Kastrinsi", "Mustafa", "Ruslan"}
            SM: {"Ayse"}
            PO: {"Omid"}
            BA: {"Agalar"}
         */
            String[][]scrumTeam = {
                                    {"Dorin", "Adil", "Fatih", "Subhi"},
                                    {"Kastrinsi", "Mustafa", "Ruslan"},
                                    {"Ayse"},
                                    {"Omid"},
                                    {"Agalar"}
            };

        System.out.println(Arrays.deepToString(scrumTeam));

        for (int i = 0; i <= scrumTeam.length-1; i++){// i : index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i]) ); // prints each group in scrum team

        for (int j =0; j <= scrumTeam[i].length-1; j++ ){ // j: index of element
            System.out.println(scrumTeam[i][j]);

        }

        }

        System.out.println("====================================================================");

        for(String[]   eachGroup : scrumTeam ){ // eachGroup: represents each 1D array in scrumTeam

            System.out.println( Arrays.toString(eachGroup)  );

            for(String eachName : eachGroup){
                System.out.println(eachName);
            }

        }


    }
}
