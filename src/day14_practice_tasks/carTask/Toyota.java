package day14_practice_tasks.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel()+ " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving");
    }
}
