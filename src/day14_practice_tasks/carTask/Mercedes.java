package day14_practice_tasks.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+ " has a autoPark function");

    }

    @Override
    public void start() {
        System.out.println(getModel()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+ " is driving");
    }
}
