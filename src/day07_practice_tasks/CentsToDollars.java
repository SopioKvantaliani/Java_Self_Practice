package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int inputCents = input.nextInt();
        input.close();

        int count = 0;
        int leftCents = 0;

        for (int i = 100; i <= inputCents; i += 100) {
            count++;
            leftCents = inputCents % 100;
        }

        if (inputCents<100){
            System.out.println(inputCents + " cents is equal to 0 dollars and " +  inputCents + " cents");
            return;
        }

        System.out.println(inputCents + " cents is equal to " + count + " dollars and " + leftCents + " cents");

    }
}
