package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        //Option 1:
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int originalSize = list.size();

        //get the original size of the list to avoid infinite looping
        for (int i = 0; i < originalSize; i++) {
            list.add(list.get(i));
        }
        System.out.println(list);

        //Option 2:
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list2.addAll(list2);
        System.out.println(list2);

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
