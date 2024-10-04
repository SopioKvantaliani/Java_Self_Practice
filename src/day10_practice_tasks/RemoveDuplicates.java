package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //Option 1: Removes all the duplicates
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer each : list3) {
            if (!uniqueList.contains(each)){
                uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);


    }
}



/*
8. Create a class called RemoveDuplicates and write a
program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */