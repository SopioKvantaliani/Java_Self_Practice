package day15_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes_CYDEO {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));


        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String current = it.next().toLowerCase();
            //here you can call palindrome method

            StringBuilder sb = new StringBuilder(current);
            sb.reverse();

            if (current.equals(sb.toString())){
                it.remove();
            }
        }

        System.out.println(list);

    }

}

/*
6. Create a class named RemovePalindromes and
write a program that removes all palindrome
strings from a given list of strings. The removal
should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */