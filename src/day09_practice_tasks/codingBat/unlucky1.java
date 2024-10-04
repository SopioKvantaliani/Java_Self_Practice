package day09_practice_tasks.codingBat;

public class unlucky1 {
    public static void main(String[] args) {

        int [] arr = {1, 1, 1, 3, 1};
        System.out.println(unlucky1(arr));

    }


    public static boolean unlucky1 (int [] nums) {

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]==1 && nums [i+1]==3){
                return true;
            }
        }
        return false;

    }
}
