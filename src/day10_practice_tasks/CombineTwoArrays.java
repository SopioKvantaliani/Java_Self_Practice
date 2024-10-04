package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        //OPTION 1:
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(arr1));
        arrayList.addAll(Arrays.asList(arr2));

        System.out.println(arrayList);

        //OPTION 2:
        ArrayList<String> arrayList1 = new ArrayList<>();
        int total = arr1.length + arr2.length; //number of iteration

        for (int i = 0; i < total; i++) {
            if (i < arr1.length) {
                arrayList1.add(arr1[i]);
            } else {
                arrayList1.add(arr2[i - arr1.length]); //we need to minus first arr.length to add arr2 from index 0;
            }
        }

        System.out.println(arrayList1);


    }
}

/*
4. Create a class called CombineTwoArrays 
and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
