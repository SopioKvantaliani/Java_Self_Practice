package day8_practice_tasks;

public class CodingBat_hasBad {
    public static void main(String[] args) {

        System.out.println(hasBad("bad"));

        String a="";
        String b ="";

        if(a.length()==0 && b.length()==0) {
        }
    }

    public static boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}



