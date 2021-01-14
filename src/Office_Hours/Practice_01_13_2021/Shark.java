package Office_Hours.Practice_01_13_2021;

public final class Shark extends Animal{
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("DuDuDu");
    }

    @Override
    protected void play() {
        System.out.println("plays with people");
    }

    public void eatHuman(){
        System.out.println("Sharks eat human");
    }

    @Override
    public String toString() {
        return "Shark"+super.toString();
    }


}
// how do  you determine? ---> depends on the object