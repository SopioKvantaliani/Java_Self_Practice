package day09_practice_tasks.codingBat;

public class catDog {
    public static void main(String[] args) {
        String str = "catdog";


        str = str.replaceAll(" ", "");
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            // Check for "cat"
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            // Check for "dog"
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }

        if (countCat == countDog) {
            System.out.println(true);
        }
    }}