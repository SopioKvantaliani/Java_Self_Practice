package day09_practice_tasks.codingBat;

public class doubleChar {
    public static void main(String[] args) {
        String str = "aabb";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i)+""+str.charAt(i);
        }

        System.out.print(result);






    }
}
