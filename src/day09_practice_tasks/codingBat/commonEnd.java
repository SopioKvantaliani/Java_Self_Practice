package day09_practice_tasks.codingBat;

public class commonEnd {
    public static void main(String[] args) {

        int [] num1 = {1, 2,3};
        int [] num2 = {7, 3};
        System.out.println(commonEnd(num1, num2));

    }


    public static boolean commonEnd (int [] a, int [] b){

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[0]==b[0] || a[a.length-1]==b[b.length-1] ){
                    return true;
            }
        }

        }
        return false;

    }
}
