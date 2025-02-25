package day14_practice_tasks.loop_ppt;

import day14_practice_tasks.device.Iphone;
import day14_practice_tasks.device.Laptop;
import day14_practice_tasks.device.Phone;
import day14_practice_tasks.device.Samsung;

import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for Loop
        System.out.println("1.For Loop ------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println("----------------------------------------------------------");

        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+", ");
        }

        System.out.println();

        //reverse string
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i)+", ");
        }

        System.out.println("\n2. While Loop ----------------------------------------------------------");

        int count = 1;
        while (count<=5){
            System.out.println("Count is "+count);
            count++;
        }

        int num = 1;
        int sum = 0;

        System.out.println();

        while (num <=10){
            sum +=num;
            num++;
        }
        System.out.println("Sum of first 10 number is: "+ sum);

        System.out.println("\n3. Do While Loop ----------------------------------------------------------");

//        Scanner input = new Scanner(System.in);
//        String password;
//
//        do {
//            System.out.println("Enter password: ");
//            password = input.nextLine();
//        }while (!password.equals("java123"));
//
//        System.out.println("Access granted!");

        System.out.println();
        int countdown = 3;

        do {
            System.out.println("Countdown: "+countdown);
            countdown--;
        }while (countdown>0);

        System.out.println("Go!");

        System.out.println("\n4. For each loop / Enhanced Loop ----------------------------------------------------------");

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Iphone("Iphone", "12", "white", 1000));
        phones.add(new Iphone("Iphone", "14", "Silver", 1500));
        phones.add(new Samsung("Samsung", "13", "Black", 2000)) ;

        for (Phone xxxxeach : phones) {
            System.out.println(xxxxeach);
        }


        int [] number = {1, 2, 3, 4, 5};
        for (int each : number) {
            System.out.println(each);
        }

        System.out.println();

        System.out.println("\n4. Nested Loop ----------------------------------------------------------");

        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int num2 = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(num2+" - ");
            num2++;
            for (int j = 0; j < 5; j++) {
                System.out.println("Coordinate: ("+i+", "+j+")");
            }


        }

    }

}
