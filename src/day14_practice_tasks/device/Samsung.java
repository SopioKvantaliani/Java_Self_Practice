package day14_practice_tasks.device;

public class Samsung extends Phone implements Downloadable, AndroidApps{


    public Samsung(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getModel() +" downloads Apps");
    }


}
