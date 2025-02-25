package day16_practice_tasks;

import java.lang.reflect.Array;
import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbccaaaaa";

        List <Character> cha = new ArrayList<>();
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            cha.add(str.charAt(i));
        }

        for (Character each : cha) {
            // Increment the count if the character is already in the map, or initialize it to 1
            charCount.put(each, charCount.getOrDefault(each, 0)+1);
        }

        System.out.println(charCount);
    }
}
