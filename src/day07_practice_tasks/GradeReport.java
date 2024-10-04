package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = input.nextInt();
        input.close();
        String result = "Your grade is ";

        if (score < 0 || score > 100) {
            System.err.println("Invalid Score "+score+". Needs to be between 0-100");
            return;
        }

        if (score >= 90) {
            result += "A";
        } else if (score >= 80) {
            result += "B";
        } else if (score >= 70) {
            result += "C";
        } else if (score >= 60) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);
    }
}
