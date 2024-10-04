package day8_practice_tasks;
import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word");
        String word1 = input.next();

        System.out.println("Enter the second word");
        String word2 = input.next();

        input.close();

        //OPTION1 with +
        word1 = word1.substring(1)+(word2.substring(1));

        //OPTION2 with contact()
        word2 = word1.substring(1).concat(word2.substring(1));

        System.out.println(word1);
        System.out.println(word2);



    }
}
