package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number");
        Long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();


        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state name");
        String state = input.next();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your street name");
        String street = input.nextLine();
        input.close();

        System.out.println();
        System.out.println("Full name: " + fullName + "\nAge: " + age + "\nGender: " + gender + "\nPhone Number: "
                + phoneNumber + "\nSchool: " + schoolName + "\nAddress: \n\t\t" + buildingNumber + " " + street + "\n\t\t" + city + "," + state + zipCode);




    }
}
