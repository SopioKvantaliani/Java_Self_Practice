package day15_practice_tasks;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "xyze";
        String str2 = "xyzd";

        Set <Character  > set1 = new HashSet<>();
        Set <Character> set2 = new HashSet<>();

        for (char c: str1.toCharArray()) {
            set1.add(c);
        }

        for (char c: str2.toCharArray()) {
            set2.add(c);
        }

        // Compare the two sets
        System.out.println(set1.equals(set2));


    }
}

/*
5. Create a class named Anagram and write a program
that checks if two strings are anagrams of each other,
considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */