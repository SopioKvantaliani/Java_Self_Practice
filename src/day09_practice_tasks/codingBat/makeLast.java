package day09_practice_tasks.codingBat;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {

        int [] numbers = {4, 5, 6};
        int lastNum = numbers[numbers.length-1];
        int [] modified = new int[numbers.length*2];

        modified [modified.length-1] = lastNum;

        System.out.println(Arrays.toString(modified));



    }
}
