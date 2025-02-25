package day13_practice_tasks.phone_task;

public class Iphone extends Phone {

    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void faceTime (long phoneNumber){
        System.out.println("face-timing with the number "+phoneNumber);
    }

}
