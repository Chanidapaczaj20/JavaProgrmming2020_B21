package day35_CustomClass;

public class CybertekSchool {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setInfo("Caitlin",20,'F',"CBT01");
        student1.getInfo();
        student1.study("Java");
        student1.sleep(false);
        student1.sport("Badminton");
        System.out.println();

        student2.setInfo("Christan",22,'M',"CBT02");
        student2.getInfo();
        student2.study("JavaScript");
        student2.sleep(true);
        student2.sport("Basketball");
        System.out.println();

        student3.setInfo("Christan",21,'F',"CBT03");
        student3.getInfo();
        student3.study("Python");
        student3.sleep(true);
        student3.sport("Tabletennis");
        System.out.println();




    }


}
