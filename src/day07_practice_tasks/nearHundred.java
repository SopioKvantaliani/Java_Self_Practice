package day07_practice_tasks;

public class nearHundred {
    public static void main(String[] args) {

        System.out.println(nearHundred(89));


    }

    public static boolean nearHundred (int n){
        if (n>=90 && n<=110 || n>=190 && n<=210){
            return true;
        }else {
            return false;
        }
    }
}
