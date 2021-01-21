package day50_Polymorphism.PhoneTask;

public final class Iphone extends Phone implements AppleApps{

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if (price>1500){
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than $1500");
        }
    }


    @Override
    public void text() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from " +AppStoreName);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                '}';
    }
}
/*

 */