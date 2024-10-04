package day8_practice_tasks;
import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        input.close();

        if (word.charAt(0)=='x'){
            word = "a"+word.substring(1);
        }

        System.out.println(word);


    }

}
