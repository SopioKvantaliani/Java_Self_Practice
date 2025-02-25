package day14_practice_tasks.device;

public class Phone extends Device {


    public Phone(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " turns on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " turns off");
    }

    public void call (Long phoneNum){
        System.out.println("Calling to phoneNumber "+phoneNum);
    }

    public void text (Long phoneNum){
        System.out.println("Texting to phoneNumber "+phoneNum);
    }


}
