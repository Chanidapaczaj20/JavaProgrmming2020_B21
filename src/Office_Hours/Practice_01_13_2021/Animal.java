package Office_Hours.Practice_01_13_2021;

public abstract class Animal { // ONLY FOR things that are commom for all the sub classes
    public String name, size;
    public final String breed; // final can't reassign later on
    public final char gender;
    public int age;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public Animal(String name, String breed, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    protected abstract void speak();
    protected abstract void play();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
