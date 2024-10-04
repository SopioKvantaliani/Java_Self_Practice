package day08_practice_tasks;
import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word");
        String word1 = input.next();

        System.out.println("Enter the second word");
        String word2 = input.next();

        boolean sameLetter =word1.charAt(word1.length()-1)==word2.charAt(0);

        if (sameLetter){
            word2 = word2.substring(1);
        }

        System.out.println(word1+word2);


    }
}
