package day08_practice_tasks;

public class CodingBat_middleThree {
    public static void main(String[] args) {

        String str = "sbadxx";
        String bad = "bad";

        String result = "";
        for (int i = 0; i < bad.length(); i++){
            for (int j = 0; j < str.length(); j++) {
                if (bad.charAt(i)==str.charAt(j)) {
                    result += str.charAt(j);
                } else {
                    continue;
                }
            }
        }

        System.out.println(result);
    }

    public static String middleThree(String str) {
        int length = str.length() / 2; //Ca ndy
        return str.substring(length - 1, length + 2);

    }

}
