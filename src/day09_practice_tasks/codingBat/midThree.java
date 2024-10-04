package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class midThree {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(midThree(arr)));

    }

    public static int [] midThree (int [] nums){
        int [] arr = new int[3];

        if (nums.length >=3){

            if(nums.length==3){
                return nums;
            }

        }

        if (nums.length>3){
            arr [0] = nums [(nums.length/2)-1];
            arr [1] = nums [nums.length/2];
            arr [2] = nums [nums.length/2+1];
        }
        return arr;
    }
}
