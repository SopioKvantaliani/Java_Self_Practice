package day8_practice_tasks;

public class CodingBat_withoutEnd2 {
    public static void main(String[] args) {

        String str ="abaso";

        if (str.length()<2){
            System.out.println("");
            return;
        }

        str = str.substring(1, str.length()-1);
        System.out.println(str);


    }
}
