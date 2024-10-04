package day06_practice_tasks;

public class DayAndMonth2 {
    public static void main(String[] args) {

        day(7);
        System.out.println(monthName(4));

        daysInMonth(12);

    }

    public static void day(int n) {
        String result = switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Number";

        };
        System.out.println(result);

    }

    public static String monthName(int n) {
        String result;

        if (n == 1) {
            result = "January";
        } else if (n == 2) {
            result = "February";
        } else if (n == 3) {
            result = "March";
        } else if (n == 4) {
            result = "April";
        } else if (n == 5) {
            result = "May";
        } else if (n == 6) {
            result = "June";
        } else if (n == 7) {
            result = "July";
        } else if (n == 8) {
            result = "August";
        } else if (n == 9) {
            result = "September";
        } else if (n == 10) {
            result = "October";
        } else if (n == 11) {
            result = "November";
        } else if (n == 12) {
            result = "December";
        } else {
            result = "Invalid Number";
        }
        return result;
    }

    public static void daysInMonth(int n) {
        int days = 0;
        switch (n) {
            case 2:
                days = 28;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
            default:
                return; //if number is invalid we want the method to stop executing lin 74;
        }

        System.out.println(monthName(n) +" has " +days + " days ");
    }
}
