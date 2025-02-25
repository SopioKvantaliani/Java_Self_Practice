package day14_practice_tasks.device;

public class Iphone extends Phone implements Downloadable, AppleApps {


    public Iphone(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getModel() + " downloads Apps");
    }
}
