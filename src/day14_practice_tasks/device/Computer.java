package day14_practice_tasks.device;

public class Computer extends Device{


    public Computer(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel()+" turns on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel()+" turns off");

    }
}
