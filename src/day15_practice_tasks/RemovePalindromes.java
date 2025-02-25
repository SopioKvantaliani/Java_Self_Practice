package day15_practice_tasks;

import java.util.*;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

//        list.replaceAll(String::toLowerCase);
        List <String> reversed =new ArrayList<>();


        for (int i = list.size()-1; i >=0; i--) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j>=0 ; j--) {
                    reverse +=str.toLowerCase().charAt(j);

            }
            reversed.add(reverse);
        }

        list.removeAll(reversed);

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