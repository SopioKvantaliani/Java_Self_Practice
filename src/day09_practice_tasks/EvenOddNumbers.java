package day09_practice_tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int countEven = 0;
        int countOdd = 0;

        for (int each : array) {
            if (each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("The array has "+countOdd+" odd numbers and "+countEven+" numbers.");

    }
}

/*
3. Create a class named EvenOddNumbers and write a program
that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */