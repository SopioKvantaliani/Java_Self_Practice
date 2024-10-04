package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(5, 6, 9, 1, 2));

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max=list.get(i); //assign value
            }

            if (list.get(i)<min ){
                min = list.get(i);
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}

/*
7. Create a class called MaximumAndMinimumNumbers and write a
program with the following specifications:
   7.1 Given an ArrayList of integers, find and display
   the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */