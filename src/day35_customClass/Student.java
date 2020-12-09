package day35_customClass;

public class Student {

    public String name;
    public int age;
    public char gender;
    public String ID;

    public void setInfo(String studentName,int studentAge,char studentGender,String studentID){
        name = studentName;
        age = studentAge;
        gender = studentGender;
        ID = studentID;
    }

    public void getInfo(){
        System.out.println("==================================================================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + ID);
        System.out.println("==================================================================");
    }
    public void study(String subject){
        System.out.println(name+" studies "+subject);
    }

    public void sleep(boolean sleeps){
        System.out.println(name+" likes to sleep during the class:  "+sleeps);
    }

    public void sport(String sportName){
        System.out.println(name+"'s favorite sport is "+ sportName);
    }
}
/*
Create teh following custom classes:

    1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep
                ...

 */
