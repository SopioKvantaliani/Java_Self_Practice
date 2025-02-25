package day15_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(
                1, 2, 3, 5
        ));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(
                2, 3, 4
        ));
        // This will remove elements from set1 that are also in set2
        Set<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

        //approach 2

        Set <Integer> difference2 = new LinkedHashSet<>();
        for (int each : set1){
            if (!set2.contains(each)){
                difference2.add(each);
            }
        }

        System.out.println(difference2);


    }
}

/*
Create a class named DifferenceBetweenTwoSets and write a
program that calculates the difference between two
sets of integers (elements in the first set but not in the second)
and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */
