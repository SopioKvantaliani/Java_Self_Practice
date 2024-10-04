package day07_practice_tasks;
import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.println("enter the product name");
        String productName1 = input.nextLine();

        System.out.println("Enter the price of "+productName1);
        double price1 = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your firstname");
        String firstName = input.next();

        orderOutput(productName1, price1, quantity, firstName);

        input.close();



    }
    public static void  orderOutput(String productName, double price, int quantity, String firsName){
        System.out.println(firsName+", your order for "+ quantity+ " "+ productName +
                " has been placed. Your total is "+price);
    }
}
