package day14_practice_tasks.carShop;

import day14_practice_tasks.carTask.Audi;
import day14_practice_tasks.carTask.Car;
import day14_practice_tasks.carTask.Honda;
import day14_practice_tasks.carTask.Tesla;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CarShop {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };

        Car[] cars1 = new Car[5];
        cars1[0] = new Audi("Audi", 2020, 50000, "Silver");
        System.out.println(Arrays.toString(cars1));

        System.out.println("------------------------");

        for (Car car : cars) {
            int year = car.getYear();
            boolean forHonda = car instanceof Honda && year >= 2010 && year <= 2011;
            boolean forAudi = car instanceof Audi && year >= 2015 && year <= 2019;
            boolean forTesla = car instanceof Tesla && year >= 2015 && year <= 2016;

            if (forHonda || forAudi || forTesla){
                System.out.println(car);
            }
        }

        System.out.println("------------------------");

        Car highestPrice = cars[0];
        Car lawestPrice = cars[0];

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > highestPrice.getPrice()) {
                highestPrice = cars[i];
            }

            if (cars[i].getPrice() < lawestPrice.getPrice()) {
                lawestPrice = cars[i];
            }
        }
        System.out.println(highestPrice);
        System.out.println(lawestPrice);

        System.out.println("------------------------------");

        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car each : cars) {
            if (each instanceof Tesla) {
                teslaCars.add((Tesla) each);
            }
        }
        System.out.println(teslaCars);

    }
}
