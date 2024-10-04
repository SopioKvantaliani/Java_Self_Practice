package day09_practice_tasks;

import java.util.Arrays;
import java.util.Locale;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classmates = {"Inga Adanaia", "Roza Kasadze", "Madina Kapba", "Maka Gagua", "Givi Jvarsheishvili"};


        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];
            String reversed = "";

            for (int j = eachName.length() - 1; j >= 0; j--) {
                reversed += eachName.toLowerCase().charAt(j)+"" ;
            }
            System.out.println(reversed);
        }

        System.out.println("=================================");


        for (String eachClassmate : classmates) {
            String reversed = "";

            for (int i = eachClassmate.length() - 1; i >= 0; i--) {
                reversed += eachClassmate.toLowerCase().charAt(i);
            }
            System.out.println(reversed);
        }


    }

}

/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */
