package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class plusTwo {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 6};
        int [] b = {4, 5, 6};


        int [] newArray = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            newArray [i] = a [i] ;
            newArray[i+a.length] = b [i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
