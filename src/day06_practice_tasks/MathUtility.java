package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {

        System.out.println(calculate(10, '&', 5));
        System.out.println(calculate(10, '*', 12.3));
        System.out.println(square(10.0));
        System.out.println(cube(12));
    }

    public static double calculate(double num1, char operator, double num2) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            default -> 0;
        };
    }

    public static int calculate(int num1, char operator, int num2) {
            //we called "calculate" method.
            return  (int) calculate((double) num1, operator, num2);
    }

    public static double square(int number) {
        return number *= number;
    }

    public static double square(double number) {
        return number *= number;
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static double cube(double number) {
        return number * number * number;
    }

}
