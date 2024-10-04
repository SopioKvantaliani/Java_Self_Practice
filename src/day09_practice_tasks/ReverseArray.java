package day09_practice_tasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int [] reverse = new int[array.length];
        int [] reverse2 = new int[array.length];

        for (int i = array.length - 1, j=0;  i >= 0; i--, j++) {
            reverse [j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        for (int i = 0; i < array.length; i++) {
            reverse2 [i]= array [array.length-1-i];
        }
        System.out.println(Arrays.toString(reverse2));


    }
}
