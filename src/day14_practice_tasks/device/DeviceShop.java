package day14_practice_tasks.device;

import java.util.Locale;

public class DeviceShop {
    public static void main(String[] args) {

        Computer computer = new Computer("Samsung", "M30", "Silver", 3000);
        Desktop desktop = new Desktop("Lg", "UI70", "Red", 2500);
        Google google = new Google("Google", "789", "Silver", 3200);
        Laptop laptop = new Laptop("Apple", "Book Mac Air", "Pink", 5500);

        computer.turnOff();
        computer.turnOn();

        System.out.println(desktop.getColor());
        google.downloadApp();
        System.out.println(google.getBrand().toLowerCase());
        laptop.setColor("Purple");

        System.out.println(laptop);

    }
}
