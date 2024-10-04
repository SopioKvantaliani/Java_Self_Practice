package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int first = nums [0];
        int last = nums [nums.length-1];

        int [] modified = new int[nums.length];


        if (first>last){
            for (int i = 0; i < nums.length; i++) {
                modified [i] = first;
            }
        }else {
            for (int i = 0; i < nums.length; i++) {
                modified [i] = last;
            }
        }

        System.out.println(Arrays.toString(modified));

    }

    public static int [] maxValue (int [] nums){
        int max = Math.max(nums[0], nums[2]);
        nums [0] = max;
        nums [1] = max;
        nums [2] = max;
        return nums;
    }

}
