package day47_Abstraction.ShapeTasks;

public abstract class Shape { // not concrete

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area(); // what it is "matter, how it's done
    public abstract double perimeter();

}
