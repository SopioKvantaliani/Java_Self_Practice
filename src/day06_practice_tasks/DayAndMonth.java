package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        daysInMonth(12);
//        daysInMonth2(3);
    }

    public static void day(int number) {
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");

        }
    }

    public static void monthName(int number) {
        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Number");

        }
    }

    public static void daysInMonth(int number) {
        String days30 = "30 days";
        String days31 = "31 days";
        String month = "";

        if (number<=0 || number>12){
            System.out.println("Invalid Number");
            return;
        }

        if (number == 1) {
            month = "January";
        } else if (number == 2) {
            month = "February";
        } else if (number == 3) {
            month = "March";
        } else if (number == 4) {
            month = "April";
        } else if (number == 5) {
            month = "May";
        } else if (number == 6) {
            month = "June";
        } else if (number == 7) {
            month = "July";
        } else if (number == 8) {
            month = "August";
        } else if (number == 9) {
            month = "September";
        } else if (number == 10) {
            month = "October";
        } else if (number == 11) {
            month = "November";
        } else if (number == 12) {
            month = "December";
        }
        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
            System.out.println(month + " " + days31);
        } else {
            System.out.println(month + " " + days30);
        }
    }

    public static void daysInMonth2 (int number){

        String days30 = "30 days";
        String days31 = "31 days";
        String month = (number==1)? "January" :(number==2)?"February":(number==3)?"March":(number==4)?
                "April":(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                :(number==9)?"September":(number==10)?"October":(number==11)?"November":(number==12)?
                "December":"Invalid NUmber";

        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
            System.out.println(month + " " + days31);
        } else {
            System.out.println(month + " " + days30);
        }


    }
}
