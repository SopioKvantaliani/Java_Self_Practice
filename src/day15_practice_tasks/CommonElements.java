package day15_practice_tasks;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        Set <Integer> list1 = new HashSet<>(Arrays.asList(
                10, 8, 11, 20, 5, 0
        ));

        Set<Integer> list2 = new HashSet<>(Arrays.asList(
                30, 0, 20, 40, 50, 10, 60
        ));

        //method find common elements
        Set <Integer> commondElements = findCommonElements(list1, list2);
        System.out.println(commondElements);





    }

    public static Set <Integer> findCommonElements (Set <Integer> set1, Set <Integer> set2){
        Set <Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);// Keeps only elements that are present in both sets
        return commonElements;
    }
}

/*

3. Create a class named CommonElements and write a
program that identifies the common elements in two
given sets of integers and returns a third set containing
these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */
