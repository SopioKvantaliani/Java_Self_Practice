package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        //Solution 1:
        //n is element; indexOf () compares if elements of value n are same or not. If it's different -> removes;
        //If the index numbers are different this means that multiple of the same value.
        //example: if there're two 5s, each one will have it's own index number;

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        list.removeIf(n -> list.indexOf(n) != list.lastIndexOf(n));  // removes duplicates
        System.out.println(list);

        //Solution 2:
        //i is element;
        //frequency() checks how many times we have element i in the list, if it is >1 && their index numbers ar not the same.
        //It will be removed if the condition is true.

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        list2.removeIf(i -> Collections.frequency(list2, i) > 1 && list2.indexOf(i) != list2.lastIndexOf(i));

        System.out.println(list2);



    }
}

/*
9. Create a class called UniqueElements and
   write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
 */