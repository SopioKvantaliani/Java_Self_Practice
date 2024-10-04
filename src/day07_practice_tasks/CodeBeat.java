package day07_practice_tasks;

public class CodeBeat {
    public static void main(String[] args) {

        System.out.println(posNeg3(-1, -1, false)); //true //false
        System.out.println(posNeg3(1, -1, true)); //true
        System.out.println(posNeg3(-1, 1, false));

    }


    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0); //false && true = false
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
            //false && false->false || true && true->true -->true
        }
    }

    public static boolean posNeg2(int a, int b, boolean negative) {
        if (a < 0 && b < 0 && negative) {
            return true;
        } else if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return !negative; // One number is negative and the other is positive, only when negative is false.
        } else {
            return false; // Default case if no conditions match.
        }
    }

    public static boolean posNeg3(int a, int b, boolean isNegative) {

        if (a < 0 && b < 0 && isNegative==true) {
           return true;
        } else if ((a < 0 && b > 0 || a > 0 && b < 0) && isNegative==true) {
            return true;
        }else {
            return false;
        }


    }

}

