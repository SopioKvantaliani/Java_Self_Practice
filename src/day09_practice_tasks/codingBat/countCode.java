package day09_practice_tasks.codingBat;

public class countCode {
    public static void main(String[] args) {
        String str = "cobedcobeb";
        int countCode = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            // Check for "cat"
            if (str.substring(i, i + 4).equals("code")) {
                countCode++;
            }

            if (str.substring(i, i+2).equals("co") && (str.substring(i+3, i+4)).equals("e")){
                countCode++;
            }

        }


        System.out.println(countCode);
}}
