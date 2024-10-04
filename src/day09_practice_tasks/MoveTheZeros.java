package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {

        int [] numbers = {10, 0, 5, 0, 1, 0};
        Arrays.sort(numbers);
        int [] reversed = new int[numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed [j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));

    }

}

