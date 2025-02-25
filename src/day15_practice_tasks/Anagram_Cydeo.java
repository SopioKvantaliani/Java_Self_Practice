package day15_practice_tasks;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram_Cydeo {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2) ? "Anagram" : "Not Anagram");



    }
}
