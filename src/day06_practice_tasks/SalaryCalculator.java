package day06_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println(salary(45, 40));
    }

    public static double salary (double hourlyRate, int weeklyHours){
        double salary = hourlyRate*weeklyHours*52; //52 weeks in a year.
        return salary;
    }
}
