package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveLetters {
    public static void main(String[] args) {

        ArrayList <Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));
        ArrayList <Character> list1= new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!Character.isLetter(list.get(i))){
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);

    }
}

/*
10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']
 */