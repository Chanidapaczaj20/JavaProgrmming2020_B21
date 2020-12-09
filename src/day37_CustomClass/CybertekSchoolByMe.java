package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchoolByMe {
    public static void main(String[] args) {
        Student[] students = { new Student(), new Student(),new Student(),
                new Student(),new Student(), new Student(),
                new Student(), new Student(),new Student(),
                new Student(),};

        students[0].setInfo("Nick",'M', LocalDate.of(1993,12,10),"B012",3.50);
        students[1].setInfo("Annie",'F', LocalDate.of(1990,1,30),"B012",2.90);
        students[2].setInfo("Clair",'F', LocalDate.of(1995,5,13),"B012",3.80);
        students[3].setInfo("Cheery",'F', LocalDate.of(1992,3,22),"B012",3.89);
        students[4].setInfo("Chris",'M', LocalDate.of(2001,6,11),"B012",3.0);
        students[5].setInfo("Emma",'F', LocalDate.of(1993,7,3),"B012",2.60);
        students[6].setInfo("Harris",'M', LocalDate.of(1990,11,15),"B012",2.75);
        students[0].setInfo("Katie",'F', LocalDate.of(1996,12,28),"B012",2.99);
        students[8].setInfo("Tedd",'M', LocalDate.of(1991,12,4),"B012",3.55);
        students[9].setInfo("Ashely",'F', LocalDate.of(1992,12,6),"B012",2.80);

        for (Student each : students){
            if(each.gpa >= 3 ){
                System.out.println(each);
            }
        }
        System.out.println("=======================================================================================");

        for (Student each : students){
            if ( each.gpa >= 2 && each.gpa <=3){
                System.out.println(each);
            }
        }
        System.out.println("=======================================================================================");

        ArrayList<Student> femaleStudents = new ArrayList<>(Arrays.asList(students));
        femaleStudents.removeIf( p -> p.gender =='M');
        System.out.println(femaleStudents);

        System.out.println("=======================================================================================");

        ArrayList<Student> maleStudents = new ArrayList<>(Arrays.asList(students));
        maleStudents.removeIf(p ->p.gender=='F');
        System.out.println(maleStudents);





    }





}
/*
tasks:
    1. create class named CybertekSchool
            create an array of Students that contains 10 objects,
            1. to print the students who has gpa of 3 or greater
            2. to print the students who has gpa between 2 to 3
            3. create two ArrayLists: femaleStudents, maleStudents
                        do not use loop

 */