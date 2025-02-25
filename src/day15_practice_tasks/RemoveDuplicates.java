package day15_practice_tasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<>(Arrays.asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        Set<Integer> unique = new TreeSet<>(numbers); //unique and sorted
        System.out.println(unique);

        List <Integer> num2 = new ArrayList<>(Arrays.asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        List<Integer> unique2 = new ArrayList<>();

        for (Integer each : num2) {
            if (!unique2.contains(each)){
                unique2.add(each);
            }
        }
        Collections.sort(unique2);
        System.out.println(unique2);

    }
}

/*
1. Create a class named RemoveDuplicates
and write a program that takes a list of integers,
removes any duplicate values, and returns
the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */
