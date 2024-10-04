package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        System.out.println(list.set(0, 5));
//        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            int num = 0;
            if (list.get(i)%2!=0){
                list.set(i,list.get(i)*2);
//                Collections.replaceAll(list, list.get(i),list.get(i)*2);
            }
        }
        System.out.println(list);

    }
}
/*
1. get() returns value
2. set() asks index, value;
3. replaceAll() asks only values, while set() asks index number and value, both.
4.
 */

/*
6. Create a class called MultiplyOddNumbers and write a
program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]
 */