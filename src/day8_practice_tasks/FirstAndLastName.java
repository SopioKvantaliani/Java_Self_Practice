package day8_practice_tasks;
import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstName = input.next().trim().toLowerCase();

        System.out.println("Enter your lastName");
        String lastName = input.next().trim().toLowerCase();

        input.close();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println(firstName+" "+lastName);


    }
}
