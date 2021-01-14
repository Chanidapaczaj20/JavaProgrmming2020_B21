package Office_Hours.Practice_01_13_2021;

public final class Dog extends Animal{ // final other class can't copy

    public Dog(String name ,String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void speak() { // no need abstract word in the subclass
        System.out.println("Woof Woof");
    }

    public void bark(){ // unique --> interface
        System.out.println(name+" is barking");
    }

    @Override
    protected void play() {
        System.out.println("plays with fetch");
    }

    @Override
    public String toString() {
        return "Dog"+ super.toString();
    }
}
