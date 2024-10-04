package day06_practice_tasks;

public class OddAndEven {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isOdd2(8));
        System.out.println(isEven(8));
    }

    public static boolean isOdd(int number) {

        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd2 (int n){
        return n%2==1;
    }

    public static boolean isEven (int n){
        return n%2==0;
    }

}
