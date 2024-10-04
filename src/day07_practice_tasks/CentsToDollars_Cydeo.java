package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars_Cydeo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents: ");
        int cents = input.nextInt();
        input.close();

        String result = cents + " cents is equal to ";
        int dollars = cents / 100;
        cents %= 100;
        result += dollars + " dollars and " + cents + " cents";
        System.out.println(result);


    }
}
