package day14_practice_tasks.carTask;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
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
