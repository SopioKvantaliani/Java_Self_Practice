package day17_practice_tasks_codingbat;

public class CountZY {
    public static void main(String[] args) {


        String str = "day fez";
        System.out.println(countYZ(str));

    }
    public static int countYZ (String str){
        int count= 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if ((current=='y' || current=='z') && (i==str.length()-1 || !Character.isLetter(str.charAt(i+1)))){
                count++;
            }

        }

        return count;
}}
