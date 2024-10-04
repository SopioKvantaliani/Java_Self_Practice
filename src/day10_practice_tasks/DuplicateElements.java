package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int originalSize = list.size();

        //get the original size of the list to avoid infinite looping
        for (int i = 0; i < originalSize; i++) {
            list.add(list.get(i));
        }
        System.out.println(list);
    }
}
/*
3. Create a class called DuplicateElements and write a program
with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */
