package day14_practice_tasks.carTask;

public class Nio extends Car implements AutoPilot {

    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel()+ " has selfDrive functionality");
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+" has autoPark functionality");
    }

    @Override
    public void start() {
        System.out.println(getModel()+ " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+ " is driving");
    }
}
