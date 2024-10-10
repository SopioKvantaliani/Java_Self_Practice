package day10_practice_tasks.CodingBat;

import java.util.Arrays;

public class makeMiddle {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 4, 9};
        System.out.println(Arrays.toString(makeMiddle(nums)));
    }

    public static int [] makeMiddle (int [] nums){
        int [] num2 = new int[2];
            num2[0] = nums [nums.length/2-1];
            num2[1] = nums [nums.length/2];
        return num2;
    }
}
