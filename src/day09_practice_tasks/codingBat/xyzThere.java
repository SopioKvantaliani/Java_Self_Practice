package day09_practice_tasks.codingBat;

public class xyzThere {
    public static void main(String[] args) {

        System.out.println(xyzThere("abc.xyzxyz"));

    }

    public static boolean xyzThere(String str) {

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("xyz")){
                if (i==0 || str.charAt(i-1)!='.'){
                    return true;
                }
            }
        }

            return false;
    }
}
