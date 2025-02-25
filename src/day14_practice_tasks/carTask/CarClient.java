package day14_practice_tasks.carTask;

import java.util.ArrayList;

public class CarClient {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW2", 2010, 41000, "White");
        Honda honda = new Honda("HondaCer", 2022, 45000, "Red");
        Mercedes mercedes = new Mercedes("Mercedes Sedan", 2022, 50000, "Blue");
        Nio nio = new Nio("Nio El5", 2024, 55000, "Orange");
        Tesla tesla = new Tesla("Y20", 2023, 55000, "Red");


//      bmw.setColor("");
        ArrayList <Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(honda);
        cars.add(mercedes);
        cars.add(nio);
        cars.add(tesla);

        for (Car each : cars) {
            System.out.println(each);
        }

        bmw.drive();
        bmw.start();
        honda.drive();
        honda.start();
        honda.stop();
        mercedes.autoPark();
        mercedes.drive();
        mercedes.start();
        nio.autoPark();
        nio.drive();
        nio.selfDrive();
        tesla.autoPark();
        tesla.drive();
        tesla.selfDrive();
        tesla.start();


    }
}
