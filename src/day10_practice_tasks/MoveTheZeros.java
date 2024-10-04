package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {

        //OPTION 1:
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        int numOfZero1 = Collections.frequency(list,0);

        for (int i = 0; i < numOfZero1; i++) {
            Integer zero = 0; //Wrapper class Integer, because we pass remove() not index, but element;
            list.remove(zero);
            list.add(0);
        }

        System.out.println(list);

        //OPTION 2:
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        Collections.sort(list2);
        Collections.rotate(list2, 4);
        System.out.println(list2);

        //OPTION 3:
        ArrayList <Integer> list3 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        int numOfZero = Collections.frequency(list3,0);
        list3.removeAll(Arrays.asList(0));

        for (int i = 0; i < numOfZero; i++) {
            list3.add(0);
        }
        System.out.println(list3);

    }
}

/*
5. Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]

 */
