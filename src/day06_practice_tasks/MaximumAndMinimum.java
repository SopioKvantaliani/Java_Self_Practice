package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        System.out.println(max(22, 12));
        System.out.println(min(2.2, 6.6));
        System.out.println(max(2.4, 5.5));
        System.out.println(min(5, 9));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;

    }

    public static int min(int num1, int num2) {
        int result = (num1 < num2) ? num1 : num2;
        return result;
    }

    public static double min(double num1, double num2) {
        double result = (num1 < num2) ? num1 : num2;
        return result;
    }
}
