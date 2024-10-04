package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        input.close();
        double area = 3.14 * (radius * radius); //Math.PI method
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The area of the Circle is -> "+area);
        System.out.println("The perimeter of the Circle is -> "+perimeter);
    }

}
