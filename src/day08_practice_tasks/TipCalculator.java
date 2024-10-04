package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to split the bill? yes or no");
        String split = input.next().toLowerCase();

        System.out.println("Enter the number of people");
        int people = input.nextInt();

        System.out.println("What is the check amount");
        double check = input.nextDouble();

        System.out.println("What was the service quality? - excellent, great, good, fair, poor");
        String quality = input.next().toLowerCase();

        input.close();

        double tip = switch (quality) {
            case "excellent" -> 0.25;
            case "great" -> 0.20;
            case "good" -> 0.15;
            case "fair" -> 0.10;
            case "poor" -> 0.05;
            default -> 0.20;
        };


        double tipAmount = check * tip;
        double totalPay = check + tipAmount;


        System.out.println("Number of people entered " + people);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + tipAmount);

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Total per person: " + totalPay / people);
            System.out.println("Tip per person: " + tipAmount / people);
        }

    }
}
