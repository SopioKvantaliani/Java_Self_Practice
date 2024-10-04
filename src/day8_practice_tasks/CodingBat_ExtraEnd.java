package day8_practice_tasks;

public class CodingBat_ExtraEnd {
    public static void main(String[] args) {

        String str = "Hello"; //lololo

        int str1 = str.length();
        String str2 = "";

        for (int i = 0; i < str1; i++) {
            if (str1 - i == 2 || str1 - i == 1) {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2 + str2 + str2);

        String end = str.substring(str.length()-3);
        System.out.println(end);

    }
}
