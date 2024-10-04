package day09_practice_tasks.codingBat;

public class countHi {
    public static void main(String[] args) {
        String str = "abc hihi ho";
        String str2 = str.replaceAll(" ", "");
        int count = 0;

        for (int i = 0; i < str2.length(); i++) {

            if (str2.charAt(i)=='h'&& str2.charAt(i+1)=='i'){
                count++;
            }
        }
        System.out.println(count);

    }
}
