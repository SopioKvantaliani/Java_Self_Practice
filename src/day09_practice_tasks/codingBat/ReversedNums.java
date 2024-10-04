package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class ReversedNums {

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        int [] reversed = new int[nums.length];
        for (int i = nums.length - 1, j=0;  i >= 0; i--, j++) {
            reversed [j] = nums [i];
        }

        System.out.println(Arrays.toString(reversed));
    }


}
