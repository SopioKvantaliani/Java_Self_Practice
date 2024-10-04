package day05_practice_tasks;

public class FactorialNumber {
    public static void main(String[] args) {

        int number = 5;
        int factorialNumber=1;

        for (int i = 1; i <=number; i++) {
            factorialNumber *=i;

        }
        System.out.println(factorialNumber);
    }
}
