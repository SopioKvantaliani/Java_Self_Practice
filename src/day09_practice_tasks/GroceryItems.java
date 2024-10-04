package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {
    public static void main(String[] args) {

        System.out.println("-----------------Printing each element----------------");
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        String [][] modified = new String[items.length] [];

        for (String[] eachArray : items) {
            for (String eachItem : eachArray) {
                System.out.print(eachItem+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------Reverse Order----------------");

        for (String[] eachArray : items) {
            for (int i = eachArray.length - 1;   i >= 0; i--) {
                System.out.print(eachArray[i]+"\t");
            }
            System.out.println();

        }

        System.out.println("-----------------Reverse Rows----------------------------");


        for (int i = items.length - 1; i >= 0; i--) { //reversing 2Dimensional array
            for (String eachItem : items[i]) { //we took eachArray as a String
                System.out.print(eachItem+"\t");
            }
            System.out.println();
        }
    }
}

/*
    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado
 */
