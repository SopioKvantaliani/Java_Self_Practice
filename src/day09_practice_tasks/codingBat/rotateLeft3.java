package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class rotateLeft3 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(rotateLeft(nums)));

    }

    public static int [] rotateLeft(int[] arr) {
        if (arr.length == 0) return null;

        int first = arr[0];  // Save the first element

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;  // Place the first element at the end
        return arr;
    }

}