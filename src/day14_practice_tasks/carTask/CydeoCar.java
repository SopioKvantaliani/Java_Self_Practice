package day14_practice_tasks.carTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String model, int year, double price, String color) {
        super("Cydeo Car", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println("Drive by AI");
    }

    @Override
    public void autoPark() {
        System.out.println("Park in the sky");
    }

    @Override
    public void fly() {
        System.out.println("In Fly mode");
    }

    @Override
    public void start() {
        System.out.println("Start by thinking");
    }

    @Override
    public void drive() {
        System.out.println("Start self drive");
    }
}
