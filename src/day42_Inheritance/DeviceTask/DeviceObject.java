package day42_Inheritance.DeviceTask;

public class DeviceObject {

    public static void main(String[] args) {

        TV tv = new TV("Samsung","LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();

        Phone phone = new Phone("iphone","12 Pro Max",1200);
        phone.turnOn();
        phone.turnOff();
        phone.call(911);
        phone.text(123456);

        System.out.println(TV.hasBattery);



    }



}
