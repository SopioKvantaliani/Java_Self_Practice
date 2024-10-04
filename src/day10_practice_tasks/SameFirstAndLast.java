package day10_practice_tasks;

import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class SameFirstAndLast {
    public static void main(String[] args) {

        //OPTION 1:
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        for (int i = 0; i < list.size(); i++) {
            String each = list.get(i).toLowerCase();
            if (each.charAt(0)==each.charAt(each.length()-1)){
                list.remove(i);
                //after removing an element at index i, the next element shifts into the position of i.
                //We need to decrease i to check all the elements and not to skip them.
                i--;
            }
        }
        System.out.println(list);

        //OPTION 2:
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list2.removeIf(p-> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println(list2);

    }}
/*
11. Create a class called SameFirstAndLast and write a
program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements
    if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]

 */
