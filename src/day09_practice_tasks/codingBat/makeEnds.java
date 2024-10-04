package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class makeEnds {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeEnd(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeEnd(new int[]{})));

    }

    public static int [] makeEnd (int [] nums){
        if (nums.length==0){
            return nums;
        }
        return new int[]{nums[0], nums[nums.length-1]};
    }
}
