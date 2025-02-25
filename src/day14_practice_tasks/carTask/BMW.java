package day14_practice_tasks.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
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
