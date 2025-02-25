package day14_practice_tasks.carTask;

public class Audi extends Car implements AutoPark{


    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() +" has autoPark function");
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
